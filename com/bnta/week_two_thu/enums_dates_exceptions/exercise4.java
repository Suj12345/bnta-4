package com.bnta.week_two_thu.enums_dates_exceptions;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class exercise4 {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);
        LocalDate DOB = LocalDate.of(1998, 03, 12);
        LocalDate DOBplus100days = DOB.plusDays(100);
        System.out.println(DOBplus100days);
    }
}
// 1 - Print todays Date and Time using LocalDate
// 2 - Represent your date of birth using LocalDate
// 3 - Add 100 days to your dob and print it
