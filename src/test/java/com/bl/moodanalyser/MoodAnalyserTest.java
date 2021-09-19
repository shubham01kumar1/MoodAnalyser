package com.bl.moodanalyser;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void givenAMessageInConstructor_whenMessageContainsWordSad_shouldReturnSAD() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood");

        String mood = moodAnalyser.analyseMood();

        Assert.assertThat(mood, CoreMatchers.is("SAD"));
    }

    @Test
    public void givenAMessageInConstructor_whenMessageNotContainsWordSad_shouldReturnHAPPY(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in happy mood");

        String mood = moodAnalyser.analyseMood();

        Assert.assertThat(mood,CoreMatchers.is("HAPPY"));

    }
}
