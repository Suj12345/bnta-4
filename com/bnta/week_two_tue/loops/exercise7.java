package com.bnta.week_two_tue.loops;


import java.util.Arrays;
import java.util.Locale;

public class exercise7 {
    public static void main(String[] args) {
        String[] array1 = {"i", "sure", "do", "love", "bees"};
        for (int i=0; i<=array1.length-1; i++) {
            array1[i] = array1[i].toUpperCase();
        }
        System.out.println(Arrays.toString(array1));
    }
}
