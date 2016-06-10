package com.thoughtworks.tw101.exercises.exercise8;

import java.util.Scanner;

/**
 * Created by Mandy on 2016-06-09.
 */
public class PromptUser {

    public static int askUserAndGetResponse(String query){

        System.out.print("\n" + query);

        Scanner in = new Scanner(System.in);
        String input = in.next();

        int response = Integer.parseInt(input);

        return response;


    }

}
