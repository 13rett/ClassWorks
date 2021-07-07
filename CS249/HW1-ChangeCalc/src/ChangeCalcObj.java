/*
 * class to determine number of things packages to return given particular package sizes
 * written in Java on January 26 to January 28 2016
 * written by 13rett Graves
 */

public class ChangeCalcObj {
	/*
	int arrays:
	denominations			the sizes of each package such as {20,10,5,1} for a $20 bill, $10 bill etc.
	needed					the amount of each package needed to meet the difference
	
	ints:
	difference 				the amount you need the sum of needed[i]*denomination[i] for every value of i (thats in the arrays)
	i						a counter variable for for loop in calcNeeded and print
	
	chars:
	kind					variable passed into the constructor and printer to know if the object's for coins or bills
	*/
	
	
	//the 4 should be replaced with the largest number of denominations. Due to the assignments constraints
	//this will be 4 kinds of coins and 4 kinds of bills so the special case for when there is an uneven 
	//number denominations is not handled.
	public int[] denominations=new int[4];
	public int[] needed=new int[4];
	
	ChangeCalcObj (char kind){
		if ( kind=='b'||kind=='B'){ //sets the denominations list for bills
			this.denominations[0]=20;
			this.denominations[1]=10;
			this.denominations[2]=5;
			this.denominations[3]=1;
		} else if (kind=='c'||kind=='C'){//sets the denominations list for coins
			this.denominations[0]=50;
			this.denominations[1]=25;
			this.denominations[2]=10;
			this.denominations[3]=5;
		} else {
			System.out.println("Error in declareing type of bill.");
		}
		
	}
	
	
	/*
	 * for  determines amount needed by taking difference/denomination (integer division) of the bill or 
	 * coin that is being calculated then subtracts that number*denomination from the difference and 
	 * repeats with the next denomination until the difference needed is 0.
	 */
	public void calcNeeded (int difference) {
		for (int i=0;i<this.denominations.length;i++) {// i translates to the denomination being worked on
			this.needed[i]=difference / this.denominations[i]; 
			difference-= (this.needed[i] * this.denominations[i] );
		}
		
	}
	
	public void print (char kind) {
		for(int i=0;i<this.denominations.length;i++)
			if ( kind=='b'||kind=='B'){ 
				System.out.println("$"+this.denominations[i]+" bill \t : "+this.needed[i]);
			}else if ( kind=='c'||kind=='C'){ 
				System.out.println(this.denominations[i]+"¢ coin \t : "+this.needed[i]);
			}
	}

	
}
