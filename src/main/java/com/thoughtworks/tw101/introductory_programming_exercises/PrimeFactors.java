package com.thoughtworks.tw101.introductory_programming_exercises;

//  Prime Factors Exercise
//  Write a method generate(int n) that given an integer N will return a list of integers such that the numbers
//  are the factors of N and are arranged in increasing numerical order.
//
//  For example, generate(1) should return an empty list and generate(30) should return the numbers: 2,3,5.

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static void main(String[] args) {
        List<Integer> primeFactors = generate(13*5*7*2);

            System.out.print(primeFactors);

    }

    private static List<Integer> generate(int n) {

        List<Integer> primeFactors = new ArrayList<>();

            for(Integer i=2; i<n; i++){
                if(n%i==0){
                    primeFactors.add(i);
                    if(isPrime(n/i)){
                        primeFactors.add(n/i);
                    }else{
                        primeFactors = mergeWithNoDuplicates(primeFactors,generate(n/i));
                    }
                    return primeFactors;
                }
            }

        return primeFactors;
    }

    private static boolean isPrime(Integer n){
        boolean result = true;

        if (n > 3) {
            for(Integer i=2; i<=(int)Math.floor(n/2); i++){
                if(n%i==0){
                    result = false;
                }
            }
        }
        return result;
    }

    private static boolean isDuplicate(List<Integer> list, Integer n ){
        boolean result = false;
        for(Integer item: list){
            if(n.equals(item)){
                result = true;
                break;
            }
        }
        return result;
    }

    private static List<Integer> mergeWithNoDuplicates(List<Integer> list1, List<Integer> list2){
        List<Integer> temp = new ArrayList<>();

        for(Integer item: list1){
            if(!isDuplicate(temp,item)){
                temp.add(item);
            }
        }
        for(Integer item: list2){
            if(!isDuplicate(temp,item)){
                temp.add(item);
            }
        }
        return temp;
    }
}
