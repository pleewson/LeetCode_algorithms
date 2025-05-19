package LeetCode_Daily.year2025.may2025;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/type-of-triangle/submissions/1638096101/?envType=daily-question&envId=2025-05-19

public class Type_of_Triangle {

    public static void main(String[] args) {
        int[] nums = {3, 4, 5};
        System.out.println(triangleType(nums));
    }


    public static String triangleType(int[] nums) {
        if (nums.length != 3) {
            return "none";
        }

        List<Integer> temp = new ArrayList<>();
        temp.add(nums[0]);
        temp.add(nums[1]);
        temp.add(nums[2]);

        int biggestLength = nums[0];
        int mediumLength = 0;
        int smallestLength = 101;

        int removeIndex = 0;

        for (int i = 1; i < temp.size(); i++) {
            if (temp.get(i) > biggestLength) {
                biggestLength = temp.get(i);
                removeIndex = i;
            }
        }
        temp.remove(removeIndex);

        for (int i = 0; i < temp.size(); i++) {
            if (temp.get(i) < smallestLength) {
                smallestLength = temp.get(i);
                removeIndex = i;
            }
        }
        temp.remove(removeIndex);

        mediumLength = temp.get(0);


        if (smallestLength + mediumLength <= biggestLength) {
            return "none";
        }

        if (nums[0] == nums[1] && nums[0] == nums[2]) {
            return "equilateral";
        }

        if (nums[0] == nums[1] || nums[0] == nums[2] || nums[1] == nums[2]) {
            return "isosceles";
        } else {
            return "scalene";
        }
    }

}
