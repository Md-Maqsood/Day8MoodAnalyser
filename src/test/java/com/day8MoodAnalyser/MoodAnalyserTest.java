package com.day8MoodAnalyser;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyserTest {
	
	@Rule
	public ExpectedException thrown=ExpectedException.none();
	
	@Test
	public void givenMessage_WhenSad_shouldReturnSad() {
		MoodAnalyser moodAnalyser=new MoodAnalyser("I am in Sad Mood");
		String mood=null;
		try {
			mood = moodAnalyser.analyseMood();
		} catch (MoodAnalysisException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals("SAD", mood);
	}
	
	@Test
	public void givenMessage_WhenAny_shouldReturnHappy() {
		MoodAnalyser moodAnalyser=new MoodAnalyser("I am in Any Mood");
		String mood=null;
		try {
			mood = moodAnalyser.analyseMood();
		} catch (MoodAnalysisException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals("HAPPY", mood);
	}
	
	@Test
	public void givenMessage_WhenNull_shouldThrowMoodAnalysisException() throws MoodAnalysisException {
		thrown.expect(MoodAnalysisException.class);
		MoodAnalyser moodAnalyser=new MoodAnalyser(null);
		moodAnalyser.analyseMood();
	}
}
