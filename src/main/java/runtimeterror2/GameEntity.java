package runtimeterror2;

public class GameEntity {
	
	// location
	// unique message
	public int posX;
	public int posY;
	
	
	// entity (subclasses) = treasure, monster, player
	
	// TO BE IMPLEMENTED
	public int[] getPosition() {
		// description: take posX and posY, return as array
		int a[]= {posX,posY};
		return a;
	}
	
	// TO BE IMPLEMENTED
	public void setPosition(int pos[]) {
		// description: player posX=0, posY=0
		pos[0]=posX;
		pos[1]=posY;
	}
		
	


}
