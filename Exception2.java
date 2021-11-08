package ExceptionHandling;

//2nd assignments of exception handling userdefined

import java.util.Scanner;

public class Exception2 {
	static void input(int num,int den) throws UnsupportedOperationException{
		
	
	if(den==0) {
		throw new UnsupportedOperationException("Exception"); 
	}
	int c=num/den;
	System.out.println(c);
	}
	
	
	public static void main(String[] args) throws UnsupportedOperationException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Numerator");
		int num = scanner.nextInt();
		System.out.println("Enter the denominator");
		int den = scanner.nextInt();
		try {
			input(num,den);
		}
		
		catch(UnsupportedOperationException e)
		{
			System.out.println("Cannot divide by zero");
		}
		/*
		
*/
	}

}

class UnsupportedOperationException extends Exception {

	UnsupportedOperationException(String exceptionText)
	 {
		 super(exceptionText);
	 }
	
}
