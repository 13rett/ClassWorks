import java.util.Scanner;

public class Lab6 {
	public static int menu(){
		System.out.println( "Enter a year to test if it is a leap year, or enter -1 to quit.");
		Scanner input = new Scanner(System.in);
		return input.nextInt();
	}
	
	public static boolean isLeapYear (int year){
		if (year % 4 == 0){
			if (year % 100 == 0){
				if (year % 400 == 0){
					return true;
				} else {
					return false;
				}
			} else {
				return true;
			}
		} else {
			return false;}
	}
	
	public static void main (String[] args){
		int yr;
		boolean finished = false;
		
		do {
			yr=menu();
			if (yr<1) //-1 means quit if changed here change it in the menu() method as well
				finished = true;
			else
				if (isLeapYear (yr))
					System.out.println( yr + " is a leap year.");
				else
					System.out.println( yr + " is not a leap year.");
		}
		while ( !finished );
	}
}
