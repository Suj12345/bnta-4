package com.bnta.week_two_wed.arrays;

public class exercise10 {
    public static void main(String[] args) {
        String[] letters = {"a", "b", "c", "d"};
        String condition = "c";
        boolean hasC = false;
        for (int i=0; i<letters.length; i++){
            if (letters[i].equals(condition)){
                hasC = true;
            }
        }
        System.out.println(hasC);
    }
}
// start from your solution to Q5
// create a String variable called `condition` which has the value "c"
// create a Boolean variable called `hasC` which has the value `false`
// create a `for` loop which goes through each item in our array, comparing it against our `condition` variable
// if the two are equal, change the `hasC` value to `true`
// once the `for` loop concludes, print out a message which tells you if `hasC` is `true` or `false`
