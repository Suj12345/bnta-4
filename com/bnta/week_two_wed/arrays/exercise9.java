package com.bnta.week_two_wed.arrays;

import java.util.Arrays;

public class exercise9 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i<10; i++) {
            array[i] = i+1;
        }
        for (int i = 0; i<10; i++) {
            array[i] = array[i]*2;
        }
        System.out.println(Arrays.toString(array));
    }
}
// adding onto your example from Q8, now create a second `for` loop which reassigns each value in the array to be double the initial value
// again print the array
