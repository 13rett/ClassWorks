import java.util.Scanner;


public class Lab2 {

	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		System.out.println("Type a number. Then press the enter key.");
		double x = input.nextInt();
		double y = (3.0 * x + 4.0) / 2.0;
		
		if(x % 1 == 0)
		{
			System.out.println("x is " + (int) x );
		}
		else
		{
			System.out.println("x is " + x );
		}
		
		if(y % 1 == 0)
		{
			System.out.println("y is " + (int) y );
		}
		else
		{
			System.out.println("y is " + y);
		}

	}
}
