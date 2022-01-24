package com.bnta.week_one_fri;

public class exercise3 {
    public static void main(String[] args) {
        String[] content = {"you", "are", "how", "hello"};
        String result = "";
        for(int i= content.length -1; i>=0; i--){
            result = result + content[i] + " ";
            }
        System.out.println(result.substring(0, result.length()-1) + "?");
        }
    }