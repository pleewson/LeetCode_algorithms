package LeetCode_Medium;

// https://leetcode.com/problems/spiral-matrix-ii/

public class Spiral_Matrix_II {
    public static void main(String[] args) {
        int n = 4;

        System.out.println(generateMatrix(n));

    }

    public static int[][] generateMatrix(int n) {
        int num = 1;
        int[][] outputArr = new int[n][n];

//        int h = 0;
//        while ()

            for (int i = 0; i < n; i++) {
                outputArr[0][i] = num;
                num++;
            }

        for (int i = 1; i < n; i++) {
            outputArr[i][n - 1] = num;
            num++;
        }

        for (int i = n - 2; i >= 0; i--) {
            outputArr[n - 1][i] = num;
            num++;
        }

        for (int i = n - 2; i >= 1; i--) {
            outputArr[i][0] = num;
            num++;

        }

        for (int i = 0; i < outputArr.length; i++) {
            System.out.println();
            for (int j = 0; j < outputArr[i].length; j++) {
                System.out.print(outputArr[i][j]);
            }
        }

        return null;
    }

}
