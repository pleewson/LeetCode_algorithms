package LeetCode_Daily.year2025.june2025;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Maximum_Difference_Between_Even_and_Odd_Frequency_I {

    public static void main(String[] args) {
        String s = "tgtrgdtdgt";
        System.out.println(maxDifference(s));
    }

    public static int maxDifference(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        char[] charArr = s.toCharArray();


        for (int i = 0; i < charArr.length; i++) {
            if (hashMap.containsKey(charArr[i])) {
                hashMap.put(charArr[i], hashMap.get(charArr[i]) + 1);
            } else {
                hashMap.put(charArr[i], 1);
            }
        }

        HashSet<Integer> oddNums = new HashSet<>();
        HashSet<Integer> evenNums = new HashSet<>();


        for (Character c : hashMap.keySet()) {
            if (hashMap.get(c) % 2 == 0) {
                evenNums.add(hashMap.get(c));
            } else {
                oddNums.add(hashMap.get(c));
            }
        }


        int maxDiff = Integer.MIN_VALUE;
        int diff = 0;

        Iterator<Integer> oddIt = oddNums.iterator();

        while (oddIt.hasNext()) {
            Iterator<Integer> evenIt = evenNums.iterator();
            int oddNum = oddIt.next();
            while (evenIt.hasNext()) {
                diff = oddNum - evenIt.next();
                if (diff > maxDiff) {
                    maxDiff = diff;
                }
            }
        }

        return maxDiff;

    }
}
