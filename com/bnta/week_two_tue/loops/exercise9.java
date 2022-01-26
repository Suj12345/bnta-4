package com.bnta.week_two_tue.loops;

public class exercise9 {
    public static void main(String[] args) {
        int[] nums = {1, 6, 17, 9, 20, 5};
        int greatest = nums[0];
        for (int i=0; i<=nums.length -1; i++){
            if (nums[i]>greatest){
                greatest = nums[i];
            }
        }
        System.out.println("Greatest number is "+greatest);
    }
}
