package LeetCode_Easy;

//not accepted

import java.util.Stack;

public class Valid_Parentheses {
    public static void main(String[] args) {

        String input = "()[]{}";
        System.out.println(isValid(input));

    }

    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> brackets = new Stack<>();

        for(char ch : s.toCharArray()){
            //every single next index of s
            switch(ch){

            }
        }


        return true;
    }
}



//Example 1:
//
//Input: s = "()"
//Output: true
//Example 2:
//
//Input: s = "()[]{}"
//Output: true
//Example 3:
//
//Input: s = "(]"
//Output: false