import java.util.Scanner;

public class Lab4 {

	public static int getPlayerChoice(){
		System.out.println("Which loop do you want to run? \n1 \n2 \nor 3");
		Scanner input = new Scanner(System.in);
		return input.nextInt();
	}
	public static void loop1(){
//		System.out.print("loop1");
		for (int i=10;i<=20;i++)
			System.out.print(i + " ");
		return;
	}
	public static void loop2(){
//		System.out.print("loop2");
		for (int i=10;i>=1;i--)
			System.out.print(i + " ");
		return;
	}
	public static void loop3(){
		int print;
//		System.out.print("loop3");
		for (int i=1;i<=11;i++)
		{
			print=i*7;
			System.out.print(print + " ");
		}
		return;

	}
	public static void main(String[] args){
		int choice = getPlayerChoice();
		switch (choice)
		{
		case 1:
			loop1();
			break;
		case 2:
			loop2();
			break;
		case 3:
			loop3();
			break;
		default:
			System.out.println("ERROR: User choice out of bounds.");
			break;
		}
		return;
	}
}

