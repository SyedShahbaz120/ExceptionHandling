package ExceptionHandling;
//3rd assignment of exception handling

import java.util.Scanner;

class IllegalBankTransactionException extends Exception
{
	public IllegalBankTransactionException() {
		System.out.println ("IllegalBankTransactionException");
	}



}
class InsufficientBalanceException extends Exception
{
	public InsufficientBalanceException() {
		
		System.out.println("InsufficientBalanceException");
	}

}


public class SavingsAccount {

	public static void main(String[] args) throws IllegalBankTransactionException,InsufficientBalanceException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your deposit");
		double deposit = scanner.nextDouble();
		double balance = deposit;
		balance+=deposit;
		System.out.println("Enter your withdraw Amount");
		double withdraw = scanner.nextDouble();
		withdraw( withdraw,balance);
		

	}

	private static void withdraw(double withdraw, double balance) throws IllegalBankTransactionException,InsufficientBalanceException {
		if(withdraw <= balance && withdraw >0) {
			System.out.println("Hi Take your amount "+ balance );
			
		}
		else if(withdraw <0) {
			throw new IllegalBankTransactionException();
			
		}
		else if(withdraw > balance || withdraw ==0) {
			throw new InsufficientBalanceException ();
			
		}
		
	}

	

}
