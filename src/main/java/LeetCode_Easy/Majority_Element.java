package LeetCode_Easy;

import java.util.*;

public class Majority_Element {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(arr));
    }

    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int value = map.get(nums[i]);
                value++;
                map.put(nums[i], value);
            } else {
                map.put(nums[i], 1);
            }
        }

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        for (int i : set) {
            if (map.get(i) > (nums.length / 2)) {
                return i;
            }
        }

        return -1;
    }
}
