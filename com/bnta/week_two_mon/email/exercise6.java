package com.bnta.week_two_mon.email;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class exercise6 {
    /*
    Create a package called email
    Then have a method called validateEmail that return true of false if input is valid email
    Finally invoke validateEmail in main
        i.e. "hello@gmail.com" -> true
        i.e. "hellogmail.com" -> false
*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter email: ");
        String input = scanner.nextLine();
        boolean valid = validateEmail(input);
        System.out.println(valid);

    }

    static boolean validateEmail(String input) {
        String emailRegex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
        Pattern emailPattern = Pattern.compile(emailRegex,Pattern.CASE_INSENSITIVE);
        Matcher matcher = emailPattern.matcher(input);
        return matcher.find();
    }
}
