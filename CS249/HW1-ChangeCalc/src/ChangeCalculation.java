/*
 * Program to calculate the bills and coins needed to refund change from a machine.
 * written in Java on January 26 to January 28 2016
 * written by 13rett Graves
 */

import java.util.*;

public class ChangeCalculation {

	public static void main (String args[ ] ) {
		
		/*
		ints:
		costD 					the dollar amount that the item costs
		costC 					the cents amount that the item costs
		enteredD				the dollar amount that the user enters
		enteredC				the cents amount that the user enters
		differenceD				the dollar amount that needs to be dispensed
		differenceC				the cents amount that needs to be dispensed
		
		Scanners:
		input					reads input
		
		Custom Objects:
		ChangeCalcObj coins 	the object that deals with the coin portion of the payment
		ChangeCalcObj bills		the object that deals with the bill portion of the payment
		*/
		
		Scanner input =new Scanner(System.in);
		
		//gets cost $ and ¢
		System.out.println("Please enter the cost of the item being bought. \nIt should be in the format of \"dollars cents\" and the cents should be a multiple of 5.");
		int costD=input.nextInt();
		int costC=input.nextInt();

		//gets payment $ and ¢
		System.out.println("Please enter the amount of money you paid. \nIt should be in the format of \"dollars cents\" and the cents should be a multiple of 5.");
		int enteredD=input.nextInt();
		int enteredC=input.nextInt();
		
		input.close();//closes the Scanner input
		
		//if either entered or cost has over 100 cents then it gets converted to dollars
		if(costC>=100){
			System.out.println("Please double check that the values are correct. \nI'm detecting that there was over 100 cents for the cost.\n This should have been converted to a dollar");
			costD+=costC/100;
			costC%=100;
			System.out.println("It has been converted to "+costD+" "+costC);
		}
		if(enteredC>=100){
			System.out.println("Please double check that the values are correct. \nI'm detecting that there was over 100 cents for the cost.\n This should have been converted to a dollar");
			enteredD+=enteredC/100;
			enteredC%=100;
			System.out.println("It has been converted to "+enteredD+" "+enteredC);
		}

		//converts 1 dollar to 100 cents if there is not enough cents paid to cover the cost.
		if (enteredC<costC) {
			enteredD--;
			enteredC += 100;
		}

		//checks that they paid more than it cost
		if (enteredD<costD) {
			System.out.println("Please double check that the values are correct. \nI'm detecting that the you paid less than it cost.");
		}

		//subtracts cost from payment
		int differenceC=enteredC-costC;
		int differenceD=enteredD-costD;
		
		//makes coin and bill objects to handle respective calculation and memory
		//constructor needs to know which kind in order to initialize the denominations being used
		ChangeCalcObj coins= new ChangeCalcObj('c');
		ChangeCalcObj bills= new ChangeCalcObj('b');
		
		//calculates the coins and bills needed to pay difference
		coins.calcNeeded(differenceC);
		bills.calcNeeded(differenceD);
		
		//prints out results
		//constructor needs to know which kind in order to format the print line corrctly
		System.out.println("\nThe bills returned are:");
		bills.print('b');
		System.out.println("\nThe coins returned are:");
		coins.print('c');
	}
}
