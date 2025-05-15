package LeetCode_Daily.year2025.may2025;

import java.util.ArrayList;
import java.util.List;

public class Longest_Unequal_Adjacent_Groups_Subsequence_I {

    public static void main(String[] args) {


    }

    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        int binaryValue = 0;
        int longestLength = 0;
        int indexLongestWord = 0;

        List<String> wordsList = new ArrayList<>();
        wordsList.add(words[0]);

        for (int i = 1; i < groups.length; i++) {
            binaryValue = groups[0];

            if (binaryValue != groups[i]) {
                if (words[i].length() > longestLength) {
                    longestLength = words[i].length();
                    indexLongestWord = i;
                }
            }

            if (binaryValue == groups[i]) {
                wordsList.add(words[indexLongestWord]);

                if (binaryValue == 0) {
                    binaryValue = 1;
                } else {
                    binaryValue = 0;
                }

                longestLength = i;
                indexLongestWord = i;
            }
        }

        return wordsList;
    }
}

//1 0 0 0 1 0 1