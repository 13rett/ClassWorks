import java.util.Scanner;

public class HW5 {
	

	
	public static int min(int[] numbers){
		int m=numbers[0];
		for (int i=1; i<numbers.length;i++)
			if(numbers[i]<m)
				m=numbers[i];
		return m;
	}
	
	public static int max(int[] numbers){
		int m=numbers[0];
		for (int i=1; i<numbers.length;i++)
			if(numbers[i]>m)
				m=numbers[i];
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
