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

	public String analyseMood() throws MoodAnalysisException {
		try {
			if (message.contains("Sad")) {
				return "SAD";
			} else {
				return "HAPPY";
			}
		} catch (NullPointerException e) {
			throw new MoodAnalysisException("Input valid message");
		}
	}

	public static void main(String[] args) {
		MoodAnalyser moodAnalyser = new MoodAnalyser("This is a happy message.");
		try{
			String mood = moodAnalyser.analyseMood();
			logger.info(mood);
		}catch(MoodAnalysisException e) {
			logger.info(e.getMessage());
		}
	}
}
