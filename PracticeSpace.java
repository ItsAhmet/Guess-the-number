import java.util.Scanner;
//import java.util.Random;
public class PracticeSpace {
public static void main(String args []) {
	int mysNum=7;
	int userGuess;
	Scanner scan = new Scanner( System.in );;
	
	System.out.println("Guess a number between 1 and 10:");
	userGuess=scan.nextInt();	
	if (userGuess==mysNum)
		System.out.println("Correct!\nThe answer was "+mysNum);
	else
		System.out.println("False answer! Try again");
			}
	}
			


