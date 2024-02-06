package LeetCode_Daily;

import java.util.*;

public class Group_Anagrams {

    public static void main(String[] args) {

        String[] strs = {"",""};
        System.out.println(groupAnagrams(strs));
        System.out.println(strs.length);

    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> outputList = new ArrayList<>();
        String[] tempArray = new String[strs.length];

        if (strs.length == 1 && strs[0].equals("")) {
            List<String> temp = new ArrayList<>();
            temp.add("");
            outputList.add(temp);
            return outputList;
        }

        for (int i = 0; i < strs.length; i++) {
            char[] charArr = strs[i].toCharArray();
            Arrays.sort(charArr);
            String buildString = "";
            for (int j = 0; j < charArr.length; j++) {
                buildString += charArr[j];
            }
            tempArray[i] = buildString;
        }

        for (int i = 0; i < tempArray.length; i++) {
            if (tempArray[i] == null) {
                continue;
            }
            List<String> tempList = new ArrayList<>();
            for (int j = i + 1; j < tempArray.length; j++) {
                if (tempArray[i].equals(tempArray[j]) && tempArray[j] != null) {
                    tempList.add(strs[j]);
                    tempArray[j] = null;
                }
            }
            tempList.add(strs[i]);
            outputList.add(tempList);
            tempArray[i] = null;
        }

        return outputList;
    }
}
