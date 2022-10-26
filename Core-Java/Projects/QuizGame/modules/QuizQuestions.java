package modules;

public class QuizQuestions {
	
	private String question;
	private String option1;
	private String option2;
	private int correctOption;
	
	public QuizQuestions(String question, String option1, String option2, int correctOption) {
		super();
		this.question = question;
		this.option1 = option1;
		this.option2 = option2;
		this.correctOption = correctOption;
	}

	public String getQuestion() {
		return question;
	}

	public String getOption1() {
		return option1;
	}

	public String getOption2() {
		return option2;
	}

	public int getCorrectOption() {
		return correctOption;
	}
	
	
	
	
	

}
