package com.bnta.week_two_tue.methods;

import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        int result = negativeNum(num);
        System.out.println("Your number negated is: "+result);
    }

    static int negativeNum(int num){
        int newnum = num*-1;
        return newnum;
    }

}
