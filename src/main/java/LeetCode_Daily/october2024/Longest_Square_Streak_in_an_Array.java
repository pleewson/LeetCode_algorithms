package LeetCode_Daily.october2024;

import java.util.*;

public class Longest_Square_Streak_in_an_Array {
    public static void main(String[] args) {

        int[] nums = {5, 12, 3, 10, 4, 11, 4, 16, 11};

        System.out.println(longestSquareStreak(nums));

    }

    public static int longestSquareStreak(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.sort(nums);

        int streak = -1;

        for (int num : nums) {
            int sqrt = (int) Math.sqrt(num);
            if (sqrt * sqrt == num && map.containsKey(sqrt)) {
                map.put(num, map.get(sqrt) + 1);
                streak = Math.max(streak, map.get(num));
            } else {
                map.put(num, 1);
            }
        }

        return streak;
    }
}
