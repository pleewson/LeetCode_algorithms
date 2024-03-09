package LeetCode_Daily.march2024;
// https://leetcode.com/problems/count-elements-with-maximum-frequency/submissions/1198010120/?envType=daily-question&envId=2024-03-08

import java.util.HashMap;
import java.util.Map;

public class Count_Elements_With_Maximum_Frequency {
    public static void main(String[] args) {
        int[] array = {};
        System.out.println(maxFrequencyElements(array));
    }

    public static int maxFrequencyElements(int[] nums) {
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

        int maxValue = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > maxValue){
                maxValue = entry.getValue();
            }
        }

        int frequency = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() == maxValue){
                frequency += entry.getValue();
            }
        }
        return frequency;
    }
}
