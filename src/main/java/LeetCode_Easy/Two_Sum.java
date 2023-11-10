package LeetCode_Easy;

public class Two_Sum {
    public static void main(String[] args) {
        int [] nums = {2,6,11,15,7};
        int[] check = twoSum(nums,9);

        for(int i : check){
            System.out.println(i);
        }

    }

    public static int[] twoSum(int[] nums, int target){
        int[] twoIndexes = new int [2];

        for(int i = 0; i < nums.length; i++){
            for (int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    twoIndexes[0] = i;
                    twoIndexes[1] = j;
                }
            }
        }


        return twoIndexes;
    }

}


//Example 1:
//
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//Example 2:
//
//Input: nums = [3,2,4], target = 6
//Output: [1,2]
//Example 3:
//
//Input: nums = [3,3], target = 6
//Output: [0,1]
