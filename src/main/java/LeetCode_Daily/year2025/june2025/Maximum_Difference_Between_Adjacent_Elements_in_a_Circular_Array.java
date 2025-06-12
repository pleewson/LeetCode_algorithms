package LeetCode_Daily.year2025.june2025;

public class Maximum_Difference_Between_Adjacent_Elements_in_a_Circular_Array {
    public static void main(String[] args) {
        int[] nums = {1, 2, 4};
        System.out.println(maxAdjacentDistance(nums));
    }


    public static int maxAdjacentDistance(int[] nums) {
        int maxDiff = 0;
        int currDif = 0;
        int bigger = 0;
        int lower = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                bigger = nums[i - 1];
                lower = nums[i];
            } else {
                bigger = nums[i];
                lower = nums[i - 1];
            }
            currDif = bigger - lower;
            if (currDif > maxDiff) {
                maxDiff = currDif;
            }
        }

        if (nums[0] > nums[nums.length - 1]) {
            bigger = nums[0];
            lower = nums[nums.length - 1];
        } else {
            bigger = nums[nums.length - 1];
            lower = nums[0];
        }
        currDif = bigger - lower;
        if (currDif > maxDiff) {
            maxDiff = currDif;
        }

        return maxDiff;
    }
}
