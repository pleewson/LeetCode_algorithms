package LeetCode_Daily.october2024;

public class Minimum_String_Length_After_Removing_Substrings {

    public static void main(String[] args) {
        String str = "ABFCACDB";
        System.out.println(minLength(str));
    }

    public static int minLength(String s) {
        while (s.contains("AB") || s.contains("CD")) {
            s = s.replaceAll("AB", "");
            s = s.replaceAll("CD", "");
        }

        return s.length();
    }
}
