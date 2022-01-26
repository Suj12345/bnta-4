package com.bnta.week_two_tue.methods;

import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string: ");
        String word = scanner.nextLine();
        String result = capWord(word);
        System.out.println(result);
    }

    static String capWord(String word) {
        char firstLetter = word.charAt(0);
        char capLetter = Character.toUpperCase(firstLetter); //go over this line because had to use Character.toUppercase()
        String capWord = capLetter + word.substring(1, word.length());
        return capWord;
    }
}
