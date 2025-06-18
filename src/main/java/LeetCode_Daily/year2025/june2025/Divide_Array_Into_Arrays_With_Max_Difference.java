package LeetCode_Daily.year2025.june2025;

import java.util.Arrays;

//https://leetcode.com/problems/divide-array-into-arrays-with-max-difference/description/?envType=daily-question&envId=2025-06-18

public class Divide_Array_Into_Arrays_With_Max_Difference {

    public static void main(String[] args) {
        int[] nums = {2, 4, 2, 2, 5, 2};
        int k = 2;
        divideArray(nums, k);
    }

    public static int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int[][] outputArr = new int[nums.length / 3][3];

        int index = 0;

        for (int i = 2; i < nums.length; i += 3) {
            int condition1 = nums[i] - nums[i - 1];
            int condition2 = nums[i] - nums[i - 2];
            int condition3 = nums[i - 1] - nums[i - 2];

            if (condition1 <= k && condition2 <= k && condition3 <= k) {
                outputArr[index][0] = nums[i - 2];
                outputArr[index][1] = nums[i - 1];
                outputArr[index][2] = nums[i];
                index++;
            } else {
                int[][] emptyArr = new int[0][0];
                return emptyArr;
            }
        }

        return outputArr;
    }
}
