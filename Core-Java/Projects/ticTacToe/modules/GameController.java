package modules;

import java.util.ArrayList;
import java.util.Scanner;

public class GameController {
	
	Scanner scanner = new Scanner(System.in);
	Player user1= new Player();;
	Player user2=new Player();
	
	int win1=0;
	int win2=0;
	
	public void addPlayer(String player1,String player2) {
		
		user1.setPlayer(player1);
		user2.setPlayer(player2);
		
		startGame();
	}
	
	String [] game = new String[9];
	public void displayGame() {
		int k=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(game[k]+" ");
				k++;
			}
			System.out.println();
		}
	}
	int temp;
	public void startGame() {
		
		game = new String[] {"1","2","3","4","5","6","7","8","9"};
		int player1Position;
		int player2Position;
		this.displayGame();
	    temp =1;
		do {
			System.out.println("Player1, Enter Your Position");
			player1Position = scanner.nextInt();
			game[player1Position-1] = "X";
			this.displayGame();
			this.checkWin(player1Position-1);
			if(temp == 0) {
				break;
			}
			System.out.println("Player2, Enter Your Position");
			player2Position = scanner.nextInt();
			game[player2Position-1] = "O";
			this.displayGame();
			this.checkWin(player2Position-1);
			
		}while(temp != 0);
		
	}
	
	public void checkWin(int position) {
		if(
			(game[0]==game[1] && game[0]==game[2])||	
			(game[3]==game[4] && game[3]==game[5])||
			(game[6]==game[7] && game[6]==game[8])||
			(game[0]==game[3] && game[3]==game[6])||
			(game[1]==game[4] && game[4]==game[7])||
			(game[2]==game[5] && game[5]==game[8])||
			(game[0]==game[4] && game[4]==game[8])||
			(game[2]==game[4] && game[4]==game[6])
				
			) {
			if(game[position]=="X") {
				System.out.println("Player1 wins");
				win1++;
				user1.setStreak(win1);
				
			}else {
				System.out.println("Player2 wins");
				win2++;
				user2.setStreak(win2);
			}
			temp = 0;
		}
	}
	
	public void viewStreak() {
		
		System.out.println(user1.getPlayer()+"   "+user1.getStreak());
		System.out.println(user2.getPlayer()+"   "+user2.getStreak());
		
	}
		
		
		
	}


