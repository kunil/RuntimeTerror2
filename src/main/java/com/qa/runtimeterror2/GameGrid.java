package com.qa.runtimeterror2;

import java.util.concurrent.ThreadLocalRandom;

public class GameGrid {
	
	// attributes: grid size, monster obj, player obj, treasure obj
	public int gridSize = 5;
	public int[][] gameGrid;
	public Monster[] monsterArray = new Monster[1];
	
	//monsterArray[0].posX=1;
	
	public Player player = new Player();
	public Treasure treasure = new Treasure();
//	public boolean gameOver;
	
	// TO BE IMPLEMENTED
//	public void createGrid() {
//		// description: update object gameGrid to grid of grid size
//		for (int i=0;i<gridSize;i++) {
//			
//		}
//	}
	
	public void gameGridInit() {
		
		// player config
		int[] plrPositionArr = {0,0};
		GameEntity gameEntity = new GameEntity();
		gameEntity.setPosition(plrPositionArr);
		
		// monster config
		Monster monster = new Monster();
		int[] monsterInitPos = {ThreadLocalRandom.current().nextInt(0, gridSize-1),
				ThreadLocalRandom.current().nextInt(0, gridSize-1)};
		monster.setPosition(monsterInitPos); // fill in later
		monsterArray[0] = monster;
		
		// treasure config
		Treasure treasure = new Treasure();
		int[] treasureInitPos = {ThreadLocalRandom.current().nextInt(0, gridSize-1),
				ThreadLocalRandom.current().nextInt(0, gridSize-1)};
		treasure.setPosition(treasureInitPos);
	}
	
	public void resetPlayerPosition() {
		int[] newPos = {0,0};
		player.setPosition(newPos);
	}
	
	public void updatePlayerPosition(String userInput) {
		int pMove[] = player.playerMove(userInput);
		int newX = pMove[0] + player.getPosition()[0];
		int newY = pMove[1] + player.getPosition()[1];
		int[] newPos = {newX, newY};
		player.setPosition(newPos);
	}
	
	public int[] gridMovePlayer(String userInput) {
		return player.playerMove(userInput);
	}
	
	public boolean outOfBounds(int[] playerMoveArr) {
	// description: checks if future player position is outside bounds of array
	// if player position outside bounds of array, return true
		// output: invalid move
		// prompt player to input next move until valid
		
	// if not outside, return false
		// update player position
		
		int playerX = player.getPosition()[0];
		int playerY = player.getPosition()[1];
		
		if (playerX+playerMoveArr[0]<0 || playerX+playerMoveArr[0]>gridSize-1) {
			return true;
		}
		if (playerY+playerMoveArr[1]<0 || playerY+playerMoveArr[1]>gridSize-1) {
			return true;
		}
		return false;
		
	}
	

	public int detectCollision() {
		// description: checks if player position is equal to treasure or monster position
			// if player position = treasure position
				// output: treasure.displayMessage()
				// return 1
			// if player position = monster position
				// output: unique monster method
				// return 0
		if (player.getPosition()[0]==treasure.getPosition()[0] && player.getPosition()[1]==treasure.getPosition()[1]) {
			treasure.displayUniqueMessage();
			return 1;
		} else {
			for (int i=0;i<monsterArray.length;i++) {
				if (player.getPosition()[0]==(monsterArray[i].getPosition()[0]) && player.getPosition()[1]==(monsterArray[i].getPosition()[1])){
					monsterArray[i].displayUniqueMessage();
					return 0;
				}
			}
		}
		return 2;
	}
	

	public void displayGrid() {
		// description: displays grid with player shown
			// don't want to show monster or treasure as that ruins concept of game
		System.out.println("Tx:"+treasure.getPosition()[0]);
		System.out.println("Tx:"+treasure.getPosition()[1]);
		
		
		for (int j=gridSize-1;j>=0;j--) {
			for (int i=0;i<gridSize;i++) {
				if (i == player.getPosition()[0] && j==player.getPosition()[1]) {
					System.out.print("P ");
				} 
				else if(i == monsterArray[0].getPosition()[0] && j==monsterArray[0].getPosition()[1]) {
					System.out.print("O ");
					
				}
				else if(i == treasure.getPosition()[0] && j==treasure.getPosition()[1]) {
					System.out.print("T ");
				}
				else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
	

			

}
