package com.bnta.week_two_wed.Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        File inputFile = new File("/Users/Suraaj/facts.txt");
// Create a File object from our text file
        try{
            Scanner ourScanner = new Scanner(inputFile);
            while (ourScanner.hasNext()) {
// A while loop which checks if there is another line in the text file

                System.out.println("There's another line!");

                String input = ourScanner.nextLine();
                // Note that we need to include a consumption method still to make use of the input

                System.out.println(input);

            }
        } catch (FileNotFoundException e){
            System.out.println("File not found");
        }
// Create a Scanner object which takes in our File object

    }
}
