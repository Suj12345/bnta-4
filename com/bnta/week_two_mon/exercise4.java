package com.bnta.week_two_mon;

import java.util.Scanner;

public class exercise4 {
    /*
  Write a program that takes an input number from the console and prints if number is prime
  Create a method to check if number is prime then use against the input
*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input = scanner.nextInt();
        boolean outcome = isPrime(input);
        if (outcome==true){
            System.out.println(input + " is prime");
        }else{
            System.out.println(input + " is not prime");
        }

    }
    static boolean isPrime(int input) {
        boolean prime = true;
        if (input<=1){
            prime = false;
        }else{
            for(int i=2 ; i<= Math.sqrt(input); i++) {
                if (input % i == 0) {
                    prime = false;
                    System.out.println("rekt");
                    break;
                }
            }
        }
        return prime;
        }
    }

