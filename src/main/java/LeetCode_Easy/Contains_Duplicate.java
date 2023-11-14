package LeetCode_Easy;
//https://leetcode.com/problems/contains-duplicate/description/
import java.util.HashSet;

public class Contains_Duplicate {
    public static void main(String[] args) {

        int[] nums = {2, 2, 3, 4, 5};
        System.out.println(containsDuplicate(nums));


    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if(hashSet.add(nums[i])){
            }else{
                return true;
            }
        }
        return false;

    }
}
