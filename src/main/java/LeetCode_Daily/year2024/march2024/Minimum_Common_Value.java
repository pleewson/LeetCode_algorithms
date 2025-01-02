package LeetCode_Daily.year2024.march2024;
// https://leetcode.com/problems/minimum-common-value/?envType=daily-question&envId=2024-03-09

import java.util.*;

public class Minimum_Common_Value {
    public static void main(String[] args) {
        int[] nums1 = {1,2,8,12,32,34,43,52,57,62,64,67,71,71,79,81,86,91,93,94};
        int[] nums2 = {9,11,12,14,19,25,29,31,38,39,41,42,58,63,66,70,71,73,91,91};

        System.out.println(getCommon(nums1, nums2));

    }

    public static int getCommon(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new TreeSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }

        for(Integer value : nums2){
            if(set1.contains(value)){
                return value;
            }
        }

        return -1;
    }
}
