import java.util.Scanner;
public class Lab3 {
	
	public static int getPlayerChoice(){
		System.out.println("1 - Rock");
		System.out.println("2 - Paper");
		System.out.println("3 - Scissors ");
		
		Scanner input = new Scanner(System.in);
		return input.nextInt();
	}
	public static int getCompChoice(){
		return (int) (Math.random() *3) + 1;
	}
	public static String toString(int i){
		if (i==1)return "Rock";
		if (i==2)return "Paper";
		if (i==3)return "Scissors";
		return "ERROR: unexpected choice!";
	}
	public static void printChoices(int p, int c){
		System.out.println("Player chooses " + toString(p) + ". Computer Chooses " + toString(c) + ".");
	}
	public static void printWin(int win){
		if (win == -1) System.out.println("Computer wins!");
		else if (win == 0) System.out.println("It's a draw.");
		else System.out.println("Player Wins!");
	}
	public static int whoWon(int play, int comp){
		//return: -1=comp won, 0=draw, 1=play won

		int rock = 1;
		int paper = 2;
		int scissors = 3;
		
		int compWins =-1;
		int draw=0;
		int playerWins=1;
		
		if (play==comp){
			//handles all ties
			return draw;
		}	
		if ((play == rock &&comp == scissors)||(play==paper&&comp==rock)||(play==scissors&&comp==paper)){
			return playerWins;
		}
			return compWins;
		}

	public static void main(String[] args) {
		int playerChoice = getPlayerChoice();
		int compChoice = getCompChoice();
		int winner;
		printChoices(playerChoice,compChoice);
		winner=whoWon(playerChoice,compChoice);
		printWin(winner);
		
		//possible to use 
		/*
		int playerChoice = getPlayerChoice();
		int compChoice = getCompChoice();
		printWin(whoWon(playerChoice,compChoice));
		*/
		//or even more compressed if you don't care to reprint the choices
		/* 
		 printWin(whoWon(getPlayerChoice(),getCompChoice());
		 */
	}
	}