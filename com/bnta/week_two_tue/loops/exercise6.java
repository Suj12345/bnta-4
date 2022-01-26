package com.bnta.week_two_tue.loops;

public class exercise6 {
    public static void main(String[] args) {
        int[] array1 = new int[11];
        for (int i=0; i<=10; i++){ //or for (int i:array1){
            array1[i]=i;
        }
        int Sum = 0;
        for (int i=0; i<=array1.length - 1; i++){
            Sum+=array1[i];
        }
        System.out.println(Sum);
    }
}
