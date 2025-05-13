package LeetCode_Daily.year2025.may2025;

import java.util.HashMap;

public class Total_Characters_in_String_After_Transformations_I {

    public static void main(String[] args) {
        String s = "abcyy";
        System.out.println(lengthAfterTransformations(s, 2));
    }

    public static int lengthAfterTransformations(String s, int t) {
        //   502 / 824 testcases passed
        HashMap<Character, String> transformation = new HashMap<>();
        transformation.put('a', "b");
        transformation.put('b', "c");
        transformation.put('c', "d");
        transformation.put('d', "e");
        transformation.put('e', "f");
        transformation.put('f', "g");
        transformation.put('g', "h");
        transformation.put('h', "i");
        transformation.put('i', "j");
        transformation.put('j', "k");
        transformation.put('k', "l");
        transformation.put('l', "m");
        transformation.put('m', "n");
        transformation.put('n', "o");
        transformation.put('o', "p");
        transformation.put('p', "q");
        transformation.put('q', "r");
        transformation.put('r', "s");
        transformation.put('s', "t");
        transformation.put('t', "u");
        transformation.put('u', "v");
        transformation.put('v', "w");
        transformation.put('w', "x");
        transformation.put('x', "y");
        transformation.put('y', "z");
        transformation.put('z', "ab");


        String holder = s;
        StringBuilder sb = new StringBuilder();
        char[] tempArr;

        for (int i = 0; i < t; i++) {
            for (int j = 0; j < holder.length(); j++) {
                tempArr = holder.toCharArray();
                sb.append(transformation.get(tempArr[j]));
            }
            holder = sb.toString();
            sb.delete(0, sb.length());
        }

        return holder.length();
    }

}
