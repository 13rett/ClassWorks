/* File: PaymentDriver.java 
 This is the interface for use of classes "CashPayment" and CreditCardPayment". Contains only main method.
 
 Written by 13rett Graves March 2016 for Java.
 
 Precondition:	creates 2 CashPayment classes and 2 CashPayment classes with user data. 
 	It then reads out the data depending on the class.
 Postcondition:	
 	1. makes 2 CashPayment classes and 2 CashPayment classes
 
 Variables used:
 Double:
 	amount			Temp var to hold payment amount
 String:
 	name			Temp var to hold credit card owner's name
 	cardNo			Temp var to hold credit card number
 	exp				Temp var to hold credit card expiration date
 Scanner:
 	userIn			Scanner stream to catch user input.
 Payment:
 	CashPayment:
 		cashPay1	The first CashPayment object
 		cashPay2	The second CashPayment object
 	CreditCardPayment:
 		cardPay1	The first CreditCardPayment object
 		cardPay2	The second CreditCardPayment object
 */




import java.util.Scanner;

public class PaymentDriver {
	static Scanner userIn=new Scanner(System.in);
	static double amount;
	static String name;
	static String cardNo;
	static String exp;
	
	public static void main (String args[ ] ) {
		//Cash Payment 1
		System.out.println("Please enter the amount of the first cash transaction");
		amount=userIn.nextDouble();
		userIn.nextLine();//to clear input
		CashPayment cashPay1=new CashPayment(amount);
		cashPay1.paymentDetails();
		
		//Cash Payment 2
		System.out.println("Please enter the amount of the second cash transaction");
		amount=userIn.nextDouble();
		userIn.nextLine();//clear input
		CashPayment cashPay2=new CashPayment(amount);
		cashPay2.paymentDetails();

		//Credit Card 1
		System.out.println("Please enter the amount of the first credit card transaction");
		amount=userIn.nextDouble();
		userIn.nextLine();//clear input
		System.out.println("Please enter the cardholder's name.");
		name=userIn.nextLine();
		System.out.println("Please enter the expiration date.");
		exp=userIn.nextLine();
		System.out.println("Please enter the card number.");
		cardNo=userIn.nextLine();
		CreditCardPayment cardPay1=new CreditCardPayment(amount, name, exp, cardNo);
		cardPay1.paymentDetails();
		
		//Credit Card 2
		System.out.println("Please enter the amount of the second credit card transaction");
		amount=userIn.nextDouble();
		userIn.nextLine();//clear input
		System.out.println("Please enter the cardholder's name.");
		name=userIn.nextLine();
		System.out.println("Please enter the expiration date.");
		exp=userIn.nextLine();
		System.out.println("Please enter the card number.");
		cardNo=userIn.nextLine();
		CreditCardPayment cardPay2=new CreditCardPayment(amount, name,exp, cardNo);
		cardPay2.paymentDetails();
		
		
		userIn.close();
	}
}
