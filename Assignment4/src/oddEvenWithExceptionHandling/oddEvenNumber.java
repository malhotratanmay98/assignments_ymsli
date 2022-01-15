//Question 4
package oddEvenWithExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class oddEvenNumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int number=0; // to get into while loop

		do {
			System.out.println("Please Enter the Integer Value or -1 to Quit");
			
			try {
				
				number = scn.nextInt();

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
				
//				"If the translation is successful, the scanner advances past the input that matched."
//		        Ah, but what if the translation is not successful? In that case, the scanner does not 
//				advance past any input. The bad input data remains as the next thing to be scanned,
//				so the next iteration of the loop will fail just like the previous one--the loop will 
//				keep trying to read the same bad input over and over.
//				To prevent an infinite loop, you have to advance past the bad data so that you can get
//				to something the scanner can read as an integer. The code snippet below does this by calling input.next():
				
				scn.next();
				continue;
			}

		} while (number != -1);
scn.close();
	}

}
