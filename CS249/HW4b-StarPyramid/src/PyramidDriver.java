/* File: PyramidDriver.java 
 This is the interface for use of class Pyramid. Contains only main method.
 
 Written by 13rett Graves April 2016 for Java.
 
 Precondition:	Creates a Pyramid from class Pyramid.java
 Postcondition:	
 1- Creates a Pyramid of a user inputted size 
 2- Prints the pyramid
 3- Prints the number of asterisks at each line
 
 Variables used:
 int:
 	rows			The pyramid's size that the user inputs
 Scanner:
 	uInput			Scanner stream to catch user input.
 Pyramid:
 	full			The Pyramid with the user inputted size
 */



import java.util.Scanner;


public class PyramidDriver {
	public static void main (String args[ ] ) {
		int rows=0; // start at zero so the while check triggers
		Scanner uInput=new Scanner(System.in);
		while(rows<1){
			try{
				System.out.println("How large of a pyramid do you wish to print?");
				rows=Integer.parseInt(uInput.nextLine());
			} catch (NumberFormatException e){
				System.out.println("That was an improper input please enter a positive integer.");
			}
			finally {
			}
		}
		System.out.println();// add a blank divider line
		Pyramid full= new Pyramid(rows);//creates pyramid of size rows
		full.printPyramid(rows);//prints the pyramid and passes the total size
		System.out.println();// add a blank divider line
		full.printLevelTotals();// prints the total number of stars at each level
		uInput.close();
	}
}
