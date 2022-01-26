package com.bnta.week_two_tue.methods;

import java.util.Scanner;

public class exercise3 {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your first number: ");
    int num1 = scanner.nextInt();
    System.out.println("Enter your second number: ");
    int num2 = scanner.nextInt();
    boolean samenum = isSame(num1, num2);
    System.out.println(samenum);
}
static boolean isSame(int num1, int num2){
    if (num1==num2){
        return true;
    }else{
        return false;
    }
}
}
