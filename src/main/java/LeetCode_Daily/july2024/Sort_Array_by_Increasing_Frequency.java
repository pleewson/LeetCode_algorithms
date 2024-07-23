package LeetCode_Daily.july2024;
//https://leetcode.com/problems/sort-array-by-increasing-frequency/description/?envType=daily-question&envId=2024-07-23

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Sort_Array_by_Increasing_Frequency {

    public static void main(String[] args) {
        int[] arr = {2,3,1,3,2};
        System.out.println(frequencySort(arr));
    }

    public static int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        HashMap<Integer, Integer> sortedMap = map.entrySet()
                .stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue()
                        .thenComparing(Map.Entry::getKey).reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));

        List<Integer> integerList = new LinkedList<>();
        for(Map.Entry<Integer,Integer> entry : sortedMap.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();

            for(int i = 0; i < value; i++){
                integerList.add(key);
            }
        }


        int[] outputArr = new int[nums.length];

        for(int i = 0; i < integerList.size(); i++){
            outputArr[i] = integerList.get(i);
            System.out.println(integerList.get(i));
        }

            return outputArr;
    }
}
