package ExceptionHandling;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Numerator");
		int nume = scanner.nextInt();
		System.out.println("Enter the denominator");
		int deno = scanner.nextInt();
		try {
			int z=nume/deno;
			System.out.println("The output of divison is "+z);
		}
		catch(ArithmeticException e){
			System.out.println("Denominator value cannot be zero");
			
		}

	}

}