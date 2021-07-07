/* File: FractionDriver.java 
 This is the interface for use of class "Fraction". Contains only main method.
 
 Written by 13rett Graves February 2016 for Java.
 
 Precondition:	creates 2 fraction classes and has user fill them then compares the fractions.
 Postcondition:	
 	1. Makes a fraction then has user change it to new values.
 	2. Prints the fraction back with the reduced value.
 	3. Repeats 1&2 for second fraction
 	4. Compares if the fractions are equivalent and tells the user.
 	5. Asks the user if they want to test new values. (returns to step 1 if so)
 
 Variables used:
 Integers:
 	userInput		Holds the numerator the user wants for current fraction.
 Boolean:
 	compareAgain	Check to see if the user wants to repeat process.
 Scanner:
 	userIn			Scanner stream to catch user input.
 Fractions:
 	frac1			The first fraction to compare.
 	frac2			The second fraction to compare.
 */
import java.util.Scanner;
public class FractionDriver {
	public static void main(String[] args) {
		Fraction frac1=new Fraction(1,2);
		Fraction frac2=new Fraction(2,4);
		boolean compareAgain;
		int userInput;
		Scanner userIn=new Scanner(System.in);
		do {
			//set frac1 (uses userInput to hold onto numerator)
			System.out.println("Please enter the numerator of the first fraction to compare.");
			userInput=userIn.nextInt();
			System.out.println("Please enter the denominator of the first fraction to compare.");
			// changeFraction expects 2 integers the numerator and the denominator
			// numerator uses userInput and denominator gets sent the integer directly from userIn
			frac1.changeFraction(userInput, userIn.nextInt() );
			//print is broken up to multiple lines because printFrac cannot go in System.out.print()
			System.out.print("The first fraction is ");
			frac1.printFrac();
			System.out.print(", Which reduces to ");
			frac1.printReducedFrac();
			System.out.print("\n~~~~~~\n");
			
			//set frac2 (overwrites userInput to hold onto numerator)
			System.out.println("Please enter the numerator of the second fraction to compare.");
			userInput=userIn.nextInt();
			System.out.println("Please enter the denominator of the second fraction to compare.");
			// changes second fraction same way as first
			frac2.changeFraction(userInput, userIn.nextInt() );
			//once again print is broken up to multiple lines because printFrac cannot go in System.out.print()
			System.out.print("The second fraction is ");
			frac2.printFrac();
			System.out.print(", Which reduces to ");
			frac2.printReducedFrac();
			System.out.print("\n~~~~~~\n");
			
			//compare two fractions
			//first print  "The fractions Xn/Xd and Yn/Yd " where Xn and Yn are the numerators 
			//and Xd and Yd are the denominators
			System.out.print("The fractions "); 
			frac1.printFrac();
			System.out.print(" and "); 
			frac2.printFrac();
			// sends the second fraction to the first fraction to see if the two fractions are equivalent
			if(frac1.equals(frac2)) 
				System.out.print(" are equivalent.\n"); 
			else
				System.out.print(" are not equivalent.\n"); 
			
			// ask to compare a new set of fractions
			System.out.println("If you wish to compare two more fractions please enter true. Otherwise plese enter false.");
			compareAgain=userIn.nextBoolean();
			System.out.print("~~~~~~\n");
		}while(compareAgain);
		userIn.close();
	}
}
