package LeetCode_Medium;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
public class Longest_Substring_Without_Repeating_Characters {
    public static void main(String[] args) {
//        String input = "abcabcbb"; //3
//        String input = "bbbbb"; //1
        String input = "pwwkew"; //3

        System.out.println(lengthOfLongestSubstring(input));

    }


    public static int lengthOfLongestSubstring(String s) {
        char[] inputArray = s.toCharArray();
        List<String> longestSubstrings = new ArrayList<>();

        for (int i = 0; i < inputArray.length; i++) {
            String substring = "";
            for (int j = i; j < inputArray.length; j++) {
                if (!substring.contains(String.valueOf(inputArray[j]))) {
                    substring += inputArray[j];
                } else {
                    break;
                }
            }
            longestSubstrings.add(substring);
        }

        int longestValue = 0;
        for(String str : longestSubstrings){
            if (str.length() > longestValue){
                longestValue = str.length();
            }
        }

        return longestValue;
    }

}
