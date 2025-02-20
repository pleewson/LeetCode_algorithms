package LeetCode_Daily.year2025.febuary2025;

public class Find_Unique_Binary_String {
    public static void main(String[] args) {
        String[] nums = {"111", "011", "001"};
        System.out.println(findDifferentBinaryString(nums));
    }

    public static String findDifferentBinaryString(String[] nums) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < nums.length; i++) {
            char[] tempArr = nums[i].toCharArray();
            if (tempArr[i] == '0') {
                stringBuilder.append('1');
            } else {
                stringBuilder.append('0');
            }
        }
        return stringBuilder.toString();
    }
}
