package com.bnta.week_two_tue.methods;

import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter your second number: ");
        int num2 = scanner.nextInt();
        String result = compareNums(num1,num2);
        System.out.println(result);

    }
    static String compareNums(int num1, int num2){
        if (num1>num2){
            return "The first number is larger";
        }else if(num1<num2){
            return "The second number is larger";
        }else{
            return "The numbers are equal";
        }
    }
}
