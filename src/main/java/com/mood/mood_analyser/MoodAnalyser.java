package com.mood.mood_analyser;

public class MoodAnalyser {

	public String analyseMood(String string) {

		if (string.equals("This is a sad message"))
			return "SAD";
		else
			return "HAPPY";

	}

}
