package com.bnta.week_two_thu.enums_dates_exceptions;

import java.time.LocalDate;

public class exercise7 {
    public static void main(String[] args) {
        LocalDate[] dates = {LocalDate.of(2000,12,15), LocalDate.of(1999,2,2)};
        System.out.println(sumOfDays(dates));
    }
    public static int sumOfDays(LocalDate[] dates){
        int sum = 0;
        for (LocalDate date : dates) {
            sum+= date.getDayOfMonth();
        }
        return sum;
    }

}
// create a method that sums days of the month for a given array of LocalDate