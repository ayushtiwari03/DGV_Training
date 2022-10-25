package main;

import java.util.Scanner;

import modules.QuizConsole;

public class QuizMain {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int userChoice;
		QuizConsole quizConsole = new QuizConsole();
		quizConsole.rankData();
		do {
			System.out.println();
			System.out.println("Select your choice");
			System.out.println("1. Start Quiz");
			System.out.println("2. View Top 5 Ranking");
			System.out.println("0. Exit");
			userChoice = scanner.nextInt();
			scanner.nextLine();
			switch(userChoice) {
			case 1:{
				System.out.println("Enter your name");
				String playerName = scanner.nextLine();
				quizConsole.startQuiz(playerName);
				break;
			}case 2:{
				quizConsole.viewRanking();
				break;
			}default:{
				System.out.println("You have exited the game");
				break;
			}
			}
		}while(userChoice!=0);
	}

	}


