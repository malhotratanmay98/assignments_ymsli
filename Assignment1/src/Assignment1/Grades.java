package Assignment1;

import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		

		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number of students");
		int numOfStudents=scn.nextInt();
		
		int grades[]=new int[numOfStudents];
		for(int i=0;i<numOfStudents;i++) {
			
			System.out.println("Enter the grade of student " + i);
			int grade=scn.nextInt();
			if(grade<0 || grade>100 ) {
				System.out.println("You have entered wrong grade");
				--i;
			}
			else {
				grades[i]=grade;
			}
			
			
		}
		
		int total=0;
		for(int i=0;i<numOfStudents;i++) {
			total+=grades[i];
		}
		double average=total/numOfStudents;
		System.out.println("Average is: "+ average);
	}

}
