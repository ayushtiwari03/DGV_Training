package main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class SortGoals implements Comparator<Player> {

	@Override
	public int compare(Player p1, Player p2) {

		return p1.getGoals() - p2.getGoals();
	}
	
}

public class PlayerController {
	
	Player[] players = new Player[5];
	Scanner sc = new Scanner(System.in);
	int playerCount;
	
	public void addPlayer() {
		int index = 0;
		for(int i=0; i<5;i++) {
			
			if(players[i] == null) {
				index = i;
				break;
			}
			
		}
		System.out.println("Enter Name, Goals, Age, Club and Country Res");
		String name = sc.nextLine();
		int goals = sc.nextInt();
		int age = sc.nextInt();
		sc.nextLine();
		String club = sc.nextLine();
		String country = sc.nextLine();
		
		players[index] = new Player(name, goals, age, club, country);
		playerCount++;
	    }
	
	public void viewPlayers() {
		int a = 1;
		for(int i=0; i<5; i++) {
			
			if(players[i] != null) {
			System.out.println(a +" "+ players[i]);
			a++;
			}
			else {
				break;
			}
		}
		
	}
	
	public void viewPlayerOps() {
		
            for(int i=0; i<5; i++) {
			
			if(players[i] != null) {
			System.out.println((i+1) +" "+ players[i]);
			}
			else {
				break;
			}
		}
		
	}
	
	public void deletePlayer() {
		System.out.println("Enter your choice to delete");
		int choice = sc.nextInt();
		if(players[choice-1] == null) {
			System.out.println("You can't delete this element");
		}
     	players[choice-1] = null;
		for(int i=choice-1; i<4; i++) {
			players[i] = players[i+1];
		}
		
	}
	
	public void sortPlayer() {
		
		Player[] playerCopy = new Player[playerCount];
		for(int i=0;i<playerCopy.length;i++) {
			playerCopy[i] = players[i];
		}
		
		Arrays.sort(playerCopy, new SortGoals());
		
		for(int i=0;i<playerCopy.length;i++) {
			System.out.println(playerCopy[i]);
		}
		 
	}
	
	public void updatePlayer() {
		viewPlayerOps();
		int playerNumber;
		int propertyNumber;
		System.out.println("Choose Player by number");
		playerNumber = sc.nextInt();
		System.out.println("Select Property");
		System.out.println("1.Name");
		System.out.println("2.Goals");
		System.out.println("3.Age");
		System.out.println("4.Club");
		System.out.println("5.Country");
		
		propertyNumber = sc.nextInt();
		sc.nextLine();
		
		switch(propertyNumber) {
		    case 1: {
		    	System.out.println("Enter Name");
		    	String name = sc.nextLine();
		    	players[playerNumber-1].setName(name);
		    	break;
			    
		    }
		    
		    case 2: {
		    	System.out.println("Enter Goals");
		    	int goals = sc.nextInt();
		    	players[playerNumber-1].setGoals(players[playerNumber-1].getGoals() + goals);
		    	break;
		    }
		    
		    case 3: {
		    	System.out.println("Enter Age");
		    	int age = sc.nextInt();
		    	sc.nextLine();
		    	players[playerNumber-1].setAge(age);
		    	break;
		    }
		    
		    case 4: {
		    	System.out.println("Enter Club");
		    	String club = sc.nextLine();
		    	players[playerNumber-1].setClub(club);
		    	break;
		    }
		    
		    case 5: {
		    	System.out.println("Enter Country");
		    	String country = sc.nextLine();
		    	players[playerNumber-1].setCountry(country);
		    	break;
		    }
		}
		
	}

}
