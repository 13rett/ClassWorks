
public class HW6 {
	
	public static int countOdds(int[][] nums){
		int odds=0;
		for (int[] row: nums)
			for (int num:row)
				if (num % 2 != 0)
					odds++;
		return odds;
	}
	
	public static int countEvens(int[][] nums){
		int evens=0;
		for (int[] row: nums)
			for (int num:row)
				if (num % 2 == 0)
					evens++;
		return evens;
	}
	
	
	public static void main (String[] args){
		int[][] nums = { { 0, 1, 1}, { 2, 3 , 5}, { 8, 13, 21} };
		System.out.println(countOdds(nums));
	}
}
