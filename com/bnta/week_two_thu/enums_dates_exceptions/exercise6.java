package com.bnta.week_two_thu.enums_dates_exceptions;

public class exercise6 {
    public static void main(String[] args) {
        String[] array = {"Blah", "1", "6", "HI", "BYE"};
        System.out.println(toInteger(array));
    }

    public static String toInteger(String[] array){
        int sum = 0;
        String notInts = "";
        for (int i = 0; i< array.length; i++){
            try{
                sum += Integer.parseInt(array[i]);
            }catch (NumberFormatException e){
                notInts += array[i] + ", ";
            }
        }
        return "Sum: " + sum + " and " + notInts.substring(0,notInts.length()-2) + " are not numbers";
    }
}
// try catch
// write a program that converts program arguments to an integer
// if value cannot be converted to int store them somewhere
// calculate sum for numbers that can be converted to an integer
// finally print the numbers that cannot be converted to an int
// example: java com.bnta.exercises.week_two_wed.exercises.Exercise6 1 2 a b foo 3
// output: Sum: 6 and a, b, foo are not numbers.
