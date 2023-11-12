package LeetCode_Easy;

import java.util.Arrays;

public class Single_Number {
    public static void main(String[] args) {
        int[] num = {2,2,9,4,6,4,6};

        System.out.println(singleNumber(num));

    }

    public static int singleNumber(int[] nums){

        Arrays.sort(nums);

        int single = 0;

        for(int i = 0; i < nums.length; i++){
            single = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    single += 1;
                }
            }
            if(single == 1){
                return nums[i];
            }
        }

        return 0;
    }
}
