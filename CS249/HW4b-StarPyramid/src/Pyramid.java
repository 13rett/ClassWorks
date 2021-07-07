/* File: Pyramid.java 
 This is the class Pyramid. 
 
 Written by 13rett Graves April 2016 for Java.
 
 Precondition:	is invoked by another class
 Postcondition:	
 1- recursively creates pyramids of 1 size less then this one
 2- has methods to calc the number of stars, print a pyramid with a number of rows
 print the number of stars the last row has, or the number of stars at each level
 
 Variables used:
 int:
 	size			The pyramid's size at this level. (number of rows and the stars on this level)
 	totNum			The total number of stars this pyrimid has.
 	i				A temp var to control the loops
 	topSize			a variable passed to the print methods to center the top
 Pyramid:
 	oneLess			A Pyramid with a size that is one less then this ones.
 */


public class Pyramid {
	private int size;
	private int totNum;
	private Pyramid oneLess;
	
	// constructor 
	public Pyramid(int i) {
		this.size=i;
		if(this.size==1){
			oneLess=null;
			totNum=1;
		} else {
			oneLess=new Pyramid(i-1);
			totNum=oneLess.getTotNum()+size;
		}
	}
	
	// returns the size of the pyramid
	public int getSize() {
		return this.size;
	}
	
	// gets the number of stars at this level + all levels above it (assuming smaller at top and goes to one)
	public int getTotNum() {
		// ensures that totNum is right
		if(oneLess!=null)//if it is not level 1 call the oneLess of this function and adds this size
			totNum=oneLess.getTotNum()+size;
		else // this is the bottom level so it has only 1 star so add size which will be one
			totNum=this.size;
		return this.totNum;
	}
	
	// gets the pyramid of one size less
	public Pyramid getOneLess() {
		return this.oneLess;
	}
	
	// prints a pyramid by printing the pyramid above it then printing this row
	public void printPyramid(int topSize){
		if(oneLess!=null){//if it is not level 1 call the oneLess of this function
			oneLess.printPyramid(topSize);
		}
		this.printRow(topSize);
	}
	
	// prints the row 
	private void printRow(int topSize){
		String s=" ";
		for(int i=0;i<topSize-this.size;i++){
			s=s+" ";
		}
		for(int i=0;i<this.size;i++){
			s=s+"* ";
		}
		System.out.println(s);
	}

	// print the total number of stars in the pyramid at all lower rows
	public void printLevelTotals() {
		if(oneLess!=null){//if it is not level 1 call the oneLess of this function
			oneLess.printLevelTotals();
		}
		this.printTotal();
	}
	
	// prints the number of stars at this level
	public void printTotal() {
		System.out.println("If there is only "+this.size+" rows then there would be a total of "+this.getTotNum()+" pins.");
	}
	
}
