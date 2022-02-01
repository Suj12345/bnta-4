package com.bnta.week_two_wed.Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        File inputFile = new File("/Users/Suraaj/facts.txt");
        try {
            Scanner scanner = new Scanner(inputFile);
            while (scanner.hasNext()) {
                System.out.println("There is still unused input, the next line is:");
                String nextline = scanner.nextLine();
                System.out.println(nextline);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}

// create a File object from a text file
// create a Scanner object from out File object
// create a loop which checks whether there is still some unused input
// create a local variable which is assigned to the next line of the input
// print the line to the console