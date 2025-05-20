package LeetCode_Daily.year2025.may2025;

// https://leetcode.com/problems/zero-array-transformation-i/submissions/1639340957/?envType=daily-question&envId=2025-05-20

public class Zero_Array_Transformation_I {
    public static void main(String[] args) {
        int[] nums = {3,2,9,6};
        int[][] queries = {
                {3,3},
                {3,3},
                {0,1},
                {0,3},
                {1,1},
                {1,1},
                {2,2},
                {0,3},
                {1,2}
        };

        System.out.println(isZeroArray(nums, queries));

    }


    public static boolean isZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] diff = new int[n + 1];

        for (int[] query : queries) {
            int left = query[0];
            int right = query[1];

            diff[left]++;

            if (right + 1 < n) {
                diff[right+1]--;
            }
        }


        int count = 0;
        for (int i = 0; i < n; i++) {
            count += diff[i];

            if (nums[i] > count) {
                return false;
            }
        }

        return true;
    }

}
