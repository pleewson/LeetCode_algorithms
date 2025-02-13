package LeetCode_Daily.year2025.febuary2025;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/max-sum-of-a-pair-with-equal-sum-of-digits/submissions/1542256831/
public class Max_Sum_of_a_Pair_With_Equal_Sum_of_Digits {
    public static void main(String[] args) {
        int[] nums = {18, 43, 36, 13, 7};
        System.out.println(maximumSum(nums));
    }

    public static int maximumSum(int[] nums) {
        int highestPair = -1;

        Map<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int iTemp = nums[i];
            int iValue = 0;
            while (iTemp > 0) {
                iValue += iTemp % 10;
                iTemp = iTemp / 10;
            }
            if (hashMap.containsKey(iValue)) {
                if ((hashMap.get(iValue) + nums[i]) > highestPair) {
                    highestPair = hashMap.get(iValue) + nums[i];
                }
                if (hashMap.get(iValue) < nums[i]) {
                    hashMap.put(iValue, nums[i]);
                }
            }else{
                hashMap.put(iValue,nums[i]);
            }
        }

        return highestPair;

//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (convertedNums[i] == convertedNums[j]) {
//                    if ((nums[i] + nums[j]) > highestPair) {
//                        highestPair = nums[i] + nums[j];
//                    }
//                }
//            }
//        }

    }
}
