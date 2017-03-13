package com.company;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int numOfQuestions = 7;
        int score = 0;
        int pick;
        String answer;
        Random rand = new Random();
        ArrayList<Question>  mQuestions = new ArrayList<>();

        mQuestions.add(Question.createQuestion(1,"1+1","magelan"));
        mQuestions.add(Question.createQuestion(2,"2+2","4"));
        mQuestions.add(Question.createQuestion(3,"3+3","6"));
        mQuestions.add(Question.createQuestion(4,"4+4","8"));
        mQuestions.add(Question.createQuestion(5,"5+5","10"));
        mQuestions.add(Question.createQuestion(6,"6+6","12"));
        mQuestions.add(Question.createQuestion(7,"7+7","14"));


        System.out.println("Answer the following:");

       while(score < 5) {

           pick = rand.nextInt(numOfQuestions) ;
           Question currentQuestion = mQuestions.get(pick);
           System.out.println(currentQuestion.getQuestion()+": ");
           answer = sc.next();
           if(currentQuestion.checkAnswer(answer)){
               score = score + 1;
           } else score =-1;

           System.out.println(score);

        }

    }
}
