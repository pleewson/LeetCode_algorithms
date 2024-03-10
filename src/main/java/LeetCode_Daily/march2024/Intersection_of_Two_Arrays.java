package LeetCode_Daily.march2024;
// https://leetcode.com/problems/intersection-of-two-arrays/description/?envType=daily-question&envId=2024-03-10

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Intersection_of_Two_Arrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 1};
        int[] arr2 = {2, 2};

        System.out.println(Arrays.toString(intersection(arr1, arr2)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            set2.add(nums2[i]);
        }

        Set<Integer> outputSet = new HashSet<>();
        for (Integer value : set1) {
            if (set2.contains(value)) {
                outputSet.add(value);
            }
        }

        int[] outputArray = new int[outputSet.size()];
        int index = 0;
        for (Integer value : outputSet) {
            outputArray[index] = value;
            index++;
        }

        return outputArray;
    }
}
