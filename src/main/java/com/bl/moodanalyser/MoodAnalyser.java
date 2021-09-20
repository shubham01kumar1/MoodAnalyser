package com.bl.moodanalyser;

public class MoodAnalyser {
    private String message;

    public MoodAnalyser() {

    }

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood()  {
       try {
           if (message.contains("sad")) {
               return "SAD";
           } else {
               return "HAPPY";
           }
       }
       catch (NullPointerException e) {
           return "HAPPY";
       }
    }

}
