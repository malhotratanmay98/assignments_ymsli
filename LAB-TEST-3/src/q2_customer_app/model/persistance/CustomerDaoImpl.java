package q2_customer_app.model.persistance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import q2_customer_app.model.exceptions.CustomerNotFoundException;


public class CustomerDaoImpl implements CustomerDAO {
	
private Connection connection;
	
	public CustomerDaoImpl() {
		connection=ConnectionFactory.getConnection();
	}

	@Override
	public void addCustomer(Customer customer) {
		try {
			PreparedStatement pstmt = connection.prepareStatement("insert into customer(id,name,address,phone,DOB)values(?,?,?,?,?)");
			pstmt.setInt(1, customer.getId());
            pstmt.setString(2, customer.getName());
            pstmt.setString(3, customer.getAddress());
            pstmt.setString(4, customer.getPhone());
            pstmt.setString(5, customer.getDob());
            
            pstmt.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

	@Override
	public Customer getById(int id) throws CustomerNotFoundException {
		
		Customer tempCustomer=null;
        try {
            PreparedStatement pstmt=connection.prepareStatement("select * from book where id=?");
            pstmt.setInt(1, id);
            ResultSet rs=pstmt.executeQuery();
            if(rs.next()) {
                tempCustomer=new Customer(rs.getInt(1),
                        rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
            }else
                throw new CustomerNotFoundException("Customer with id ="+id +" is not found");

        }catch(SQLException ex) {
            ex.printStackTrace();
        }
        return tempCustomer;
	}

}
