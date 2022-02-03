package q2_customer_app.model.persistance;

public class Customer {

	private int id;
	private String name;
	private String address;
	private String phone;
	private String dob;
	
	
	
	public Customer() {
		
	}
	public Customer(int id, String name, String address, String phone, String dob) {
		
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.dob = dob;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone + ", dob=" + dob
				+ "]";
	}
	
	
	
}
