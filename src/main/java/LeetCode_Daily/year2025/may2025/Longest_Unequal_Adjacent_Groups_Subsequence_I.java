package LeetCode_Daily.year2025.may2025;

import java.util.ArrayList;
import java.util.List;

public class Longest_Unequal_Adjacent_Groups_Subsequence_I {

    public static void main(String[] args) {
        String[] words = {"a", "b", "c", "d"};
        int[] groups = {1, 0, 1, 1};

        System.out.println(getLongestSubsequence(words, groups).size());
    }

    public static List<String> getLongestSubsequence(String[] words, int[] groups) {
        int binaryValue = groups[0];
        int longestLength = words[0].length();

        List<String> wordsList = new ArrayList<>();
        wordsList.add(words[0]);


        for (int i = 1; i < groups.length; i++) {

            if (binaryValue != groups[i]) {
                longestLength = words[i].length();
                wordsList.add(words[i]);

                if (binaryValue == 0) {
                    binaryValue = 1;
                } else {
                    binaryValue = 0;
                }

            } else if (binaryValue == groups[i]) {
                if (words[i].length() > longestLength) {
                    longestLength = words[i].length();
                    wordsList.remove(wordsList.size() - 1);
                    wordsList.add(words[i]);
                }

            }
        }

        return wordsList;
    }
}
