package LeetCode_Daily.year2025.may2025;

public class Build_Array_from_Permutation {

    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 5, 3, 4};

        buildArray(nums);
    }


    public static int[] buildArray(int[] nums) {
        int[] outputArr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            outputArr[i] = nums[nums[i]];
        }

        return outputArr;
    }

}
