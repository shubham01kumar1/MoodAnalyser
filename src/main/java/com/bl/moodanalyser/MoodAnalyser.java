package com.bl.moodanalyser;

public class MoodAnalyser {
    private String message;

    public String analyseMood(String message) {
        if( message.contains("sad")) {
            return "SAD";
        }
        else {
            return "HAPPY";
        }
    }
}
