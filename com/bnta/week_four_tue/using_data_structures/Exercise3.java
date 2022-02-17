package com.bnta.week_four_tue.using_data_structures;

import java.util.HashMap;
import java.util.Stack;

public class Exercise3 {
    public static void main(String[] args) {
        String brackets = "[{{[(){}]}}[]{}{{(())}}]";
        Exercise3 exercise3 = new Exercise3();
        System.out.println(exercise3.isBalanced(brackets));
    }

    public boolean isBalanced(String brackets){
        String[] bracketsarray = brackets.split("");
        HashMap<String, String> bracketMap = new HashMap<>();
        bracketMap.put("{", "}");
        bracketMap.put("[", "]");
        bracketMap.put("(", ")");
        Stack<String> stack = new Stack<>();
        boolean balanced = true;
        if (bracketsarray.length % 2 != 0) {
            balanced = false;
        } else {
            for (String bracket : bracketsarray) {
                if (bracketMap.keySet().contains(bracket)) {
                    stack.push(bracket);
                } else if (!stack.isEmpty()) {
                    if (bracket.equals(bracketMap.get(stack.peek()))) {
                        stack.pop();
                    } else {
                        balanced = false;
                        break;
                    }
                } else {
                    balanced = false;
                }
            }
        }
        return balanced;
    }
}