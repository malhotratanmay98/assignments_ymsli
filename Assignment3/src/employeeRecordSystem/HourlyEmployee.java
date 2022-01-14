package employeeRecordSystem;

public class HourlyEmployee extends Employee {

	private int hoursWorked;
	private double hourlyRate;
	public int getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	public double getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	
	public HourlyEmployee(String name,int type,int hoursWorked,double hourlyRate) {
		super(name,type);
		this.hoursWorked=hoursWorked;
		this.hourlyRate=hourlyRate;
	}
	@Override
	public double getEmployeeSalary() {
		// TODO Auto-generated method stub
		return hoursWorked*hourlyRate;
	}
	
	@Override
	public void setEmployeeSalary(double incrementInterest)
	{
		this.hourlyRate=this.hourlyRate+((this.getHourlyRate()*incrementInterest)/100);
	}
	
	
}
