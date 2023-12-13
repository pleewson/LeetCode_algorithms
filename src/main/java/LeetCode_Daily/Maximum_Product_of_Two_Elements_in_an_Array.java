package LeetCode_Daily;

public class Maximum_Product_of_Two_Elements_in_an_Array {
    public static void main(String[] args) {

        int[] nums = {3, 7};
        System.out.println(maxProduct(nums));
    }


    public static int maxProduct(int[] nums) {

        int firstBigValue = 0;
        int firstIndex = 0;

        int secondBigValue = 0;
        int secondIndex = 1;

        for (int i = 0; i < nums.length; i++) {
            if (firstBigValue < nums[i]) {
                firstBigValue = nums[i];
                firstIndex = i;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (secondBigValue < nums[j] && firstIndex != j) {
                secondBigValue = nums[j];
                secondIndex = j;
            }
        }

        return (nums[firstIndex] - 1) * (nums[secondIndex] - 1);
    }
}
