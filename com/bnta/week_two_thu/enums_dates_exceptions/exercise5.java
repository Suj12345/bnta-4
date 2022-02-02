package com.bnta.week_two_thu.enums_dates_exceptions;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class exercise5 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1998,03,12);
        long result = calculateAge(date);
        System.out.println(Long.toString(result));//dont need to convert to string, just done for the sake of it here

    }
    private static long calculateAge(LocalDate date) {
        long difference = date.until(LocalDate.now(), ChronoUnit.DAYS); //until requires long datatype
        long age = (difference-difference%365)/365;
        return age;
    }


}
// write a method that calculate age on any given date
// hint: subtract todays date[year] - date[year]
