import java.util.Scanner;
public class Lab5 {
	
	public static int menu(){
		//present menu with options returns response
		System.out.println("What do you want to do?");
		System.out.println("      1 - Series sum");
		System.out.println("      2 - Interval sum");
		System.out.println("      3 - Exit");
		Scanner input = new Scanner(System.in);
		return input.nextInt();

	}
	
	public static int obtainNumber(){
		//gets a number from the user then returns response
		System.out.println("Enter a number: ");
		Scanner input = new Scanner(System.in);
		return input.nextInt();
	}
	
	public static int calculateSeriesSum(int n){
		//calc 0+1+2+...+n
		int sum;
		sum=calculateIntervalSum(0, n);
		return sum;
	}
	
	public static int calculateIntervalSum(int min, int max){
		//calc min + (min+1) + (min+2) + ... (max)
		int total=0;
		for (int i=min;i<=max;i++ ){
			total+=i;
		}
		return total;
	}
	
	public static void main (String[] args){
		int exit=0;
		do{
			int choice,in1,in2,out;
			choice=menu();
			switch (choice)
			{
			case 1:
				in1=obtainNumber();
				out=calculateSeriesSum(in1);
				System.out.println("The series sum is " + out + "!");
				break;
			case 2:
				in1=obtainNumber();
				in2=obtainNumber();
				out=calculateIntervalSum(in1,in2);
				System.out.println("The interval sum is " + out + "!");
				break;
			case 3:
				exit=1;
				break;
			default:
				System.out.println("ERROR: User choice out of bounds.");
				break;
			}
	
		} while (exit == 0);
	
	}
	
}
