package com.bnta.week_two_wed.Scanner;

import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter something: ");
        String input = scanner.nextLine();
        System.out.println(input);
    }
}

// create a Scanner object - remember to import `java.util.Scanner` at the top of your file!
// create a variable which is assigned to the value passed into the scanner from the terminal
// print this variable
