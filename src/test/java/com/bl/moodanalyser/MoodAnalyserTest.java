package com.bl.moodanalyser;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.CoderResult;

public class MoodAnalyserTest {
    @Test
    public void givenAMessage_whenMessageContainsWordSad_ShouldReturnSAD() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();

        String mood = moodAnalyser.analyseMood("I am in sad mood");

        Assert.assertThat(mood, CoreMatchers.is("SAD"));
    }

    @Test
    public void givenAMessage_whenMessageNotContainsWordSad_ShouldReturnHAPPY(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();

        String mood = moodAnalyser.analyseMood("i am in any mood");

        Assert.assertThat(mood,CoreMatchers.is("HAPPY"));

    }
}
