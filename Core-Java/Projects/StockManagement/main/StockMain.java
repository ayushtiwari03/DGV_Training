package main;

import java.util.Scanner;

import modules.StockController;

public class StockMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		StockController stock = new StockController();
		int choice;
		
		do {
			stock.add();
			System.out.println("Enter your menu choice");
			System.out.println("1. Display Stocks");
			System.out.println("2. View Performance");
			System.out.println("3. Search Stock");
			System.out.println("4. Sort Stocks");
			System.out.println("5. Calculate profit");
			System.out.println("0. Exit");
			
			choice  = scanner.nextInt();
			scanner.nextLine();			
			switch(choice) {
			    case 1: {
			    	stock.displayStocks();
				    break;
			    }
			    
			    case 2: {
			    	stock.displayPerformance();
			    	break;
			    }
			    
			    case 3: {
			    	
			    	System.out.println("Enter the name of stock you want to search");
			    	String userString = scanner.nextLine();
			    	stock.searchStock(userString);
			    	break;
			    }
			    
			    case 4 : {
			    	stock.sortStock();
			    	break;
			    }
			    
			    case 5 : {
			    	System.out.println("Enter stock name");
			    	String name = scanner.nextLine();
			    	System.out.println("Enter your duration");
			    	int month = scanner.nextInt();
			    	scanner.nextLine();
			    	stock.calculateProfit(name, month);
			    }
			    
			    default : {
			    	
			    	System.out.println("You have exited the game!!!");
			    }
			    	
			}
			
		}while(choice != 0);

	}

}
