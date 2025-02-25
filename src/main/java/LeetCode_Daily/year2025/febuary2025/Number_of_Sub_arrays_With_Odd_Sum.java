package LeetCode_Daily.year2025.febuary2025;
// https://leetcode.com/problems/number-of-sub-arrays-with-odd-sum/description/?envType=daily-question&envId=2025-02-25

public class Number_of_Sub_arrays_With_Odd_Sum {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5};
        System.out.println(numOfSubarrays(arr));
    }

    public static int numOfSubarrays(int[] arr) {
        int modulo = 1000000007;
        int odd = 0;
        int even = 1;

        int sum = 0;
        int result = 0;

        for (int num : arr) {
            sum = (sum + num) % 2;

            if (sum == 0) {
                result = (result + odd) % modulo;
                even++;
            } else {
                result = (result + even) % modulo;
                odd++;
            }
        }

        return result;
    }
}
