package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by Mandy on 2016-06-09.
 */
public class Orc implements Monster {

    private static String name = "Orc";
    private float hitPoints = 20;
    private static double damageRatio = 1;


    public void takeDamage(int amount){
        hitPoints-=amount*damageRatio;
    }

    public void reportStatus(){
        System.out.print("\nName: " + name + "\n");
        System.out.print("Hit Points: " + hitPoints + "\n");

    }

}
