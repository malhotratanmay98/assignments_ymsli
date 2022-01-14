package employeeRecordSystem;

public class SalariedEmployee extends Employee {

	private double weeklyRate;
	private int numberOfWeek;

	public SalariedEmployee(int id, String name, double weeklyRate,int numberOfWeek) {
		super(name,id);
		this.weeklyRate=weeklyRate;
		this.numberOfWeek=numberOfWeek;
	}
	


	public double getWeeklyRate() {
		return weeklyRate;
	}



	public void setWeeklyRate(double weeklyRate) {
		this.weeklyRate = weeklyRate;
	}

	public void setEmployeeSalary(double incrementInterest)
	{
		this.weeklyRate=this.weeklyRate+((this.getWeeklyRate()*incrementInterest)/100);
	}
	

	@Override
	public double getEmployeeSalary()
	{
		return weeklyRate*numberOfWeek;
	}

	
	
}
