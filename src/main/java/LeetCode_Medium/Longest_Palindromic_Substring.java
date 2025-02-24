//package LeetCode_Medium;
//
//// https://leetcode.com/problems/longest-palindromic-substring/description/
//public class Longest_Palindromic_Substring {
//    public static void main(String[] args) {
//        String s = "babad";
//
//        System.out.println(longestPalindrome(s));
//    }
//
//    public static String longestPalindrome(String s) {
//
//        if(s.length() == 1){
//            return s;
//        }
//
//        char[] sArr = s.toCharArray();
//        StringBuilder sb = new StringBuilder();
//        int begin = 0;
//        int end = 1;
//
//
//        for (int i = 0, j = s.length()-1; i < j; i++, j--) {
//                if (sArr[i] == sArr[j]) {
//                        begin = i;
//                        end = j+1;
//                } else {
//                    begin = 0;
//                    end = 1;
//                }
//            }
//
//        return s.substring(begin,end);
//    }
//
//}
