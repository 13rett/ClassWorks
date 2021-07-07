/* File: Payment.java 
 class definition to store payment info for a payment.
 parent class of CashPayment.java and CreditCardPayment.java
 
 Written by 13rett Graves March 2016 for Java.
 
 Precondition:	is inherited by another class, such as CashPayment.
 Postcondition:	saves information about a payment.
 
 Variables used:
 Double:
 	amount				Stores payment amount inherited from Payment.java
 	payAmount			Temp var to hold payment amount in the constructor
 	setTo				Temp var to hold payment amount in the setter function
 */

public class Payment {
	//amount var with getter and setter
	private double amount;
		public double getAmount(){return this.amount;}
		public void setAmount(double setTo) {this.amount=setTo;}
	
	//constructor function
	public Payment(double payAmount){
		this.amount=payAmount;
	}
	
	//function to print a sentence about the payment details
	public void paymentDetails(){
		System.out.printf("The payment totaled $%,.2f%n.", this.getAmount() ); 
	}
}
