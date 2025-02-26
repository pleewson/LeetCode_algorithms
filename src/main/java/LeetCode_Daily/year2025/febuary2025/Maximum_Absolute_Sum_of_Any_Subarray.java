package LeetCode_Daily.year2025.febuary2025;

public class Maximum_Absolute_Sum_of_Any_Subarray {
    public static void main(String[] args) {
        int[] nums = {2,-5,1,-4,3,-2};

        System.out.println(maxAbsoluteSum(nums));
    }

    public static int maxAbsoluteSum(int[] nums) {
        int highSum = nums[0];
        int lowSum = nums[0];

        //max
        for (int i = 0; i < nums.length; i++) {
            int currentSum = 0;
            for (int j = i; j < nums.length; j++) {
                currentSum += nums[j];
                if (currentSum > highSum) {
                    highSum = currentSum;
                }
                if (nums[j] > currentSum) {
                    i = j - 1;
                    break;
                }
            }
        }

        //low
        for (int i = 0; i < nums.length; i++) {
            int currentSum = 0;
            for (int j = i; j < nums.length; j++) {
                currentSum += nums[j];
                if (currentSum < lowSum) {
                    lowSum = currentSum;
                }
                if (nums[j] < currentSum) {
                    i = j - 1;
                    break;
                }
            }
        }

        if (lowSum < 0) {
            lowSum *= -1;
        }

        return Math.max(highSum, lowSum);
    }
}
