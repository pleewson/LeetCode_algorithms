package LeetCode_Easy;

//https://leetcode.com/problems/remove-element/description/
import java.util.Arrays;

public class Remove_Element {
    public static void main(String[] args) {

        int[] nums = {2,3,2,3};
        System.out.println(removeElement(nums,2));

    }

    public static int removeElement(int[] nums, int val) {
        int k = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }

        nums = Arrays.copyOf(nums,nums.length-k);

        //System.out.println(Arrays.toString(nums));
        return k;
    }
}
