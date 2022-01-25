package com.bnta.week_two_mon;

import java.util.Arrays;

public class exercise2 {
    /*
      Given the following String input
      String input = "   b ri   ght net   work  "
      Write a program that transforms input into: Bright Network
    */
    public static void main(String[] args) {
        String input = "   b ri   ght net   work  ";
        String result = input.replace(" ","");
        result = result.replace("b","B");
        result = result.replace("n","N");
        result = result.replace("ht","ht ");
        System.out.println(result);
    }
}