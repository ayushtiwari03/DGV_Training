package main;

import java.util.Scanner;

public class PlayerMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PlayerController p = new PlayerController(); 
		int choice;
		
		do {
			System.out.println("Enter your choice");
			System.out.println("1.Add Player");
			System.out.println("2.View Players");
			System.out.println("3.Delete Players");
			System.out.println("4.Sort Players");
			System.out.println("5.Update Players");
			System.out.println("0.Exit");
			
			choice  = sc.nextInt();
			
			switch(choice) {
			    case 1: {
			    	p.addPlayer();
				    break;
			    }
			
			    case 2: {
			    	p.viewPlayers();
				    break;
			    }
			
			    case 3: {
			    	p.deletePlayer();
				    break;
			    }
			    
			    case 4: {
			    	p.sortPlayer();
			    	break;
			    	
			    }
			    
			    case 5: {
			    	p.updatePlayer();
			    	break;
			    }
			
			    default: {
				    System.out.println("You have Exited the game!!! ");
			    }
			}
		}
		while(choice != 0);

	}

}
