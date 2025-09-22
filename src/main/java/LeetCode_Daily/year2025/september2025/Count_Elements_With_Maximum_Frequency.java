package LeetCode_Daily.year2025.september2025;

import java.util.HashMap;
import java.util.Map;

public class Count_Elements_With_Maximum_Frequency {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 4};
        System.out.println(maxFrequencyElements(arr));
    }

    public static int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map1 = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map1.containsKey(nums[i])) {
                map1.put(nums[i], map1.get(nums[i]) + 1);
            } else {
                map1.put(nums[i], 1);
            }
        }

        int maxVal = 0;
        for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
            if (entry.getValue() > maxVal) {
                maxVal = entry.getValue();
            }
        }

        int sum = 0;
        for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
            if (entry.getValue() == maxVal) {
                sum += maxVal;
            }
        }

        return sum;
    }
}
