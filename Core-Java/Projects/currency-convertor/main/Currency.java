package main;

import java.util.Scanner;

import modules.CurrencyConvertor;

public class Currency {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		CurrencyConvertor convertor = new CurrencyConvertor();
		int choice;
		do {
			System.out.println("Enter your menu choice");
			System.out.println("1. Rupee to USD");
			System.out.println("2. Rupee to AUD");
			System.out.println("3. Rupee to Pound");
			System.out.println("4. Rupee to Euro");
			System.out.println("5. Rupee to Yen");
			System.out.println("0. Exit");
			
			choice  = scanner.nextInt();		
			switch(choice) {
			    case 1: {
			    	System.out.println("Enter amount");
			    	double amount = scanner.nextDouble();
			    	convertor.rupeeToUsd(amount);
				    break;
			    }
			    
			    case 2: {
			    	System.out.println("Enter amount");
			    	double amount = scanner.nextDouble();
			    	convertor.rupeeToAud(amount);
			    	break;
			    }
			    
			    case 3: {
			    	
			    	System.out.println("Enter amount");
			    	double amount = scanner.nextDouble();
			    	convertor.rupeeToPound(amount);
			    	break;
			    }
			    
			    case 4 : {
			    	System.out.println("Enter amount");
			    	double amount = scanner.nextDouble();
			    	convertor.rupeeToEuro(amount);
			    	break;
			    }
			    
			    case 5 : {
			    	System.out.println("Enter amount");
			    	double amount = scanner.nextDouble();
			    	convertor.rupeeToYen(amount);
			    	break;
			    }
			    
			    default : {
			    	
			    	System.out.println("You have exited the game!!!");
			    }
			    	
			}
			
		}while(choice != 0);
	}

}
