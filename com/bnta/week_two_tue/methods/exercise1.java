package com.bnta.week_two_tue.methods;

import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = scanner.nextInt();
        multiplyNums(num1,num2);
    }
    public static void multiplyNums(int num1, int num2){
        int sum = num1 + num2;
        System.out.println("Sum is "+ sum);
    }
}
