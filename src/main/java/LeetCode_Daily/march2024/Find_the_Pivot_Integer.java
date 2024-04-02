package LeetCode_Daily.march2024;
// https://leetcode.com/problems/find-the-pivot-integer/submissions/1202393065/?envType=daily-question&envId=2024-03-13

public class Find_the_Pivot_Integer {
    public static void main(String[] args) {
        System.out.println(pivotInteger(8));
    }

    public static int pivotInteger(int n) {

        int[] sumArray = new int[n];
        int prefixSum = 0;
        for (int i = 1; i <= n; i++) {
            prefixSum += i;
            sumArray[i-1] = prefixSum;
        }

        int oppositePrefixSum = 0;
        for(int i = n; i > 0; i--){
            oppositePrefixSum += i;

            if(oppositePrefixSum == sumArray[i-1]){
                return i;
            }
        }

//scrum d16
        return -1;
    }
}
