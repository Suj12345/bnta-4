package com.bnta.week_two_mon;

import java.util.Random;
import java.util.Scanner;

public class exercise5 {
    /*
    Write a method that displays random joke to the user.
    Your program should stop displaying jokes when use inputs no.
    For e.g
    Want to hear a joke? Yes/No
        if yes then display joke and repeat same question
        if no then program should exit
*/

    public static void main(String[] args) {
        String[] jokes = {"Joke 1", "Joke 2", "Joke 3"};
        boolean joke = true;
        while (joke==true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Do you want to hear a joke? (yes/no) ");
            String input = scanner.nextLine();
            joke = isJoke(input, jokes);
        }
        }

    static boolean isJoke(String input, String[] jokes) {
        if (input.equalsIgnoreCase("yes")){
            Random rand = new Random();
            int randjoke = rand.nextInt(jokes.length);
            System.out.println(jokes[randjoke]);
            return true;
        }else{
            return false;
        }
    }
}


