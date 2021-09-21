package com.mood.mood_analyser;

/**
 * MoodAnalyser class contains method analyseMood which takes string as input
 * and checks whether string is happy or sad using simple if statements
 */
public class MoodAnalyser {

	String message;

	// default constructor
	public MoodAnalyser() {

	}

	// parameterized constructor to initialize message field
	public MoodAnalyser(String message) {
		this.message = message;
	}

	public String analyseMood(String string) {

		if (string.equals("This is a sad message"))
			return "SAD";
		else
			return "HAPPY";

	}

	public String analyseMood() {

		if (this.message.equals("This is a sad message"))
			return "SAD";
		else
			return "HAPPY";

	}

}
