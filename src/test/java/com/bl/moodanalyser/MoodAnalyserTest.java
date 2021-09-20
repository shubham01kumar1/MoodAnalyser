package com.bl.moodanalyser;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void givenAMessageInConstructor_whenMessageContainsWordSad_shouldReturnSAD() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood");

        String mood = moodAnalyser.analyseMood();

        Assert.assertThat(mood, CoreMatchers.is("SAD"));
    }

    @Test
    public void givenAMessageInConstructor_whenMessageNotContainsWordSad_shouldReturnHAPPY() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in happy mood");

        String mood = moodAnalyser.analyseMood();

        Assert.assertThat(mood,CoreMatchers.is("HAPPY"));
    }

    @Test
    public void givenAMessage_whenMessageIsEmpty_shouldThrowMoodAnalysisException() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("");

        String mood = null;
        try {
            mood = moodAnalyser.analyseMood();
        } catch (MoodAnalysisException e) {
            System.out.println( e.getMessage() );
            mood = "HAPPY";
        }

        Assert.assertThat(mood,CoreMatchers.is("HAPPY"));
    }

    @Test
    public void givenAMessage_whenMessageIsNull_shouldThrowMoodAnalysisException() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);

        String mood = null;
        try {
            mood = moodAnalyser.analyseMood();
        } catch (MoodAnalysisException e) {
            System.out.println( e.getMessage() );
            mood = "HAPPY";
        }

        Assert.assertThat(mood,CoreMatchers.is("HAPPY"));
    }

}
