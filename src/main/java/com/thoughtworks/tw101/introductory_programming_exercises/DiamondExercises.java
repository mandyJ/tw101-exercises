package com.thoughtworks.tw101.introductory_programming_exercises;

public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3,0);
        drawADiamond(8);
        drawADiamondWithYourName(3);

    }

//    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n, int leftPadding) {
        int spaces = n-1 + leftPadding;
        int stars;

        for(int i = 0; i<n; i++){

            for(int j = 0; j<spaces; j++)
                System.out.print(" ");
            spaces--;

            stars = i*2 + 1;
            for(int k = 0; k<stars; k++)
                System.out.print("*");

            System.out.print("\n");
        }

    }

//    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *
    private static void drawADiamond(int n) {
        drawAnIsoscelesTriangle(n,0);
        drawAnUpSideDownIsoscelesTriangle(n-1,1);

    }

//    Diamond with Name
//    Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
//
//             *
//            ***
//           Bill
//            ***
//             *
    private static void drawADiamondWithYourName(int n) {
        drawAnIsoscelesTriangle(n-1,1);
        System.out.print("Mandy \n");
        drawAnUpSideDownIsoscelesTriangle(n-1,1);


    }

    private static void printRepeatedChar(int n, char c){
        for(int i=0; i<n; i++){
            System.out.print(c);
        }
    }

    private static void drawAnUpSideDownIsoscelesTriangle(int n, int leftPadding){
        int spaces = leftPadding;
        int stars;

        for(int i = n-1; i>=0; i--){

            for(int j = 0; j<spaces; j++)
                System.out.print(" ");
            spaces++;

            stars = i*2 + 1;
            for(int k = 0; k<stars; k++)
                System.out.print("*");

            System.out.print("\n");
        }
    }
}
