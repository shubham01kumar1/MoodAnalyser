package com.bl.moodanalyser;

public class MoodAnalysisException extends Exception {
    public enum ExceptionType {
        NULL, EMPTY
    }
    public ExceptionType exceptionType ;

    public MoodAnalysisException ( ExceptionType exceptionType, String message ) {
        super(message);
        this.exceptionType = exceptionType;
    }
}
