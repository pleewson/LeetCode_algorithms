package LeetCode_Easy;

//https://leetcode.com/problems/add-digits/description/

public class Add_Digits {
    public static void main(String[] args) {

        System.out.println(addDigits(0));

    }

    public static int addDigits(int num) {
        char[] charArray = Integer.toString(num).toCharArray();

        int sum = 0;

        while (true) {

            for (int i = 0; i < charArray.length; i++) {
                sum += charArray[i] - '0';
            }

            if (sum < 10) {
                return sum;
            } else {
                charArray = Integer.toString(sum).toCharArray();
                sum = 0;
            }

        }
    }
}
