package LeetCode_Daily.year2026.may2026;

import java.util.Arrays;

// https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/?envType=daily-question&envId=2026-05-23
public class Check_if_Array_Is_Sorted_and_Rotated {

    public static void main(String[] args) {
        int[] nums = {2, 1, 3, 4};
        System.out.println(check(nums));
    }


    public static boolean check(int[] nums) {
        int[] sortedArr = nums.clone();
        Arrays.sort(sortedArr);
        int counter;

        for (int max = 0; max < nums.length; max++) {
            counter = 0;
            for (int i = 0; i < nums.length; i++) {
                if (sortedArr[i] == nums[i]) {
                    counter++;
                    if (counter == nums.length) {
                        return true;
                    }
                } else {
                    sortedArr = moveArr(sortedArr);
                    break;
                }
            }
        }
        return false;
    }

    private static int[] moveArr(int[] nums) {
        int[] output = new int[nums.length];
        output[0] = nums[nums.length - 1];

        for (int i = 1; i < nums.length; i++) {
            output[i] = nums[i-1];
        }
        return output;
    }
}