package com.bnta.week_two_wed.conditionals;

public class exercise7 {
    public static void main(String[] args) {
        String input = "Hello";
        char firstLetter = input.charAt(0);
        char character = 'H';
        if (Character.valueOf(firstLetter).equals(character)) {
            System.out.println("Condition met");
        }
    }
}

// create a String variable and assign it a value
// create an `if` statement which grabs the first letter of your word and compares it against a Character value
// print something to the console if the condition is met
