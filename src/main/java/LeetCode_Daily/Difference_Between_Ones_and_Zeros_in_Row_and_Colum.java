package LeetCode_Daily;

public class Difference_Between_Ones_and_Zeros_in_Row_and_Colum {

    public static void main(String[] args) {

        int[][] arr = {
                {1,1,1},
                {1,1,1}

        };


        int[][] arrrrr = onesMinusZeros(arr);

        for (int i = 0; i < arrrrr.length; i++) {
            System.out.println();
            for (int j = 0; j < arrrrr[i].length; j++) {
                System.out.print(arrrrr[i][j]);
            }
        }
    }


    public static int[][] onesMinusZeros(int[][] grid) {

        int[][] outputArr = new int[grid.length][grid.length];

        for (int i = 0; i < grid.length; i++) {
            int columnIndex = 0;

            while (columnIndex < grid.length) {

                int onesRow = 0;
                int zerosRow = 0;
                int onesCol = 0;
                int zeroesCol = 0;
                int diff;

                //rows
                for (int j = 0; j < grid[i].length; j++) {
                    if (grid[i][j] == 0) {
                        zerosRow++;
                    } else if (grid[i][j] == 1) {
                        onesRow++;
                    }

                    //columns
                    
                    if (grid[j][columnIndex] == 0) {
                        zeroesCol++;
                    } else if (grid[j][columnIndex] == 1) {
                        onesCol++;
                    }
                }

                diff = onesRow + onesCol - zerosRow - zeroesCol;

                outputArr[i][columnIndex] = diff;
                columnIndex++;
            }
        }

        return outputArr;
    }
}
