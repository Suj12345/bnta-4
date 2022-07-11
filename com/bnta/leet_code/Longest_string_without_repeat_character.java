package com.bnta.leet_code;

public class Longest_string_without_repeat_character {
    public static void main(String[] args) {
        Longest_string_without_repeat_character longest_string_without_repeat_character = new Longest_string_without_repeat_character();
        String s = "dvdf";
        System.out.println(longest_string_without_repeat_character.lengthOfLongestSubstring(s));
    }
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        String characterList = "";
        int index = 0;
        int index2 = 0;

        while (index2<s.length()) {
            String character = String.valueOf(s.charAt(index2));
            if (!characterList.contains(character)) {
                characterList += character;
                if (maxLength < characterList.length()) {
                    maxLength = characterList.length();
                }
                index2++;
            } else {
                characterList = String.valueOf(s.charAt(index));
                index++;
                index2=index;
            }
        }
        return maxLength;
    }


}

