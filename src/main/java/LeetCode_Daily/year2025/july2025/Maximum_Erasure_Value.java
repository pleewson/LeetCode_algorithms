package LeetCode_Daily.year2025.july2025;
//https://leetcode.com/problems/maximum-erasure-value/submissions/1707399271/?envType=daily-question&envId=2025-07-22
import java.util.HashSet;

public class Maximum_Erasure_Value {

    public static void main(String[] args) {
        int[] nums = {4, 2, 4, 5, 6};
        System.out.println(maximumUniqueSubarray(nums));
    }

    public static int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        int maxSum = 0;
        int start = 0;
        if (nums.length == 1) {
            return nums[0];
        }

        for (int end = 0; end < nums.length; end++) {

            while (set.contains(nums[end])) {
                set.remove(nums[start]);
                sum -= nums[start];
                start++;
            }

            set.add(nums[end]);
            sum += nums[end];

            maxSum = Integer.max(sum, maxSum);
        }


        return maxSum;
    }
}
