package employeeRecordSystem;

public class CommissionEmployee extends Employee {

	private double percent;
	private double sales;
	
	public double getPercent() {
		return percent;
	}

	public void setPercent(double percent) {
		this.percent = percent;
	}

	public double getSales() {
		return sales;
	}

	public void setSales(double sales) {
		this.sales = sales;
	}

	public CommissionEmployee(String name,int id,double percent,double sales) {
		super(name,id);
		this.percent=percent;
		this.sales=sales;
	}
	
	@Override
	public double getEmployeeSalary() {
		// TODO Auto-generated method stub
		return (percent*sales)/100;
	}

	@Override
	public void setEmployeeSalary(double percentageOfSales)
	{
		this.sales=(int) ((this.sales*percentageOfSales)/100);
	}

	
}
