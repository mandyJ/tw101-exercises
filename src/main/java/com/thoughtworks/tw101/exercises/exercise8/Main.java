package com.thoughtworks.tw101.exercises.exercise8;

//Create a new version of Exercise #7 where you also record all of the user’s guesses and print them out once they
// guess correctly. Use an ArrayList to store the guesses. Catch the NumberFormatException and handle the case where
// the user entered a String that is not parseable.

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int min=1;
        int max=100;
        ArrayList pastAnswers = new ArrayList();

        RandomGen randomGen = new RandomGen(min,max);
        int randomNum = randomGen.getRandomNum();
        //System.out.print("Random number is: " + randomNum);

        PromptUser prompt = new PromptUser();
        int response;
        EvaluateGuess evaluateGuess = new EvaluateGuess(randomNum);
        boolean guessRight;

        do {
            response = prompt.askUserAndGetResponse("Guess from " + min + " to " + max + ": ");
            pastAnswers.add(response);
            guessRight = evaluateGuess.evaluate(response);

            if(guessRight) {
                System.out.print("You win!\n");
                System.out.print("Your guesses: " + pastAnswers);
            }else {
                evaluateGuess.getHint();
            }
        }while(!guessRight);


    }
}
