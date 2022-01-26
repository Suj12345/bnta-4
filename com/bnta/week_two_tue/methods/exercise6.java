package com.bnta.week_two_tue.methods;

public class exercise6 {
//    Write a method which takes an array of strings as an argument and returns the number of items in the array.
    public static void main(String[] args) {
        String[] strings = {"blah1", "blah2", "blah3"};
        int result = numOfItems(strings);
        System.out.println(result + " items in the array");
    }
    static int numOfItems(String[] strings){
        return strings.length;
    }
}
