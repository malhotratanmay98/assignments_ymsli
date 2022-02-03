package q2_customer_app.model.service;

import q2_customer_app.model.exceptions.CustomerNotFoundException;
import q2_customer_app.model.persistance.Customer;

public interface CustomerService {

	public void addCustomer(Customer customer);
	public Customer getById(int id) throws CustomerNotFoundException;
	
}
