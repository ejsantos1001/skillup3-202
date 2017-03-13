package com.company;

/**
 * Created by Ej on 3/13/2017.
 */
public class Question {
    private Integer mQuestionID;
    private String mQuestion;
    private String mAnswer;


    public Question(Integer questionID, String question, String answer) {
        mQuestionID = questionID;
        mQuestion = question;
        mAnswer = answer;
    }

    public void setQuestionID(int questionID) {
        mQuestionID = questionID;
    }

    public void setQuestion(String question) {
        mQuestion = question;
    }

    public void setAnswer(String answer) {
        mAnswer = answer;
    }

    public Integer getQuestionID() {
        return mQuestionID;
    }

    public String getQuestion() {
        return mQuestion;
    }

    public String getAnswer() {
        return mAnswer;
    }

    public static Question createQuestion(Integer questionID, String question, String answer){
        return new Question(questionID, question,answer);
    }

    public boolean checkAnswer(String answer) {
        if(this.mAnswer.equals(answer)) {
            return true;
        } else return false;

    }
}
