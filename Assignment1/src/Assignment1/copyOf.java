package Assignment1;

import java.util.Arrays;

public class copyOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] original = new int[] {1, 2 ,3};
	     
	      System.out.println("Original Array : ");
	      for (int i = 0; i < original.length; i++)
	           System.out.print(original[i] + " ");  
	        
	      System.out.println();
	       //using Arrays.copyOf function
	       int[] copy = Arrays.copyOf(original, original.length);
	    
	       System.out.println("New array copy");
	       for (int i = 0; i < copy.length; i++) 
	           System.out.print(copy[i] + " ");
	}

}
