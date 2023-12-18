package LeetCode_Daily;

public class Difference_Between_Ones_and_Zeros_in_Row_and_Colum {

    public static void main(String[] args) {

        int[][] arr = {
                {0, 1, 1},
                {1, 0, 1},
                {0, 0, 1}
        };


        int[][] arrrrr = onesMinusZeros(arr);

        for (int i = 0; i < arrrrr.length; i++) {
            System.out.println();
            for (int j = 0; j < arrrrr[i].length; j++) {
                System.out.println(arrrrr[i][j]);
            }
        }
    }


    public static int[][] onesMinusZeros(int[][] grid) {

        int[][] outputArr = new int[grid.length][grid.length];

        int x = 0;

        for (int i = 0; i < grid.length; i++) {

            int onesRow = 0;
            int zerosRow = 0;
            int onesCol = 0;
            int zeroesCol = 0;
            int diff = 0;

            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 0) {
                    zerosRow++;
                } else if (grid[i][j] == 1) {
                    onesRow++;
                }

                if (grid[j][i] == 0) {
                    zeroesCol++;
                } else if (grid[j][i] == 1) {
                    onesCol++;
                }
            }

            diff = onesRow + onesCol - zerosRow - zeroesCol;

            if (x > grid.length) {
                x = 0;
            }

            outputArr[i][x] = diff;

            x++;
        }

        return outputArr;
    }

    //brd1


}
