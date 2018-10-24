package Wk3Lab13RPS;

public class PlayerRand extends Player {

	@Override
	public RoShamBo generateRoShamBo() {
		 int randNum = (int) (Math.random() * 3);
		 
		 switch (randNum) {
		case 0:
			return RoShamBo.ROCK;

		case 1:
			return RoShamBo.PAPER;
			
		case 2:
			return RoShamBo.SCISSORS;
		default:
			return null;
		}
		 
	}

}
