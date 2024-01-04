package LeetCode_Easy;

public class Find_The_Index_of_the_First_Occurate_in_a_String {

    public static void main(String[] args) {

        System.out.println(strStr("leetcode", "code"));

    }

    public static int strStr(String haystack, String needle) {

        if (haystack.contains(needle)) {
            return haystack.indexOf(needle);
        }

        return -1;
    }

}
