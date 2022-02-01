package com.bnta.week_two_wed.arrays;

import java.util.Arrays;

public class exercise6 {
    public static void main(String[] args) {
        String[] array1 = {"a", "b", "c", "d"};
        String[] array2 = array1;
        array2[0] = "z";
        System.out.println(Arrays.toString(array1)); //array1 will now be changed as well is because
        // both of our arrays are pointing to the same space in memory so changing one will
        // change both. To create a discrete copy of the original array,
        // we should use the Arrays.copyOf() method instead.
        System.out.println(Arrays.toString(array2));
    }
}
// using your answer to Q5, create a second array which is initialised using your original array
// hint: instead of using the `new` keyword, try simply giving the name of your original array
// change the value at index 0 of the new array to "z"
// print both of your arrays and compare
