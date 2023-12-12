package LeetCode_Easy;

import java.util.*;

public class Remove_duplicates_from_sorted_array {
    public static void main(String[] args) {

        int[] array = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        System.out.println(removeDuplicates(array));
        //tomorrow

    }

    public static int removeDuplicates(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        Iterator<Integer> iterator = set.iterator();
        int[] noDuplicatesArray = new int[nums.length];
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        System.out.println(arrayList + " -> array list");

        System.out.println(set + " -> set przed for");
        for (int i = 0; i < set.size(); i++) {
            if (iterator.hasNext()) {
                noDuplicatesArray[i] = iterator.next();
            }
        }

        System.out.println("array -> " + Arrays.toString(noDuplicatesArray));
//        for(int i = set.size(); i < nums.length; i++){
//            nums[i] = null;
//        }

        System.out.println(Arrays.toString(set.toArray()));

        int numberOfDuplicates = nums.length - set.size();

        return numberOfDuplicates;
    }
}
