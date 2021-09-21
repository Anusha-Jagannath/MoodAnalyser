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

	/**
	 * method to analyze mood
	 * 
	 * @param string which contains happy or sad message
	 * @return HAPPY or SAD
	 * @throws MoodAnalysisException 
	 */
	public String analyseMood(String string) throws MoodAnalysisException {
		try {
			if (string.equals("This is a sad message"))
				return "SAD";
			else
				return "HAPPY";
		} catch (NullPointerException e) {
			throw new MoodAnalysisException("Please enter valid mood");
		}
	}

	/**
	 * method to analyze the mood
	 * 
	 * @return HAPPY or SAD
	 */
	public String analyseMood() {
		if (this.message.equals("This is a sad message"))
			return "SAD";
		else
			return "HAPPY";
	}
}
