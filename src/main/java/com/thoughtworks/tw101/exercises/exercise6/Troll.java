package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by Mandy on 2016-06-09.
 */
public class Troll implements Monster {

    private final String name = "Troll";
    private float hitPoints = 40;
    private final double damageRatio = 0.5;


    public void takeDamage(int amount){
        hitPoints-=amount*damageRatio;
    }

    public void reportStatus(){
        System.out.print("\nName: " + name + "\n");
        System.out.print("Hit Points: " + hitPoints + "\n");

    }

}
