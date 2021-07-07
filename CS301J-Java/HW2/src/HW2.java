import java.util.Scanner;
public class HW2 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number for a:");
		double a = input.nextInt();
		System.out.println("Enter a number for b:");
		double b = input.nextInt();
		System.out.println("Enter a number for c:");
		double c = input.nextInt();
		System.out.println("Enter a number for d:");
		double d = input.nextInt();
		System.out.println("Enter a number for e:");
		double e = input.nextInt();
		System.out.println("Enter a number for f:");
		double f = input.nextInt();
		
		double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
		double y = ((a * f) - (e * c)) / ((a * d) - (b * c));
		
		
		System.out.print("X = ");
		if(x % 1 == 0)
		{
			System.out.print((int) x );
		}
		else
		{
			System.out.print( x );
		}
		
		System.out.print("\nY = ");
		
		if(y % 1 == 0)
		{
			System.out.print((int) y );
		}
		else
		{
			System.out.print(y);
		}
		
		
	}

}
