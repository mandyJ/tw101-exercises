package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {

    public float averageArea(Rectangle[] rectangles) {

        float average = 0;

        if (rectangles.length>0){
            for(int i = 0; i<rectangles.length; i++){
                average = average + rectangles[i].area();
            }
            average = average/rectangles.length;
        }


        return average;
    }
}
