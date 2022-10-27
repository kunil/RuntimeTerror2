package runtimeterror2;

public class GameGrid {
	
	// attributes: grid size, monster obj, player obj, treasure obj
	public int gridSize;
	public int[][] gameGrid;
	public Monster[] monsterArray;
	public Player player;
	public Treasure treasure;
	public boolean gameOver;
	
	// methods: create grid, check out of player bounds, detect collision (monster or treasure), if game over
	
	// TO BE IMPLEMENTED
	public void createGrid() {
		// description: update object gameGrid to grid of grid size
	}
	
	
	// TO BE IMPLEMENTED
	public void checkBounds() {
	// description: checks if future player position is outside bounds of array
	// if player position outside bounds of array
		// output: invalid move
		// prompt player to input next move until valid
	// if not outside
		// update player position	
	}
	
	// TO BE IMPLEMENTED
	public void detectCollision() {
		// description: checks if player position is equal to treasure or monster position
			// if player position = treasure position
				// output: treasure.displayMessage()
				// gameOver = true
			// if player position = monster position
				// output: unique monster method
				// player goes back to starting position (update player position)	
	}
	

			

}
