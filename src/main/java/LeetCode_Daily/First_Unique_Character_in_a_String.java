package LeetCode_Daily;

import java.util.HashSet;

public class First_Unique_Character_in_a_String {

    public static void main(String[] args) {

        String str = "loveleetcode";
        System.out.println(firstUniqChar(str));

    }

    public static int firstUniqChar(String s) {
        HashSet<Character> hashSet = new HashSet<>();
        char[] charArr = s.toCharArray();
        int sumDuplicates;

        for (int i = 0; i < charArr.length; i++) {
            sumDuplicates = 0;
            if (hashSet.contains(charArr[i])) {
                continue;
            }
            for (int j = i + 1; j < charArr.length; j++) {
                if (charArr[i] == charArr[j]) {
                    sumDuplicates++;
                    hashSet.add(charArr[i]);
                }

            }
            if (sumDuplicates == 0) {
                return i;
            }
        }

        return -1;
    }

}


