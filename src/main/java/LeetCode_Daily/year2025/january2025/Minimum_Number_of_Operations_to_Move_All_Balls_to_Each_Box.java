package LeetCode_Daily.year2025.january2025;

public class Minimum_Number_of_Operations_to_Move_All_Balls_to_Each_Box {
    public static void main(String[] args) {
        String boxes = "001011";

        minOperations(boxes);
    }

    public static int[] minOperations(String boxes) {
        char[] arr = boxes.toCharArray();
        int[] outputArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == '1') {
                    if (j > i) {
                        sum += j - i; //+1?
                    } else if (j < i) {
                        sum += i - j; //+1??
                    }
                }
            }
            outputArr[i] = sum;
        }

        return outputArr;
    }
}
