package LeetCode_Easy;

import java.util.Arrays;

// https://leetcode.com/problems/search-insert-position/description/

public class Search_Insert_Position {
    public static void main(String[] args) {

        int [] nums = {1,3,5,6};
        System.out.println(searchInsert(nums,4));

    }

    public static int searchInsert(int[] nums, int target){

        //if target is inside array
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                return i;
            }
        }

        //increase array and add one more value, then sort it
        nums = Arrays.copyOf(nums, nums.length+1);
        nums[nums.length-1] = target;
        Arrays.sort(nums);

        //return target index
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                return i;
            }
        }

        return 0;

    }
}
