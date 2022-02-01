package com.bnta.week_two_wed.Scanner;

import java.util.Locale;
import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string: ");
        String input = scanner.nextLine();
        String upperCaseInput = input.toUpperCase();
        System.out.println(upperCaseInput);
    }
}

// create a Scanner object - remember to import `java.util.Scanner` at the top of your file!
// create a variable which is assigned to the value passed into the scanner from the terminal
// make the input string uppercase
// print this variable