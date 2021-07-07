import java.util.Scanner;

public class Lab7 {
	
	public static void printGradeQuestion(int[] gradeCounts){
		Scanner input = new Scanner(System.in);
		System.out.println( "How many students recieved an A?");
		gradeCounts[0]= input.nextInt();
		System.out.println( "How many students recieved a B?");
		gradeCounts[1]= input.nextInt();
		System.out.println( "How many students recieved a C?");
		gradeCounts[2]= input.nextInt();
		System.out.println( "How many students recieved a D?");
		gradeCounts[3]= input.nextInt();
		System.out.println( "How many students recieved an F?");
		gradeCounts[4]= input.nextInt();
		return;
	}
	
	public static void printBarChart(int[] gradeCounts){
		System.out.print("\n\n\nA:  ");
		printAsterisks(gradeCounts[0]);
		System.out.print("\nB:  ");
		printAsterisks(gradeCounts[1]);
		System.out.print("\nC:  ");
		printAsterisks(gradeCounts[2]);
		System.out.print("\nD:  ");
		printAsterisks(gradeCounts[3]);
		System.out.print("\nF:  ");
		printAsterisks(gradeCounts[4]);

	}
	
	public static void printAsterisks(int n){
		for(int i = 0;i<n;i++)
			System.out.print("*");
		return;
	}
	
	public static void main(String[] args){
		int[] gradeCounts = new int [5];
		printGradeQuestion(gradeCounts);
		printBarChart(gradeCounts);
	}
	
}
