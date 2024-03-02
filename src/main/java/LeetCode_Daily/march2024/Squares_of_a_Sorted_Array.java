package LeetCode_Daily.march2024;

import java.util.Arrays;

// https://leetcode.com/problems/squares-of-a-sorted-array/description/?envType=daily-question&envId=2024-03-02
public class Squares_of_a_Sorted_Array {
    public static void main(String[] args) {

    }

    public static int[] sortedSquares(int[] nums) {
        int[] tempArr = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            tempArr[i] = nums[i] * nums[i];
        }

        Arrays.sort(tempArr);

        return tempArr;
    }
}
