package Wk3Lab13RPS;

import java.util.Scanner;

public class Wk3Lab13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Player user = new Human();
		Player opponent = null;
		String competitor = null;

		RoShamBo userValue = null;
		RoShamBo oppValue;
		String userName;
		String userCont = "Y";

		// Prompt user for name
		userName = Validator.getString(scan, "Please enter your name: ");

		user.setName(userName);

		while (userCont.equalsIgnoreCase("y")) {
		// Prompt user to select opponent and validate selection
		String oppChoice = Validator.getString(scan,
				userName + ", would you like to play against Rocky or Edward ScissorHands? (enter R or E)");
		if (oppChoice.equalsIgnoreCase("R")) {
			opponent = new RockPlayer();
			competitor = "Rocky";
			opponent.setName("Rocky");
			// System.out.println("You and " + competitor + " are now playing!");
		} else if (oppChoice.equalsIgnoreCase("E")) {
			opponent = new PlayerRand();
			competitor = "Edward ScissorHands";
			// System.out.println("You and " + competitor + " are now playing!");
		}
		while ((!oppChoice.equalsIgnoreCase("R")) && (!oppChoice.equalsIgnoreCase("E"))) {
			oppChoice = Validator.getString(scan,
					userName + ", would you like to play against Rocky or Edward ScissorHands? (enter R or E)");
		}

		// Prompt user for his/her play and display choice
		String beginChoice = Validator.getString(scan, "Enter R/P/S for your selection of rock, paper, or scissors.");
		if (beginChoice.equalsIgnoreCase("R")) {
			userValue = RoShamBo.ROCK;
			System.out.println(userName + ", you've played Rock!");
		} else if (beginChoice.equalsIgnoreCase("P")) {
			userValue = RoShamBo.PAPER;
			System.out.println(userName + ", you've played Paper!");
		} else if (beginChoice.equalsIgnoreCase("S")) {
			userValue = RoShamBo.SCISSORS;
			System.out.println(userName + ", you've played Scissors!");
		}

		// initiate/detail opponents' move
		oppValue = opponent.generateRoShamBo();
		opponent.setValue(oppValue);
		System.out.println(competitor + " played " + oppValue + "!");

		// display results of round
		if (userValue == oppValue) {
			System.out.println("Draw!");
		} else if ((userValue == RoShamBo.ROCK) && (oppValue == RoShamBo.PAPER)) {
			System.out.println(competitor + " wins!");
		} else if ((userValue == RoShamBo.ROCK) && (oppValue == RoShamBo.SCISSORS)) {
			System.out.println(userName + " wins!");
		} else if ((userValue == RoShamBo.PAPER) && (oppValue == RoShamBo.SCISSORS)) {
			System.out.println(competitor + " wins!");
		} else if ((userValue == RoShamBo.PAPER) && (oppValue == RoShamBo.ROCK)) {
			System.out.println(userName + " wins!");
		} else if ((userValue == RoShamBo.SCISSORS) && (oppValue == RoShamBo.ROCK)) {
			System.out.println(competitor + " wins!");
		} else if ((userValue == RoShamBo.SCISSORS) && (oppValue == RoShamBo.PAPER)) {
			System.out.println(userName + " wins!");
		}
		
		userCont = Validator.getString(scan, "Continue playing? (Y/N)");
	}
}
}
