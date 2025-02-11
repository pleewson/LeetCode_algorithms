package LeetCode_Daily.year2025.febuary2025;

public class Remove_All_Occurrences_of_a_Substring {
    public static void main(String[] args) {
        String s = "aabababa";
        String part = "aba";

        removeOccurrences(s, part);
    }

    public static String removeOccurrences(String s, String part) {

        while (s.contains(part)) {
            s = s.replaceFirst(part, "");
            System.out.println(s);
        }


        return s;
    }

}
