package com.bnta.leet_code;

public class Permutation_in_string {
    public static void main(String[] args) {
        Permutation_in_string permutation_in_string = new Permutation_in_string();
        System.out.println((permutation_in_string.checkInclusion("adc", "dcda")));
    }
    public boolean checkInclusion(String s1, String s2) {
        String s1Altered = s1;
        String[] s2Array = s2.split("");
        int length = 0;
        for (String character : s2Array) {
            if (s1Altered.contains(character)){
                s1Altered = s1Altered.replaceFirst(character, "");
                System.out.println("s1 altered: " + s1Altered);
                length++;
            } else{
                if (length==s1.length()){
                    return true;
                } else {
                    length=0;
                    s1Altered=s1;
                }
            }
        }
        System.out.println(s1Altered);
        return false;
    }
}
