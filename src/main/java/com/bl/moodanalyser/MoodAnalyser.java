package com.bl.moodanalyser;

public class MoodAnalyser {
    private String message;

    public MoodAnalyser() {

    }

    public MoodAnalyser( String message ) {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalysisException  {

           if( message == null ) {
               throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.NULL, "message can not be null");
           }
           else if( message.isEmpty() ) {
               throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.EMPTY, "message is empty");
           }
           else if (message.contains("sad")) {
               return "SAD";
           }
           else {
               return "HAPPY";
           }
    }

}
