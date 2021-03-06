//Merged code of Question1 and Question2
package employeeRecordSystem;


abstract class Employee implements Payable {

	private String name;
	private int id;
	private double rate;
	private double salary;
	


	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id =id;
	}
	
	

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	//constructor
	public Employee(String name,int id,double salary,double rate) {
		this.name=name;
		this.id=id;
		this.salary=salary;
		this.rate=rate;
	}

	//implementing the method from Payable interface

	@Override
	public double getPayment() {
		return salary;
	}
	
	
	
	
	
}
