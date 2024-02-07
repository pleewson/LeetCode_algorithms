package LeetCode_Daily;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Sort_Characters_By_Frequency {

    public static void main(String[] args) {
        String str = "Aabb";
        System.out.println(frequencySort(str));
    }

    public static String frequencySort(String s) {
        char[] charArr = s.toCharArray();
        Map<Character, Integer> countMap = new HashMap<>();


        for (Character c : charArr) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        //^ better shorter version of below code
//        for (int i = 0; i < s.length(); i++) {
//            if (countMap.containsKey(charArr[i])) {
//                int mapValue = countMap.get(charArr[i]);
//                mapValue++;
//                countMap.put(charArr[i], mapValue);
//            } else {
//                countMap.put(charArr[i], 1);
//            }
//        }

        String[] strArr = new String[countMap.size()];

        String tempStr = "";
        int x = 0;
        for (Map.Entry<Character, Integer> mapEntry : countMap.entrySet()) {
            tempStr = "";
            for (int i = 0; i < mapEntry.getValue(); i++) {
                tempStr += mapEntry.getKey();
            }
            strArr[x] = tempStr;
            x++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) { // all arr loop
            int biggestValue = 0;
            int index = 0;
            for (int j = 0; j < strArr.length; j++) { // looking for biggest value in this round
                if (strArr[j] == null) {
                    continue;
                }
                if (strArr[j].length() > biggestValue) {
                    biggestValue = strArr[j].length();
                    index = j;
                }
            }
            sb.append(strArr[index]);
            strArr[index] = null;

        }

        String outputString = sb.toString();

        return outputString;
    }
}
