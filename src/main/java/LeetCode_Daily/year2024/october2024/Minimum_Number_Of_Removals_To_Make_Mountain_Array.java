package LeetCode_Daily.year2024.october2024;

//https://leetcode.com/problems/minimum-number-of-removals-to-make-mountain-array/description/?envType=daily-question&envId=2024-10-30
//not accepted.


public class Minimum_Number_Of_Removals_To_Make_Mountain_Array {
    public static void main(String[] args) {
//        int[] nums = {2, 1, 1, 5, 6, 2, 3, 1};
//        int[] nums = {1, 3, 1};
//        int[] nums = {1, 16, 84, 9, 29, 71, 86, 79, 72, 12};
//        int[] nums = {4, 3, 2, 1, 1, 2, 3, 1};
        int[] nums = {23,47,63,72,81,99,88,55,21,33,32};

        System.out.println(minimumMountainRemovals(nums));
    }


    public static int minimumMountainRemovals(int[] nums) {
        int indexesToRemove = 0;
        boolean climb = true;

        //top of the mountain
        int highestIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (climb) {
                if (nums[i - 1] < nums[i]) {
                    climb = false;
                    highestIndex = i;
                }
            } else {
                if (nums[highestIndex] < nums[i]) {
                    highestIndex = i;
                }
            }
        }

//        System.out.println("hi : " + highestIndex);

//        //mountainToLeft
//        int currentHighestLeft = highestIndex;
//        for (int i = highestIndex; i >= 1; i--) {
//            if (nums[i - 1] >= nums[currentHighestLeft]) {
//                indexesToRemove++;
//            } else {
//                currentHighestLeft = i - 1;
//            }
//        }

        //mountainToRight
        int currentHighestRight = highestIndex;
        for (int i = highestIndex; i < nums.length - 1; i++) {
            if (nums[i + 1] >= nums[currentHighestRight]) {
                indexesToRemove++;
            } else {
                currentHighestRight = i + 1;
            }
        }

        return indexesToRemove;
    }

}


