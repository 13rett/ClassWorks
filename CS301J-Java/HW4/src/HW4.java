import java.util.Scanner;
public class HW4 {
	public static int getUserChoice(){
		System.out.println("What pattern would you like?: \n1, 2, 3 or 4");
		Scanner input = new Scanner(System.in);
		return input.nextInt();
	}
	public static void printAsterisks(int n){
//		print n asterisks 
		for (int i=0;i<n;i++){
			System.out.print("*");
		}
		return;
	}
	
	public static void printSpaces(int n){
//		print n spaces
		for (int i=0;i<n;i++){
			System.out.print(" ");
		}
		return;
	}

	public static void pattern1(int n){
		for(int i=1;i<=n;i++){
			printAsterisks(i);
			System.out.print("\n");
		}
			
	}
	
	public static void pattern2(int n){
		for(int i=n;i>=1;i--){
			printAsterisks(i);
			System.out.print("\n");
		}
	}
	
	public static void pattern3(int n){
		int a,s;
		//a is * 
		//s is space
		for(int i=1;i<=n;i++){
			s=n-i;
			a=n-s;
			printSpaces(s);
			printAsterisks(a);
			System.out.print("\n");
		}
	}
	
	public static void pattern4(int n){
		int a,s;
		//a is * 
		//s is space
		for(int i=1;i<=n;i++){
			a=n-i;
			s=n-a;
			printSpaces(s);
			printAsterisks(a);
			System.out.print("\n");
		}
	}
	
	public static void printPattern(int pattern){
//		Change patternLength to make more or less lines in ALL patterns
		int patternLength = 8;
		switch (pattern)
		{
		case 1:
			pattern1(patternLength);
			break;
		case 2:
			pattern2(patternLength);
			break;
		case 3:
			pattern3(patternLength);
			break;
		case 4:
			pattern4(patternLength);
			break;
		default:
			System.out.println("ERROR: User choice out of bounds.");
			break;
		}
		
	}
	public static void main(String[] args){
		int pattern;
		pattern = getUserChoice();
		printPattern( pattern );
		return;
}
}
