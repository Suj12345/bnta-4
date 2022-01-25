package com.bnta.week_two_mon;

import java.util.Scanner;

public class exercise1 {
    /*
      Write a method that reverses any String and print to console
      Input should be a string
      Output should be reversed input
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string:");
        String input = scanner.nextLine();
        reverseString(input);
    }
    public static void reverseString(String input){
        String result="";
        for(int i=input.length()-1; i>=0; i--) {
            result = result + input.charAt(i);
        }
        System.out.println("Reversed string: " + result);
    }
}