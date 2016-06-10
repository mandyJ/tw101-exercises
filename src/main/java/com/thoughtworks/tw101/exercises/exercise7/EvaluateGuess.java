package com.thoughtworks.tw101.exercises.exercise7;

/**
 * Created by Mandy on 2016-06-09.
 */
public class EvaluateGuess{

    private final int goalValue;

    public EvaluateGuess(int goalValue){
        this.goalValue = goalValue;
    }

    public boolean evaluate( int guess) {
        boolean result = false;

        if (goalValue == guess)
            result = true;

        return result;
    }
}
