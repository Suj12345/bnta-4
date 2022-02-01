package com.bnta.week_two_wed.conditionals;

public class exercise5 {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 5;
        int num3 = 5;
        if ((num1>num2)&&(num1<num3)){
            System.out.println("Number 1 is bigger than number 2 and less than number 3");
        }else{
            System.out.println("Condition not met");
        }
    }
}
// create three `int` variables. Assign them values with the first value sitting between the other two
// create an `if` statement which compares whether the first value is greater than the second AND less than the third
// print something to the console if the condition is met
// create an `else` statement which prints to the console if the above condition is NOT met