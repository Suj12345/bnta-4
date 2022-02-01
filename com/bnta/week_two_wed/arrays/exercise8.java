package com.bnta.week_two_wed.arrays;

import java.util.Arrays;

public class exercise8 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 1; i<=10; i++) {
            array[i-1] = i;
        }
        System.out.println(Arrays.toString(array));
    }
}
// declare a new array which can hold the numbers from 1-10 (inclusive)
// create a `for` loop which initialises this array with the numbers 1-10
// print the array to the console