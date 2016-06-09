package com.thoughtworks.tw101.exercises.exercise4;

import java.io.PrintStream;

public class Library {
    private String[] books;
    private PrintStream printStream;

    public Library(String[] books, PrintStream printStream) {
        this.books = books;
        this.printStream = printStream;
    }

    public void printBooksContaining(String partialBookTitle) {

        printStream.print("\nBooks containing \'" + partialBookTitle + "\'\n");

        int startIndex;
        for(int i=0;i<books.length;i++){
            startIndex= books[i].indexOf(partialBookTitle);

            if (startIndex !=-1){
                printStream.print(books[i]+"\n");
        }


        }


    }
}
