package LeetCode_Easy;

//https://leetcode.com/problems/contains-duplicate-ii/description/
public class Contains_Duplicate_II {
    public static void main(String[] args) {
        int[] array = {1,2,3,1,2,3}; // k = 2

        System.out.println(containsNearbyDuplicate(array, 2));

    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    if (Math.abs(i - j) <= k) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
