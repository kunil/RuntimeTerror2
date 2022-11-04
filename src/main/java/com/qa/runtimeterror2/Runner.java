package com.qa.runtimeterror2;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runner.displayGameHome(); //display the game menu

		String input = "";
		Scanner sc = new Scanner(System.in);
		while (true) {

		System.out.println("Do you want to play a new game [y/n]");
		input = sc.nextLine();

		if (input.equalsIgnoreCase("y")) {
			
			 RunGame newGame= new RunGame();
			 System.out.println("Object created"+newGame);
			 newGame.runGame();
			 System.out.println("Game created");
		}

		else {
			System.out.println("Thanks for playing the game see you next time");
			break;
		}

		 }
	}
	
	// TO BE IMPLEMENTED
	public static void displayGameHome() {
		// example: welcome to game!
		// explain key
		
		System.out.println("Welcome to the adventure game");
		System.out.println("Your goal is to play for the treasure and avoid the monsters :)");
		System.out.println("You can move in four directions press w-north,s-south,a-left,d-right");
	}
}
	
	

