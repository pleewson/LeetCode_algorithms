package LeetCode_Daily.year2025.may2025;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/find-words-containing-character/description/?envType=daily-question&envId=2025-05-24

public class Find_Words_Containing_Character {
    public static void main(String[] args) {
        String[] words = {"leet", "code"};
        Character x = 'e';

        System.out.println(findWordsContaining(words, x));
    }

    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> outputArr = new ArrayList<>();
        String xStr = Character.toString(x);

        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(xStr)) {
                outputArr.add(i);
            }
        }


        return outputArr;
    }

}
