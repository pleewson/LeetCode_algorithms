package LeetCode_Easy;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/isomorphic-strings/description/
//accepted
public class Isomorphic_Strings {
    public static void main(String[] args) {
        String str1 = "paper";
        String str2 = "title";

        System.out.println(isIsomorphic(str1, str2));
    }


    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        for (int i = 0; i < sArr.length; i++) {
            if (map.containsKey(sArr[i])) {
                if (map.get(sArr[i]) != tArr[i]) {
                    return false;
                }
            } else if (map2.containsKey(tArr[i])) {
                if (map2.get(tArr[i]) != sArr[i]) {
                    return false;
                }
            } else {
                map.put(sArr[i], tArr[i]);
                map2.put(tArr[i], sArr[i]);
            }
        }
        return true;
    }
}
