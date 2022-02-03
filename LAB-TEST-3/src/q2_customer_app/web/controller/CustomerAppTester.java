package q2_customer_app.web.controller;


import java.util.List;


import q2_customer_app.model.persistance.Customer;
import q2_customer_app.model.service.CustomerService;
import q2_customer_app.model.service.CustomerServiceImpl;

public class CustomerAppTester {
	
public static void main(String[] args) {
	
	CustomerService customerService = new CustomerServiceImpl();
	
	System.out.println("add new Customer");
	Customer customer=new Customer(201,"Anurag", "Delhi", "9968809407","11-12-1994");
	customerService.addCustomer(customer);
	
	Customer customerExist=customerService.getById(101);
	
	
}
}
