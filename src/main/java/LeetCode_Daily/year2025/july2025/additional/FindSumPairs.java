package LeetCode_Daily.year2025.july2025.additional;

import java.util.HashMap;

public class FindSumPairs {

    private int[] nums1;
    private int[] nums2;
    private HashMap<Integer, Integer> hashMap;

    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;
        hashMap = new HashMap<>();

        for (int num : nums2) {
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }

    }

    public void add(int index, int val) {
        int oldVal = nums2[index];
        hashMap.put(oldVal, hashMap.get(oldVal) - 1);
        nums2[index] += val;
        int newVal = nums2[index];
        hashMap.put(newVal, hashMap.getOrDefault(newVal, 0) + 1);
    }

    public int count(int tot) {
        int counter = 0;

        for (int num : nums1) {
            int rest = tot - num;
            counter += hashMap.getOrDefault(rest, 0);
        }

        return counter;
    }

}
