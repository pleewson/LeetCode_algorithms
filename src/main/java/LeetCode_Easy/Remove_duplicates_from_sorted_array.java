package LeetCode_Easy;

import java.util.*;

public class Remove_duplicates_from_sorted_array {
    public static void main(String[] args) {

        int[] array = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        System.out.println("return -> " + removeDuplicates(array));
    }

    public static int removeDuplicates(int[] nums) {
        Arrays.sort(nums);
        TreeSet<Integer> set = new TreeSet<>();
        int uniqueVal = 0;

        for (int i = 0; i < nums.length; i++) {
            if (set.add(nums[i])) {
                set.add(nums[i]);
                uniqueVal++;
            }
        }

        int i = 0;
        for (int val : set) {
            nums[i] = val;
            i++;
        }

        return uniqueVal;
    }
}
