package LeetCode_Daily.year2025.may2025;

// https://leetcode.com/problems/divisible-and-non-divisible-sums-difference/submissions/1645610711/?envType=daily-question&envId=2025-05-27
public class Divisible_and_Non_divisible_Sums_Difference {
    public static int differenceOfSums(int n, int m) {
        int num1 = 0;
        int num2 = 0;

        for (int i = 0; i <= n; i++) {
            if (i % m == 0) {
                num2 += i;
            } else {
                num1 += i;
            }
        }


        return num1 - num2;
    }
}
