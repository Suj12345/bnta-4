package com.bnta.week_two_tue.loops;

import java.util.Arrays;

public class exercise8 {
    public static void main(String[] args) {
        String[] array1 = {"i", "sure", "do", "love", "bees"};
        for (int i=0; i<=array1.length-1; i++) {
            char firstLetter = array1[i].charAt(0);
            char capFirst = Character.toUpperCase(firstLetter); //go over this line because had to use Character.toUppercase()
            String capWord = capFirst + array1[i].substring(1,array1[i].length());
            array1[i] = capWord;
        }
        System.out.println(Arrays.toString(array1));
    }
}
