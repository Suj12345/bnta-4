package com.bnta.week_two_thu.conditionals;

public class exercise8 {
    public static void main(String[] args) {
        String input = "Hellooo";
        char character = 'o';
        for (int i = 0; i < input.length(); i++) {
            if (Character.valueOf(input.charAt(i)).equals(character)) {
                System.out.println(input + " contains " + character);
                break; /// need break in case the character appears multiple times
                /// in the input (otherwise the output will print multiple times)
            }
        }
    }
}
// create a String variable and assign it a value
// create a `for` loop which wraps around your answer from Question 7
// modify your `if` statement to check the character at each index
// Hint: use your internal, incrementing value of your `for` loop within the `.charAt()` method
// print something to the console if the condition is met