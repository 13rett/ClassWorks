import java.util.Scanner;

public class Lab8 {
	

	
	public static int min(int[] numbers){
		//gets min num from array
		int m=numbers[0];
		for (int i : numbers)
			if(i<m)
				m=i;
		return m;
	}

	public static int max(int[] numbers){
		//gets max num from array
		int m=numbers[0];
		for (int i : numbers)
			if(i>m)
				m=i;
		return m;
	}
	
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		boolean validNum = false;
		int n;
		do{
			System.out.println( "How many numbers will you enter?");
			n= input.nextInt();
			if(n>0)
				validNum = true;
		}while (validNum == false);
		
		int[] nums = new int [n];		
		for(int i=0;i<nums.length;i++){
			System.out.println( "Enter an integer.");
			nums[i]=input.nextInt();
		}
		System.out.println( "min: " + min(nums) );
		System.out.println( "max: " + max(nums) );
	}
}
