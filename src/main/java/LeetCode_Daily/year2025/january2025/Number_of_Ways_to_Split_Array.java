package LeetCode_Daily.year2025.january2025;

public class Number_of_Ways_to_Split_Array {
    public static void main(String[] args) {
//        int[] nums = {2,3,1,0};
        int[] nums = {10, 4, -8, 7};

        System.out.println(waysToSplitArray(nums));
    }

    public static int waysToSplitArray(int[] nums) {
        long sumA = 0;
        long sumB = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            sumB += nums[i];
        }


        for (int i = 0; i < nums.length - 1; i++) {
            sumA += nums[i];
            sumB = sumB - nums[i];

            if(sumA>=sumB){
                count++;
            }
        }

        return count;
    }
}
