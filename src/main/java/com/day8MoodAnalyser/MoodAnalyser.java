package com.day8MoodAnalyser;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MoodAnalyser {
	static final Logger logger = LogManager.getLogger(MoodAnalyser.class);
	private String message;

	public MoodAnalyser(String message) {
		super();
		this.message = message;
	}

	public String analyseMood() {
		if (message.contains("Sad")) {
			return "SAD";
		} else {
			return "HAPPY";
		}
	}

	public static void main(String[] args) {
		MoodAnalyser moodAnalyser = new MoodAnalyser("This is a happy message.");
		String mood = moodAnalyser.analyseMood();
		logger.info(mood);
	}
}
