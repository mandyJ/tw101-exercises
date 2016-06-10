package com.thoughtworks.tw101.exercises.exercise7;

// Write a program that chooses a random number between 1 and 100. Then asks the user to enter a guess. If they guess
// right then tell them they win, otherwise tell them if they guessed too high or low. Keep asking the user to guess
// until they get the right answer. Use classes to separate the different concerns of this program.

public class Main {

    public static void main(String[] args) {

        int min=1;
        int max=100;

        RandomGen randomGen = new RandomGen(min,max);
        int randomNum = randomGen.getRandomNum();
        //System.out.print("Random number is: " + randomNum);

        PromptUser prompt = new PromptUser();
        int response;
        EvaluateGuess evaluateGuess = new EvaluateGuess(randomNum);
        boolean guessRight;

        do {
            response = prompt.askUserAndGetResponse("Guess from " + min + " to " + max + ": ");
            guessRight = evaluateGuess.evaluate(response);

            if(guessRight)
                System.out.print("You win!");
            else
                evaluateGuess.getHint();
        }while(!guessRight);


    }
}
