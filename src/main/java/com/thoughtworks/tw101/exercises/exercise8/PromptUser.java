package com.thoughtworks.tw101.exercises.exercise8;

import java.util.Scanner;

/**
 * Created by Mandy on 2016-06-09.
 */
public class PromptUser {

    public static int askUserAndGetResponse(String query){

        int response=0;
        boolean validInput;

        do{
            System.out.print("\n" + query);
            Scanner in = new Scanner(System.in);
            String input = in.next();
            try{
                response = Integer.parseInt(input);
                validInput=true;
            }catch(NumberFormatException e) {
                System.out.print("Please enter an integer.\n");
                validInput = false;
            }
        }while(!validInput);

        return response;


    }

}
