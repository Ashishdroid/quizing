package com.ashishramkissoon.quizzz;

public class answer {
    private int mQuestionId;
    private char answerABCD;

    public answer(int questionResourceId,char ans){
        mQuestionId=questionResourceId;
        answerABCD=ans;
    }

    public int getmQuestionId(){
        return mQuestionId;
    }

    public char getAnswerABCD(){
        return answerABCD;
    }
}
