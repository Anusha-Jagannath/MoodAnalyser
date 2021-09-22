package com.mood.mood_analyser;

/**
 * MoodAnalysisException is custom exception class
 */
public class MoodAnalysisException extends Exception {

	enum ExceptionType {
		ENTERED_NULL, ENTERED_EMPTY
	};

	ExceptionType type;

	public MoodAnalysisException(ExceptionType type, String message) {
		super(message);
		this.type = type;
	}
}
