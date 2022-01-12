package Assignment1;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=10;
		int first=1;
		int second=1;
		System.out.print(first+" ");
		System.out.print(second+" ");
		for(int i=2;i<n;i++) {
			int third=first+second;
			System.out.print(third+" ");
			first=second;
			second=third;
		}
	}

}
