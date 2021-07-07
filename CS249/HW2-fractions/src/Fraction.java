/* File: Fraction.java 
 class definition to store a fraction.
 
 Written by 13rett Graves February 2016 for Java.
 
 Precondition:	is invoked by another class, such as fractionDriver.
 Postcondition:	records a fraction in its most reduced form and keeps 
 a multiplier to track entered number. Can print the fraction as entered 
 or in reduced form, be compared to another fraction, or it can be reset.
 
 Variables used:
 Integers:
 	Instance Variables 
 		numerator		the numerator of the fraction
 		denominator		the denominator of the fraction
 		multiplier		the multiplier to get the fraction as originally entered
 	Method Variables
 		a				a temporary variable used in gcd used to find the greatest common divisor
 		b				a temporary variable used in gcd used to find the greatest common divisor
 		n				a temporary variable to set the numerator of the fraction to
 		d				a temporary variable to set the denominator of the fraction to
 
 Fractions:
 	Method Variables
 		frac			used to know what fraction to compare to in equals
 */
public class Fraction {
	private int numerator;
	private int denominator;
	private int multiplier;
	//constructor
	Fraction(int n,int d){
		this.numerator=n;
		this.denominator=d;
		reduce();
	}
	//to change fraction after construction
	public void changeFraction(int n,int d){
		this.numerator=n;
		this.denominator=d;
		reduce();
	}
	// reduces fraction to lowest terms.
	// happens when built and when changeFraction is called
	private void reduce() {
		this.multiplier=gcd(this.numerator,this.denominator);
		this.numerator/=this.multiplier;
		this.denominator/=this.multiplier;
	}
	//gets greatest common divisor of a and b. 
	// based on Euclid's algorithm on Wikipedia
	private int gcd(int a, int b){
		if (b==0) 
			return a;
		return gcd(b,a%b);
	}
	//checks if given fraction is equivalent to this fraction
	public boolean equals(Fraction frac){
		if(frac.getReducedDenominator()==this.denominator &&frac.getReducedNumerator()==this.numerator)
			return true;
		return false;
	}
	//getters for numerator and denominator entered (ie not reduced)
	public int getNumerator(){return (this.numerator*this.multiplier);}
	public int getDenominator(){return (this.denominator*this.multiplier);}
	//getters for numerator and denominator after being reduced
	public int getReducedNumerator(){return (this.numerator);}
	public int getReducedDenominator(){return (this.denominator);}
	//prints fraction as it was entered
	public void printFrac(){
		System.out.print( (this.numerator*this.multiplier)+"/"+(this.denominator*this.multiplier ));
	}
	//prints reduced fraction
	public void printReducedFrac(){
		System.out.print( (this.numerator)+"/"+(this.denominator));
	}
}