package LeetCode_Easy;

public class Power_of_Two {
    public static void main(String[] args) {

        System.out.println(isPowerOfTwo(1073741824));
    }

    public static boolean isPowerOfTwo(int n) {

        for (int i = 0; i < 31; i++) {
            if (Math.pow(2, i) == n) {
                return true;
            }
        }

        return false;
    }
}
