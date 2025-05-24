package LeetCode_Daily.year2025.may2025;

// https://leetcode.com/problems/set-matrix-zeroes/description/?envType=daily-question&envId=2025-05-21

public class Set_Matrix_Zeroes {

    public static void main(String[] args) {
        int[][] matrix = {
                {0, 1, 2, 0},
                {3, 4, 5, 2},
                {1, 3, 1, 5}
        };

        setZeroes(matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + ", ");
            }
            System.out.println();
        }

    }


    public static void setZeroes(int[][] matrix) {
        int[][] tempArr = copy2dArr(matrix);

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    setZeroesInArray(tempArr, i, j);
                    continue;
                }
            }
        }
        copy2dArr(matrix, tempArr);
    }


    private static void setZeroesInArray(int[][] array, int column, int row) {
        for (int i = 0; i < array[0].length; i++) {
            array[column][i] = 0;
        }

        for (int i = 0; i < array.length; i++) {
            array[i][row] = 0;
        }
    }


    private static int[][] copy2dArr(int[][] arr) {
        int[][] outputArr = new int[arr.length][arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                outputArr[i][j] = arr[i][j];
            }
        }

        return outputArr;
    }


    private static void copy2dArr(int[][] arr1, int[][] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = arr2[i][j];
            }
        }
    }
}
