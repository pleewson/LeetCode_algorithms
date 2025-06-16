package LeetCode_Daily.year2025.june2025;

public class Maximum_Difference_Between_Increasing_Elements {
    public static void main(String[] args) {
        int[] nums = {9, 4, 3, 2};
        System.out.println(maximumDifference(nums));
    }

    public static int maximumDifference(int[] nums) {
        int tempDiffVal;
        int diffVal = -1;


        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                tempDiffVal = nums[j] - nums[i];
                if (tempDiffVal > diffVal) {
                    diffVal = tempDiffVal;
                }
            }
        }

        if (diffVal == 0) {
            return -1;
        }

        return diffVal;
    }

}
