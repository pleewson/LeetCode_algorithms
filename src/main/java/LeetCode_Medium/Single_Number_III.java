package LeetCode_Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Single_Number_III {

    public static void main(String[] args) {

        int[] arr = {1, 2, 1, 3, 2, 5};
        System.out.println(singleNumber(arr));
    }

    public static int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        List<Integer> output = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                hashMap.put(nums[i], hashMap.get(nums[i]) + 1);
            } else {
                hashMap.put(nums[i], 1);
            }
        }

        for (Integer num : hashMap.keySet()) {
            if (hashMap.get(num) == 1) {
                output.add(num);
                if (output.size() == 2) {
                    int[] outputArr = {output.get(0), output.get(1)};
                    return outputArr;
                }
            }
        }

        return null;
    }

}
