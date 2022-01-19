package q5_oddEvenLessThan100;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OddEvenLessThan100 {
		public static void main(String[] args) {
			
			Scanner scn = new Scanner(System.in);
			int number=0; // to get into while loop

			do {
				System.out.println("Please Enter the Integer Value or -1 to Quit");
				
				try {
					
					number = scn.nextInt();
					
					if(number>100) {
						throw new Exception();
					}

					if (number == -1) {
						System.out.println("Exiting");
					} else {
						if (number % 2 == 0) {
							System.out.println(number + " is even");
						} else {
							System.out.println(number + " is odd");
						}
					}

				} catch (InputMismatchException ex) {
					System.out.println("Please enter an Integer Value only");
					
					scn.next();
					continue;
				} catch(Exception ex) {
					System.out.println("The input cannot be greater than 100,try again");
				}

			} while (number != -1);
	scn.close();
		}
}
