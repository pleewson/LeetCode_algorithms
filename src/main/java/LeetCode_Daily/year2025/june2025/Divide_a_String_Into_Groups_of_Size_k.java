package LeetCode_Daily.year2025.june2025;

// https://leetcode.com/problems/divide-a-string-into-groups-of-size-k/description/?envType=daily-question&envId=2025-06-22

public class Divide_a_String_Into_Groups_of_Size_k {

    public static void main(String[] args) {
        String s = "ctoyjrwtngqwt";
        divideString(s, 8, 'n');
    }

    public static String[] divideString(String s, int k, char fill) {
        String[] outputArr;

        if (s.length() % k == 0) {
            outputArr = new String[s.length() / k];
        } else {
            outputArr = new String[(s.length() / k) + 1];
        }

        char[] sArr = s.toCharArray();
        int bump = 0;
        int outputArrIndex = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            bump++;
            sb.append(sArr[i]);
            if (bump == k) {
                outputArr[outputArrIndex] = sb.toString();
                outputArrIndex++;
                bump = 0;
                sb.replace(0, sb.length(), "");
            }
        }


        if (!sb.isEmpty()) {
            for (int i = sb.length(); i < k ; i++) {
                sb.append(fill);
            }
            outputArr[outputArr.length - 1] = sb.toString();
        }

        return outputArr;
    }

}
