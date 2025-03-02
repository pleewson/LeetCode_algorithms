package LeetCode_Daily.year2025.febuary2025;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//https://leetcode.com/problems/length-of-longest-fibonacci-subsequence/description/?envType=daily-question&envId=2025-02-27

public class Length_of_Longest_Fibonacci_Subsequence {
    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 11, 12, 14, 18};
        System.out.println(lenLongestFibSubseq(arr));
    }

    public static int lenLongestFibSubseq(int[] arr) {
        List<List<Integer>> fibonacciList = new ArrayList<>();
        int longestSubsequence = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {
                List<Integer> tempList = new LinkedList<>();
                if (j < arr.length - 1) {
                    tempList.add(arr[i]);
                    tempList.add(arr[j + 1]);
                    fibonacciList.add(tempList);
                }
            }

            for (List<Integer> list : fibonacciList) {

                if ((list.get(list.size() - 2) + list.get(list.size() - 1)) == arr[i]) {
                    list.add(arr[i]);
                    System.out.println(list);
                }

                if (list.size() >= 3 && list.size() > longestSubsequence) {
                    longestSubsequence = list.size();
                }
            }
        }


        return longestSubsequence;
    }
}

