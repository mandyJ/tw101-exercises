package com.thoughtworks.tw101.exercises.exercise3;

public class OddSum {

    public int of(int start, int end) {

        int sum = 0;
        if(start!=end){
            if(start>end){
                int temp=end;
                end = start;
                start = temp;
            }

            //problem definition says sum 'between' start and end, not including start or end
            int startSum = start+1;

            //Method one, check each number if it is odd
            /*for(int i = startSum; i<end; i++){
                sum += i*checkOdd(i);
            }*/

            //Method two, check if startSum is odd. Otherwise, start at start+2. Then add every other number.
            if (checkOdd(startSum)==0) {
                startSum = start + 2;
            }
            for(int i =startSum; i<end; i+=2){
                sum+=i;
            }

        }else{
            sum=-1;
        }

        return sum;
    }

    private int checkOdd(int value){
        int isOdd=1;
        if (value%2 ==0){
            isOdd=0;
        }

        return isOdd;
    }
}
