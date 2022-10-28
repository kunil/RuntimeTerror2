package runtimeterror2;

public class Monster extends GameEntity{
	
	public String uniqueMessage;
	public static int posX;
	public static int posY;
	
	
	// entity (subclasses) = treasure, monster, player
	
	// TO BE IMPLEMENTED
	public int[] getPosition() {
		// description: take posX and posY, return as array
		int a[]= {posX,posY};
		return a;
	}
	
	// TO BE IMPLEMENTED
	public  void setPosition(int pos[]) {
		// description: player posX=0, posY=0
		posX=pos[0];
		posY=pos[1];
	}
		
	
	
	// TO BE IMPLEMENTED
	public void displayUniqueMessage() {
		// description: output message
		System.out.println("You've hit a monster! Go back to start.");
	}

}
