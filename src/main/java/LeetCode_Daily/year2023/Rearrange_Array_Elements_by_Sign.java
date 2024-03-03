package LeetCode_Daily.year2023;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Rearrange_Array_Elements_by_Sign {
    public static void main(String[] args) {

        int[] nums = {3, 1, -2, -5, 2, -4};
        System.out.println(Arrays.toString(rearrangeArray(nums)));

    }

    public static int[] rearrangeArray(int[] nums) {
        Queue<Integer> possitiveNums = new LinkedList<>();
        Queue<Integer> negativeNums = new LinkedList<>();

        int[] outputArray = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                possitiveNums.add(nums[i]);
            } else {
                negativeNums.add(nums[i]);
            }
        }

        for (int i = 0; i < outputArray.length; i += 2) {
            outputArray[i] = possitiveNums.poll();
            outputArray[i + 1] = negativeNums.poll();

            if (possitiveNums.isEmpty() || negativeNums.isEmpty()) {
                break;
            }
        }

        return outputArray;
    }
}
