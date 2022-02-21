package com.bnta.week_one_fri;

public class exercise4 {
    public static void main(String[] args) {
        String string1 = "0.90, 1.00, 9.00, 8.78, 0.01";
        double result = 0;
        String[] string2 = string1.split(", ");
        for(int i= 0; i<= string2.length -1 ; i++){
            result = result + Double.parseDouble(string2[i]);
            //Double.parseDoubleconverts string
            //Remember that double is a primitive and Double is an object
        }
        System.out.println(result);
    }
}
