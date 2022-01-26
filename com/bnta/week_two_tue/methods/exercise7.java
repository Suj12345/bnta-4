package com.bnta.week_two_tue.methods;

import java.util.Scanner;

public class exercise7 {
    public static void main(String[] args) {
//        Write a method which takes a sentence as an argument, counts the number of words in the array and prints "The sentence contains X words".
//
//HINT: Remember what you've done already, you might be able to reuse one of your methods here...
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence = scanner.nextLine();
        String[] sentencearray = sentence.split(" ");
        int result = numOfWords(sentencearray);
        System.out.println("This sentence contains " + result + " words.");
    }
    static int numOfWords(String[] sentencearray){
        return sentencearray.length;
    }
}
