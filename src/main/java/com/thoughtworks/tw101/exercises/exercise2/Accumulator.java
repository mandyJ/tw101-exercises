package com.thoughtworks.tw101.exercises.exercise2;

public class Accumulator {
    private int count;

    public Accumulator(){
        this.count=0;
    }

    public void increment() {
        this.count++;
    }

    public void total(){
        System.out.print(this.count);
    }
}
