package Wk3Lab13RPS;

public abstract class Player {
	
	private String name;
	private RoShamBo value;
	
	public abstract RoShamBo generateRoShamBo();
	
	
	public Player() {
		
	}

	public Player(String name, RoShamBo value) {
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public RoShamBo getValue() {
		return value;
	}

	public void setValue(RoShamBo value) {
		this.value = value;
	}
	
	
	

}
