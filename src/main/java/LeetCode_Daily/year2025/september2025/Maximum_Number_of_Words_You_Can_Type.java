package LeetCode_Daily.year2025.september2025;

import java.util.HashSet;

//https://leetcode.com/problems/maximum-number-of-words-you-can-type/description/?envType=daily-question&envId=2025-09-15
public class Maximum_Number_of_Words_You_Can_Type {

    public static void main(String[] args) {
        String text = "hello world";
        String brokenLetters = "ad";

        System.out.println(canBeTypedWords(text, brokenLetters));
    }

    public static int canBeTypedWords(String text, String brokenLetters) {
        HashSet<Character> bl = new HashSet<>();

        for (int i = 0; i < brokenLetters.length(); i++) {
            bl.add(brokenLetters.charAt(i));
        }

        String[] textArr = text.split(" ");

        int counter = 0;
        for (String str : textArr) {
            for (Character c : bl) {
                if (str.contains(c.toString())) {
                    counter--;
                    break;
                }
            }
            counter++;
        }

        return counter;
    }
}
