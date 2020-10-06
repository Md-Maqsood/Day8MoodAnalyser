package com.day8MoodAnalyser;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
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
}
