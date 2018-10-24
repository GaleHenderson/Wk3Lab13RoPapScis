package Wk3Lab13RPS;

import java.util.Scanner;

public class Wk3Lab13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Player user = new Human();
		Player opponent;
		String competitor = null;
		
		RoShamBo userValue;
		RoShamBo oppValue;
		String userName;
		
		//Prompt user for name
		userName = Validator.getString(scan, "Please enter your name: ");
		
		user.setName(userName);
		
		//Prompt user to select opponent and validate selection
		String oppChoice= Validator.getString(scan, "Would you like to play against Rocky or Edward ScissorHands? (enter R or E)");
		if (oppChoice.equalsIgnoreCase("R")) {
			opponent = new RockPlayer();
			competitor = "Rocky";
		} else if (oppChoice.equalsIgnoreCase("E")) {
			opponent = new PlayerRand();
			competitor = "Edward ScissorHands";
		}while ((!oppChoice.equalsIgnoreCase("R")) && (!oppChoice.equalsIgnoreCase("E")))	{
			oppChoice= Validator.getString(scan, "Would you like to play against Rocky or Edward ScissorHands? (enter R or E)");		}
		
		
		String beginChoice = Validator.getString(scan,"You and " + competitor + " are now playing! Enter R/P/S for your selection of rock, paper, or scissors.");
		if (beginChoice.equalsIgnoreCase("R")) {
			
		}
		
		
	}

}
