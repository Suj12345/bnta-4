package com.bnta.week_two_wed.conditionals;

public class exercise6 {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 5;
        int num3 = 5;
        if ((num1>num2)||(num1<num3)){
            System.out.println("Number 1 is bigger than number 2 OR it is less than number 3");
        }else{
            System.out.println("Condition not met");
        }
    }
}
//    Modify your answer to Question 5 to instead use an OR operator.
//    Play about with the values assigned to your three variables, noting how the behaviour changes.