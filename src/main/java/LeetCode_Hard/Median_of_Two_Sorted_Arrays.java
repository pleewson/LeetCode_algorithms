package LeetCode_Hard;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

//https://leetcode.com/problems/median-of-two-sorted-arrays/description/
//accepted without rule: The overall run time complexity should be O(log (m+n)).
public class Median_of_Two_Sorted_Arrays {


    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> commonNums = new LinkedList<>();

        for (int i = 0; i < nums1.length; i++) {
            commonNums.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            commonNums.add(nums2[i]);
        }

        Collections.sort(commonNums);

        if (commonNums.size() % 2 == 0) {
            double result = (commonNums.get(commonNums.size() / 2) + commonNums.get(commonNums.size() / 2 - 1)) / 2d;
            return result;
        } else {
            return commonNums.get(commonNums.size() / 2);
        }
    }
}
