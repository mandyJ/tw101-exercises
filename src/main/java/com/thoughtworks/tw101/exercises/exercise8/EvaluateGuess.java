package com.thoughtworks.tw101.exercises.exercise8;

/**
 * Created by Mandy on 2016-06-09.
 */
public class EvaluateGuess{

    private final int goalValue;
    private String hint = null;

    public EvaluateGuess(int goalValue){
        this.goalValue = goalValue;
    }

    public boolean evaluate( int guess) {
        boolean result = false;

        if (goalValue == guess)
            result = true;
        else if(goalValue < guess)
            hint = "Lower!\n";
        else
            hint = "Higher!\n";

        return result;
    }

    public void getHint(){
        System.out.print(hint);
    }
}
