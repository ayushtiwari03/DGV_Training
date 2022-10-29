package tic_tac_toeMain;

import java.util.Scanner;

import modules.GameController;

public class TicTacToe {
	
	
	public static void  main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	GameController gameController = new GameController();
	
	int choice;
	do{
		System.out.println("Enter Your Choice?");
		System.out.println("1. Play Game");
		System.out.println("2. View Streak");
		System.out.println("0. End Game");
		choice = scanner.nextInt();
		scanner.nextLine();
		
		switch(choice) {
		    case 1:  {
		    	System.out.println("Enter player1 name");
		    	String player1 = scanner.nextLine();
		    	System.out.println("Enter player2 name");
		    	String player2 = scanner.nextLine();
		    	gameController.addPlayer(player1,player2);
		    	break;
		    }
		    case 2: {
		    	gameController.viewStreak();
		    	break;
		    }
		    default: {
		    	System.out.println("You have exited the game");
		 }
	}
		
	}while(choice != 0);


}
}


