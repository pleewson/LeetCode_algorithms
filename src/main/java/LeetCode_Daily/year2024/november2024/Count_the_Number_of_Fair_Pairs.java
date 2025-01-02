package LeetCode_Daily.year2024.november2024;

import java.util.Arrays;

//NOT ACCEPTED

public class Count_the_Number_of_Fair_Pairs {

    public static void main(String[] args) {
        int[] nums = {1, 7, 9, 2, 5};
        int lower = 11;
        int upper = 11;

        System.out.println(countFairPairs(nums, lower, upper));
    }


    public static long countFairPairs(int[] nums, int lower, int upper) {

        Arrays.sort(nums);
        long fairPairs = 0;


        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                continue;
            }
            for (int j = i + 1; j < nums.length; j++) {
                if (lower <= (nums[i] + nums[j]) && (nums[i] + nums[j]) <= upper) {
                    fairPairs++;
                    continue;
                }
                if (nums[i] == nums[j]) {
                    break;
                }
            }
        }


        return fairPairs;
    }

}
