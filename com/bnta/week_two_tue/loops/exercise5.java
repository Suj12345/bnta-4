package com.bnta.week_two_tue.loops;

public class exercise5 {
    public static void main(String[] args) {
        int[] array1 = new int[11];
        for (int i = 0; i <= 10; i++) {
            array1[i] = i;
        }
        for (int i : array1) { //just a quicker way of looping
            System.out.println(array1[i]);
        }
    }
}
