package LeetCode_Daily.year2025.april2025;

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/?envType=daily-question&envId=2025-04-30

public class Find_Numbers_with_Even_Number_of_Digits {

    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};

        System.out.println(findNumbers(nums));
    }


    public static int findNumbers(int[] nums) {
        int sum = 0;

        for (Integer i : nums) {
            if (i >= 10 && i <= 99) {
                sum++;
            } else if (i >= 1000 && i <= 9999) {
                sum++;
            } else if (i == 100000) {
                sum++;
            }
        }

        return sum;
    }

}

