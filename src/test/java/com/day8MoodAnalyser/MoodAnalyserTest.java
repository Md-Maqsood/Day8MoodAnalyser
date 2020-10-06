package com.day8MoodAnalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

	@Test
	public void givenMessage_WhenSad_shouldReturnSad() {
		MoodAnalyser moodAnalyser=new MoodAnalyser("I am in Sad Mood");
		String mood=moodAnalyser.analyseMood();
		Assert.assertEquals("SAD", mood);
	}
	
	@Test
	public void givenMessage_WhenAny_shouldReturnHappy() {
		MoodAnalyser moodAnalyser=new MoodAnalyser("I am in Any Mood");
		String mood=moodAnalyser.analyseMood();
		Assert.assertEquals("HAPPY", mood);
	}
	
	@Test
	public void givenMessage_WhenNull_shouldReturnHappy() {
		MoodAnalyser moodAnalyser=new MoodAnalyser(null);
		String mood=moodAnalyser.analyseMood();
		Assert.assertEquals("HAPPY", mood);
	}
}
