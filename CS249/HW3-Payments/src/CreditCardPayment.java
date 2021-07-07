/* File: CreditCardPayment.java 
 class definition to store credit card payment info.
 child class of Payment.java
 
 Written by 13rett Graves March 2016 for Java.
 
 Precondition:	is invoked by another class, such as PaymentDriver.
 Postcondition:	saves information about a credit card payment.
 
 Variables used:
 Double:
 	amount				Stores payment amount inherited from Payment.java
 	payAmount			Temp var to hold payment amount in the constructor
 String:
 	cardName		var to hold credit card owner's name
 	cardNum			var to hold credit card number
 	expDate			var to hold credit card expiration date
 	owner			Temp var to hold credit card owner's name in the constructor
 	cardNo			Temp var to hold credit card number in the constructor
 	date			Temp var to hold credit card expiration date in the constructor
 	n				Temp var to hold credit card owner's name or card number in setter functions
 	d				Temp var to hold exp. date in setter function
 */


public class CreditCardPayment extends Payment {
	//cardName var with getter and setter
	private String cardName;
		public String getName(){return this.cardName;}
		public void setName(String n){ this.cardName=n;}
	//expDate var with getter and setter
	private String expDate;
		public String getDate(){return this.expDate;}
		public void setDate(String d){ this.expDate=d;}
	//cardNum var with getter and setter
	private String cardNum;
		public String getNum(){return this.cardNum;}
		public void setNum(String n){ this.cardNum=n;}
		
	//constructor function
	public CreditCardPayment(double payAmount,String owner,String date,String cardNo) {
		super(payAmount);
		this.cardName=owner;
		this.expDate=date;
		this.cardNum=cardNo;
		
	}
	
	//override of payment details from Payment.java
	public void paymentDetails(){
		System.out.printf("The payment was made with a card and totaled $%,.2f.%n", this.getAmount());
		System.out.println("The name on the card is "+this.cardName+".");
		System.out.println("The card expires on "+this.expDate+".");
		System.out.println("The card number is "+this.cardNum+".");
	}
}
