package com.bnta.week_two_thu.enums_dates_exceptions;

import java.util.Arrays;

public class exercise3 {
    public static void main(String[] args) {
        tShirtSize[] sizes = tShirtSize.values();
        for (tShirtSize size : sizes){
            System.out.println(size.name().toLowerCase());
        }
    }
}
// invoke .values() method on ThirstSize enum and loop through its values and while looping lowercase each value
// hint: while you loop through enums invoke .name() to convert enum to string. without it, you can't lowercase
