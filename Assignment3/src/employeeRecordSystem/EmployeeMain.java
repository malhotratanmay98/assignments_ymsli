package employeeRecordSystem;

import java.util.Scanner;

public class EmployeeMain {
public static void main(String[] args) {
	int choice=1;
	while(choice!=0) {
		
		System.out.println("Please select your choice");
		System.out.println("1.Get Weekly Salary 2.Set Rate of Employee ");
		Scanner scn=new Scanner(System.in);
		choice=scn.nextInt();
		Employee emp=new SalariedEmployee(1,"Tanmay",500,40);
		Employee emp2=new HourlyEmployee("Anurag",2,45,100);
		
		System.out.println(emp.getName());
		System.out.println(emp.getId());
		System.out.println(emp.getEmployeeSalary());
		
		System.out.println(emp2.getName());
		System.out.println(emp2.getId());
		System.out.println(emp2.getEmployeeSalary());

	}
	
}
}
