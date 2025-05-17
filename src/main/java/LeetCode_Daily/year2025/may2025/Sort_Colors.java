package LeetCode_Daily.year2025.may2025;

// https://leetcode.com/problems/sort-colors/submissions/1636290255/?envType=daily-question&envId=2025-05-17

import java.util.ArrayList;
import java.util.List;

public class Sort_Colors {

    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors(nums);
    }

    public static void sortColors(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                list.add(nums[i]);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                list.add(nums[i]);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                list.add(nums[i]);
            }
        }


        for (int i = 0; i < nums.length; i++) {
            nums[i] = list.get(i);
        }

    }

}
