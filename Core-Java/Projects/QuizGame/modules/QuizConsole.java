package modules;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuizConsole {
	
ArrayList <Rank> rank = new ArrayList<Rank>();
	
	public void rankData() {
		rank.add(new Rank("Ayush",90));
		rank.add(new Rank("Shivam",75));
		rank.add(new Rank("Sujaan",65));
		rank.add(new Rank("Ankur",80));
		rank.add(new Rank("Satyam",55));
	}
	
	Scanner scanner = new Scanner(System.in);
	
	public void startQuiz(String name) {
		int score =0;
		int userChoice;
		System.out.println();
		System.out.println("Warning!! You will get +10 points for the right answer! and you will get -5 points also for the wrong answer!");
		System.out.println("Lets get started!!");
		System.out.println();
		System.out.println("A. Who invented Java Programming?");
		System.out.println("1.  James Gosling");
		System.out.println("2. Bjarne Stroustrup");
		userChoice = scanner.nextInt();
		switch(userChoice) {
		case 1:{
			System.out.println("Correct, +10 points");
			score+=10;
			break;
		}default:{
			score-=5;
			System.out.println("Incorrect, -5 points");
			break;
		}
		}
		System.out.println();
		System.out.println("B. What year was the very first model of the iPhone released?");
		System.out.println("1. 2009");
		System.out.println("2. 2007");
		userChoice = scanner.nextInt();
		switch(userChoice) {
		case 2:{
			System.out.println("Correct, +10 points");
			score+=10;
			break;
		}default:{
			score-=5;
			System.out.println("Incorrect, -5 points");
			break;
		}
		}
		System.out.println();
		System.out.println("C. Which planet is the hottest in the solar system?");
		System.out.println("2. Mars");
		System.out.println("3. Venus");
		userChoice = scanner.nextInt();
		switch(userChoice) {
		case 3:{
			System.out.println("Correct, +10 points");
			score+=10;
			break;
		}default:{
			score-=5;
			System.out.println("Incorrect, -5 points");
			break;
		}
		}
		System.out.println();
		System.out.println("D. What was Superman’s birth name?");
		System.out.println("1. Clark Klent");
		System.out.println("2. Kal-El");
		userChoice = scanner.nextInt();
		switch(userChoice) {
		case 2:{
			System.out.println("Correct, +10 points");
			score+=10;
			break;
		}default:{
			score-=5;
			System.out.println("Incorrect, -5 points");
			break;
		}
		}
		System.out.println();
		System.out.println("E.What does DC stand for?");
		System.out.println("2. Daily Comics");
		System.out.println("3. Detective Comics");
		userChoice = scanner.nextInt();
		switch(userChoice) {
		case 3:{
			System.out.println("Correct, +10 points");
			score+=10;
			break;
		}default:{
			score-=5;
			System.out.println("Incorrect, -5 points");
			break;
		}
		}
		System.out.println();
		System.out.println("F. Is Java Object Oriented Programming Language?");
		System.out.println("1. Yes");
		System.out.println("2. No");
		userChoice = scanner.nextInt();
		switch(userChoice) {
		case 1:{
			System.out.println("Correct, +10 points");
			score+=10;
			break;
		}default:{
			score-=5;
			System.out.println("Incorrect, -5 points");
			break;
		}
		}
		System.out.println();
		System.out.println("G. How many films did Sean Connery play James Bond in?");
		System.out.println("1. 7");
		System.out.println("2. 9");
		userChoice = scanner.nextInt();
		switch(userChoice) {
		case 1:{
			System.out.println("Correct, +10 points");
			score+=10;
			break;
		}default:{
			score-=5;
			System.out.println("Incorrect, -5 points");
			break;
		}
		}
		System.out.println();
		System.out.println("H. Which is the capital of India ?");
		System.out.println("1. Mumbai");
		System.out.println("4. Delhi");
		userChoice = scanner.nextInt();
		switch(userChoice) {
		case 4:{
			System.out.println("Correct, +10 points");
			score+=10;
			break;
		}default:{
			score-=5;
			System.out.println("Incorrect, -5 points");
			break;
		}
		}
		System.out.println();
		System.out.println("I. India's Independence Day is on 15th August.");
		System.out.println("1. True");
		System.out.println("2. False");
		userChoice = scanner.nextInt();
		switch(userChoice) {
		case 1:{
			System.out.println("Correct, +10 points");
			score+=10;
			break;
		}default:{
			score-=5;
			System.out.println("Incorrect, -5 points");
			break;
		}
		}
		System.out.println();
		System.out.println("J. Who played Wolverine?");
		System.out.println("1. Hugh Jackman");
		System.out.println("2. Nicholas Cage");
		userChoice = scanner.nextInt();
		switch(userChoice) {
		case 1:{
			System.out.println("Correct, +10 points");
			score+=10;
			break;
		}default:{
			score-=5;
			System.out.println("Incorrect, -5 points");
			break;
		}
		}
		System.out.println();
		System.out.println("Your final score is "+score);
		rank.add(new Rank(name,score));
	}
	
	public void viewRanking() {
		Collections.sort(rank,new SortRank());
		System.out.println();
		System.out.println("Top 5 Ranks is as follows");
		System.out.println("Name          Score");
		for(int i=0;i<5;i++) {
			System.out.println(rank.get(i).getName()+"          "+rank.get(i).getScore());
		}
	}

}
