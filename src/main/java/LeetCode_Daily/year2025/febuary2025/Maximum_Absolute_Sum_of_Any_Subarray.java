package LeetCode_Daily.year2025.febuary2025;

public class Maximum_Absolute_Sum_of_Any_Subarray {
    public static void main(String[] args) {
        int[] nums = {1,-3,2,3,-4};

        System.out.println(maxAbsoluteSum(nums));
    }

    public static int maxAbsoluteSum(int[] nums) {
        int highSum = nums[0];
        int currentMax = nums[0];
        //max
        for (int i = 1; i < nums.length; i++) {
            currentMax = Math.max(currentMax + nums[i], nums[i]);
            highSum = Math.max(highSum, currentMax);
        }

        int lowSum = nums[0];
        int currentMin = nums[0];
        //min
        for (int i = 1; i < nums.length; i++) {
            currentMin = Math.min(currentMin + nums[i], nums[i]);
            lowSum = Math.min(lowSum, currentMin);
        }

        if (lowSum < 0) {
            lowSum *= -1;
        }

        return Math.max(highSum, lowSum);
    }
}

