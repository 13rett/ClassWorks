/* File: CashPayment.java 
 class definition to store payment info for a cash payment.
 child class of Payment.java
 
 Written by 13rett Graves March 2016 for Java.
 
 Precondition:	is invoked by another class, such as PaymentDriver.
 Postcondition:	saves information about a cash payment.
 
 Variables used:
 Double:
 	amount				Stores payment amount inherited from Payment.java
 	payAmount			Temp var to hold payment amount in the constructor
 */

public class CashPayment extends Payment {
	
	//constructor function
	public CashPayment(double payAmount) {
		super(payAmount);
	}
	
	//override of payment details from Payment.java
	public void paymentDetails(){
		System.out.printf("The payment was in cash and totaled $%,.2f.%n", this.getAmount());
	}
}
