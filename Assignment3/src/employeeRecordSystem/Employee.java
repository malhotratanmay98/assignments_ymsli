package employeeRecordSystem;


//IN PROGRESS

abstract class Employee implements Payable {

	private String name;
	private int id;

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

	public abstract double getEmployeeSalary();
	
	public abstract void setEmployeeSalary(double incrementInterest);
	
	public Employee(String name,int id) {
		this.name=name;
		this.id=id;
		
	}
	
	
}
