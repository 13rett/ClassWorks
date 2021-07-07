import java.util.Scanner;
public class HW3 {
	
	public static int getPlayerChoice(){
		System.out.println("1 - Rock");
		System.out.println("2 - Paper");
		System.out.println("3 - Scissors ");
		System.out.println("4 - Lizard ");
		System.out.println("5 - Spock ");
		
		Scanner input = new Scanner(System.in);
		return input.nextInt();
	}
	public static int getCompChoice(){
		return (int) (Math.random() *5) + 1;
	}
	public static String toString(int i){
		if (i==1)return "Rock";
		if (i==2)return "Paper";
		if (i==3)return "Scissors";
		if (i==4)return "Lizard";
		if (i==5)return "Spock";
		
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
		int lizard = 4;
		int spock = 5;
		
		int compWins =-1;
		int draw=0;
		int playerWins=1;
		int errorWins=2;
		
		if (play==comp){
			//handles all ties
			return draw;
		}	
		else if (play==rock){
			//player chose rock
			if (comp==scissors || comp== lizard){
				//win
				return playerWins;
			}
			if (comp==paper || comp== spock){
				//lose
				return compWins;
			}
		}
		else if (play==paper){
			//player chose paper
			if (comp==rock || comp== spock){
				//win
				return playerWins;
			}
			if (comp==scissors || comp== lizard){
				//lose
				return compWins;
			}
		}
		else if (play==scissors){
			//player chose scissors
			if (comp==paper || comp== lizard){
				//win
				return playerWins;
			}
			if (comp==rock || comp== spock){
				//lose
				return compWins;
			}
		}
		else if (play==lizard){
			//player chose lizard
			if (comp==paper || comp== spock){
				//win
				return playerWins;
			}
			if (comp==scissors || comp== rock){
				//lose
				return compWins;
				}
		}
		else if (play==spock){
			//player chose spock
			if (comp==rock || comp== scissors){
				//win
				return playerWins;
				}
			if (comp==lizard || comp== paper){
				//lose
				return compWins;
				}
			}
			return errorWins;
		}
	public static void whyWon(int p,int c){
		int rock = 1;
		int paper = 2;
		int scissors = 3;
		int lizard = 4;
		int spock = 5;
		
		if (p==c) 
			System.out.println("Both participants chose the same option.");
		else if ((p == scissors || c== scissors)&&(p == paper ||c == paper))
			System.out.println("Scissors cuts paper.");
		else if ((p == rock ||c == rock)&&(p == paper ||c == paper))
			System.out.println("Paper covers rock.");
		else if ((p == rock ||c == rock)&&(p == lizard ||c == lizard))
			System.out.println("Rock crushes Lizard");
		else if ((p == lizard ||c == lizard)&&(p == spock ||c == spock))
			System.out.println("Lizard poisons Spock");
		else if ((p == spock ||c == spock)&&(p == scissors || c== scissors))
			System.out.println("Spock smashes Scissors");
		else if ((p == scissors || c== scissors)&&(p == lizard ||c == lizard))
			System.out.println("Scissors decapitates Lizard");
		else if ((p == lizard ||c == lizard)&&(p == paper ||c == paper))
			System.out.println("Lizard eats Paper");
		else if ((p == spock ||c == spock)&&(p == paper ||c == paper))
			System.out.println("Paper disproves Spock");
		else if ((p == rock ||c == rock)&&(p == spock ||c == spock))
			System.out.println("Spock vaporizes Rock");
		else if ((p == rock ||c == rock)&&(p == scissors || c== scissors))
			System.out.println("Rock crushes Scissors");
		
		
	}
	public static void main(String[] args) {
		int playerChoice = getPlayerChoice();
		int compChoice = getCompChoice();
		int winner;
		printChoices(playerChoice,compChoice);
		winner=whoWon(playerChoice,compChoice);
		whyWon(playerChoice,compChoice);
		printWin(winner);
		
	}
	}
