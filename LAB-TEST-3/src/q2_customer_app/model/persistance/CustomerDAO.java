package q2_customer_app.model.persistance;

import q2_customer_app.model.exceptions.CustomerNotFoundException;


public interface CustomerDAO {

	public void addCustomer(Customer customer);
	public Customer getById(int id) throws CustomerNotFoundException;
}
