package com.bnta.week_two_mon;

import java.util.Arrays;
import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type numbers with a space in between each one then press enter: ");
        String input = scanner.nextLine();
        String[] outcome = oddEven(input);
          for (String r : outcome){
              System.out.println(r);
          }
    }

    static String[] oddEven(String input) {
        String[] array1 = input.split(" ");
        String[] array2 = new String[array1.length];
        for(int i=0 ; i<= array1.length - 1; i++) {
            if (Integer.parseInt(array1[i])%2==0){
                array2[i] = array1[i] + " is even";
            }else{
                array2[i] = array1[i] + " is odd";
            }
        }
        return array2;
    }
}

//public class exercise3 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Type numbers with a space in between each one then press enter: ");
//        String input = scanner.nextLine();
//        String outcome = oddEven(input);
//        System.out.println(outcome);
//    }
//
//    static String oddEven(String input) {
//        String[] array1 = input.split(" ");
//        String result = "";
//        for(int i=0 ; i<= array1.length - 1; i++) {
//            if (Integer.parseInt(array1[i])%2==0){
//                result += array1[i] + " is even" + "\n";
//            }else{
//                result += array1[i] + " is odd" + "\n";
//            }
//        }
//        return result;
//    }
//}


//            if (Integer.parseInt(input[i])%2==0){