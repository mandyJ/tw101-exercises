package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Scanner;

/**
 * Created by Mandy on 2016-06-09.
 */
public class PromptUser {

    public static int askUserAndGetResponse(String query){

        System.out.print("\n" + query);

        Scanner in = new Scanner(System.in);
        int response = in.nextInt();
        System.out.println("You entered : " + response);

        return response;


    }

}
