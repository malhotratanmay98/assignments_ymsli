package Assignment1;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=scn.nextInt();
		
		for(int i=0;i<=n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(j+1 + " ");
			}
			System.out.println();
		}

	}

}
