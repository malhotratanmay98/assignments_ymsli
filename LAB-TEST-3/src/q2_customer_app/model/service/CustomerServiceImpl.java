package q2_customer_app.model.service;


import q2_customer_app.model.exceptions.CustomerNotFoundException;
import q2_customer_app.model.persistance.Customer;
import q2_customer_app.model.persistance.CustomerDAO;
import q2_customer_app.model.persistance.CustomerDaoImpl;

public class CustomerServiceImpl implements CustomerService {

	//service layer is dependent on Dao so create Dao dependency
			private CustomerDAO customerDao;
			
			
			
	public CustomerServiceImpl() {
				
			customerDao = new CustomerDaoImpl();
			}

	@Override
	public void addCustomer(Customer customer) {
		
		customerDao.addCustomer(customer);
	}

	@Override
	public Customer getById(int id) throws CustomerNotFoundException {
		return customerDao.getById(id);
	}

}
