package com.thoughtworks.tw101.exercises.exercise8;

/**
 * Created by Mandy on 2016-06-09.
 */
public class RandomGen {

    private final int min;
    private final int max;

    public RandomGen(int min, int max){
        this.min = min;
        this.max = max;
    }

    public int getRandomNum(){

        int result = (int)(Math.random() * ((max - min) + 1) + min);
        return result;
    }
}
