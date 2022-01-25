package com.bnta.week_two_mon;

import java.util.Arrays;

public class exercise7 {

    public static void main(String[] args) {
        String[] array1 = {"hello", "hello", "ola", "bye", "ciao"};
        String result = findLongest(array1);
        System.out.println(result);
    }

    static String findLongest(String[] array1) {
        int longest = array1[0].length();
        String outcome = array1[0];
        for (int i=1; i<=array1.length - 1; i++){
            if (array1[i].length() > longest){
                longest = array1[i].length();
                outcome = array1[i];
            }
            else if (array1[i].length() == longest){
                if (outcome.contains(array1[i]) == false){
                    outcome = outcome + ", " + array1[i];
                }
            }
        }
        return outcome;
    }
}
