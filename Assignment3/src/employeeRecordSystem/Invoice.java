package employeeRecordSystem;

public class Invoice implements Payable {

	private int invoiceId;
	private String name;
	private double ratePerDay;
	private int noOfDays;
	
	public Invoice(int invoiceId, String name, double ratePerDay, int noOfDays) {
		this.invoiceId = invoiceId;
		this.name = name;
		this.ratePerDay = ratePerDay;
		this.noOfDays=noOfDays;
	}
	
	public void printInvoiceDetails() {
		System.out.println("invoiceId: "+ invoiceId);
		System.out.println("name: "+ name);
		System.out.println("ratePerDay: "+ ratePerDay);
		System.out.println("noOfDays: "+ noOfDays);
	}

	@Override
	public double getPayment() {
		return 0.9*ratePerDay*noOfDays;
	}
}
