package com.bnta.week_two_thu.enums_dates_exceptions;

public class exercise8 {
    public static void main(String[] args) {
        try{
            int result = 10 / 0;
        }catch (ArithmeticException e){
            System.out.println("Cannot divide by 0");
        }
    }
}

// run the above code see what error you get
// then surround it with try catch block and catch the exception that was thrown. Inside catch the catch block print "cannot divide by 0"
        /*
            try {
            } catch() {
            }
         */