package modules;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuizConsole {
	
ArrayList <QuizQuestions> quizQuestion = new ArrayList<QuizQuestions>();
ArrayList <Rank> rank	= new ArrayList<Rank>();

    public void addPlayer() {
    	rank.add(new Rank("Ayush",70));
    	rank.add(new Rank("Shivam",75));
    	rank.add(new Rank("Sujaan",65));
    	rank.add(new Rank("Divya",60));
    }
	public void addQuestions() {
		quizQuestion.add(new QuizQuestions("A. Who invented Java Programming?","1.  James Gosling","2. Bjarne Stroustrup",1));
		quizQuestion.add(new QuizQuestions("B. What year was the very first model of the iPhone released?","1. 2009","2. 2007",1));
		quizQuestion.add(new QuizQuestions("C. Which planet is the hottest in the solar system?","1. Mars","2. Venus",2));
		quizQuestion.add(new QuizQuestions("D. What was Superman’s birth name?","1. Clark Klent","2. Kal-El",1));
		quizQuestion.add(new QuizQuestions("E.What does DC stand for?","1. Daily Comics","2. Detective Comics",2));
		quizQuestion.add(new QuizQuestions("F. Is Java Object Oriented Programming Language?","1.  No","2. Yes",2));
		quizQuestion.add(new QuizQuestions("G. How many films did Sean Connery play James Bond in?","1. 7","2. 9",1));
		quizQuestion.add(new QuizQuestions("H. Which is the capital of India ?","1. Mumbai","2. Delhi",2));
		quizQuestion.add(new QuizQuestions("I. India's Independence Day is on 15th August?","1. False","2. True",2));
		quizQuestion.add(new QuizQuestions("J. Who played Wolverine?","1. Hugh Jackman","2. Nicholas Cage",1));

	}
	
	Scanner scanner = new Scanner(System.in);
	
	public void startQuiz(String name) {
		int score =0;
		
		for(int i=0;i<quizQuestion.size();i++) {
			System.out.println(quizQuestion.get(i).getQuestion());
			System.out.println(quizQuestion.get(i).getOption1());
			System.out.println(quizQuestion.get(i).getOption2());
			int answer = scanner.nextInt();
			if(quizQuestion.get(i).getCorrectOption() == answer) {
				score += 10;
			}
			else {
				score -= 5;
			}
			rank.add(new Rank(name,score));
			
		}
		System.out.println("Your score is "+score);
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
