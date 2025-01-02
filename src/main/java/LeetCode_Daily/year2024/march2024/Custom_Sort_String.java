package LeetCode_Daily.year2024.march2024;

import java.util.ArrayList;
import java.util.List;

public class Custom_Sort_String {
    public static void main(String[] args) {
        String order = "cba";
        String s = "abcd";

        System.out.println(customSortString(order, s));
    }

    public static String customSortString(String order, String s) {
        char[] orderChar = order.toCharArray();
        char[] sChar = s.toCharArray();

        List<Character> characterList = new ArrayList<>();
        for (Character c : sChar) {
            characterList.add(c);
        }

        StringBuilder outputString = new StringBuilder();
        for (int i = 0; i < sChar.length; i++) {
            if (characterList.isEmpty()) {
                break;
            }
            if (i >= orderChar.length) {
                outputString.append(characterList.get(0));
                characterList.remove(characterList.get(0));
            } else {
                if (characterList.contains(orderChar[i])) {
                    while (characterList.contains(orderChar[i])) {
                        outputString.append(orderChar[i]);
                        characterList.remove((Character) orderChar[i]);
                    }
                } else {
                    outputString.append(characterList.get(0));
                    characterList.remove(characterList.get(0));
                }
            }
        }

        return outputString.toString();
    }
}
