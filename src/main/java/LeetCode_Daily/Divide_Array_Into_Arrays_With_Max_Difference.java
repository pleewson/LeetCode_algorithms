package LeetCode_Daily;

import java.util.Arrays;

public class Divide_Array_Into_Arrays_With_Max_Difference {

    public static void main(String[] args) {

        int[] arr = {33,26,4,18,16,24,24,15,8,18,34,20,24,16,3};
        System.out.println(Arrays.toString(divideArray(arr, 16)));
        System.out.println(15 % 3);


    }

    public static int[][] divideArray(int[] nums, int k) {
        int[][] emptyArray = new int[0][0];
        int numsLengthDividedByThree = nums.length / 3;

        if (nums.length % 3 != 0) {
            return emptyArray;
        }
        Arrays.sort(nums);

        int[][] outputArray = new int[numsLengthDividedByThree][3];

        int next = 0;
        for (int i = 0; i < outputArray.length; i++) {
            for (int j = 0; j < outputArray[i].length; j++) {
                outputArray[i][j] = nums[next];
                next++;
            }
        }

        for (int i = 0; i < outputArray.length; i++) {
            for (int j = 0; j < outputArray[i].length; j++) {
                if ((outputArray[i][2] - outputArray[i][0]) <= k) {
                    //do nothing
                } else {
                    return emptyArray;
                }
            }
        }


        return outputArray;
    }

}
