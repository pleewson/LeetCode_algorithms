package LeetCode_Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sort_Colors {

    public static void main(String[] args) {
        int[] arr = {1, 0};
        sortColors(arr);
    }

    public static void sortColors(int[] nums) {
        int[] outputArr = new int[nums.length];

        int zero = 0;
        int one = 0;
        int two = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zero++;
            } else if (nums[i] == 1) {
                one++;
            } else {
                two++;
            }
        }

        //fill 0
        for (int i = 0; i < zero; i++) {
            nums[i] = 0;
        }

        //fill 1
        int sumZeroOne = zero + one;
        for (int i = zero; i < sumZeroOne; i++) {
            nums[i] = 1;
        }

        //fill 2
        for (int i = sumZeroOne; i < nums.length; i++){
            nums[i] = 2;
        }


        System.out.println(Arrays.toString(nums));
    }
}
