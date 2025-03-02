package LeetCode_Daily.year2025;

import java.util.*;

//https://leetcode.com/problems/merge-two-2d-arrays-by-summing-values/description/?envType=daily-question&envId=2025-03-02

public class march2025 {
    public static void main(String[] args) {
        int[][] arr1 = {
                {1, 2},
                {2, 3},
                {4, 5}};

        int[][] arr2 = {
                {1, 4},
                {3, 2},
                {4, 1},
        };

        System.out.println(mergeArrays(arr1, arr2));
    }


    public static int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> sortedList = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            if (map.containsKey(nums1[i][0])) {
                map.put(nums2[i][0], (map.get(nums1[i][0]) + nums2[i][1]));
            } else {
                map.put(nums1[i][0], nums1[i][1]);
                sortedList.add(nums1[i][0]);
            }
        }

        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i][0])) {
                map.put(nums2[i][0], (map.get(nums2[i][0]) + nums2[i][1]));
            } else {
                map.put(nums2[i][0], nums2[i][1]);
                sortedList.add(nums2[i][0]);
            }
        }

        Collections.sort(sortedList);

        int[][] outputArr = new int[map.size()][2];

        for (int i = 0; i < sortedList.size(); i++) {
            outputArr[i][0] = sortedList.get(i);
            outputArr[i][1] = map.get(sortedList.get(i));
        }


        return outputArr;
    }
}
