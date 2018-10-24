package Wk3Lab13RPS;

import java.util.Scanner;

public class Human extends Player {

	
	
	private Scanner scan;
	
	
	@Override
	public RoShamBo generateRoShamBo() {
		scan = new Scanner(System.in);
		
		String userInput = Validator.getString(scan, "Rock, Paper, or Scissors? (R/P/S) : ");
		
		if((!userInput.equalsIgnoreCase("R")) && (!userInput.equalsIgnoreCase("P")) &&  (userInput.equalsIgnoreCase("S"))) {
			System.out.println("Invalid entry!");
		}
		if (userInput.equalsIgnoreCase("R")) {
			return RoShamBo.ROCK;
		}else if (userInput.equalsIgnoreCase("P")) {
			return RoShamBo.PAPER;
		}else if (userInput.equalsIgnoreCase("S")) {
			return RoShamBo.SCISSORS;
		}else {
			return null;
		}
		
	}

}
