package com.bnta.week_two_wed.conditionals;

public class exercise3 {
    public static void main(String[] args) {
        String string1 = new String("Hello");
        String string2 = new String(string1);
        if (string1.equals(string2)){
            System.out.println("They are equal");
        }else{
            System.out.println("They are not equal");
        }
    }
}
// create a string variable using the `new` keyword
// create a second string variable which has the same value as the first, again using the `new` keyword
// create an `if` statement which compares the two variables and prints to the console if they are equal