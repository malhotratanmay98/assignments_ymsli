//Question 6
package q6_oddEvenLessThan100CustomException;

import java.util.InputMismatchException;
import java.util.Scanner;

class greaterThanHunderedException extends Exception {

	public greaterThanHunderedException(String message) {
		super(message);
	}
	
}

  class Check {
	  public Check(int number) throws greaterThanHunderedException {
			if (number >100) {
				throw new greaterThanHunderedException("Number cannot be greater than 100");
			}
  }
  }

public class OddEvenLessThan100Custom{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int number=0; // to get into while loop

		do {
			System.out.println("Please Enter the Integer Value less than 100 or -1 to Quit");
			
			try {
				
				number = scn.nextInt();
				
				Check ch=new Check(number); //sending number to check if greater than 100

				if (number == -1) {
					System.out.println("Exiting");
				} else {
					if (number % 2 == 0) {
						System.out.println(number + " is even");
					} else {
						System.out.println(number + " is odd");
					}
				}
				

			}
			catch (greaterThanHunderedException ex) {
				System.out.println(ex.getMessage());
			}catch (InputMismatchException ex) {
				System.out.println("Please enter an Integer Value only");
				
//				"If the translation is successful, the scanner advances past the input that matched."
//		         but what if the translation is not successful? In that case, the scanner does not 
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
