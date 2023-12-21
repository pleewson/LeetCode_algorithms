package LeetCode_Daily;

public class Difference_Between_Ones_and_Zeros_in_Row_and_Colum {

    public static void main(String[] args) {

        int[][] arr = {
                {0, 1, 1},
                {1, 0, 1},
                {0, 0, 1},
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

        //finished here -it will be solution. First add every calculation(row and columns) into
        //different temporary Arrays then calculate their values and add them into outputArray.
        
//        int[] tempColArr = new int[grid[0].length];
//        int colPoss = 0;

        //[1][1][-1] row
        //[-1][-1][3] col

        int[][] outputArr = new int[grid.length][grid[0].length];
        int[] tempColArr = new int[grid[0].length];


        for (int i = 0; i < grid.length; i++) {

            int columnIndex = 0;
            int rowValue = 0;
            boolean letGo = true;

            while (columnIndex < grid[0].length) {

                int colValue = 0;
                int diff;

                //rows
                if (letGo) {
                    for (int j = 0; j < grid[i].length; j++) {
                        if (grid[i][j] == 0) {
                            rowValue--;
                        } else if (grid[i][j] == 1) {
                            rowValue++;
                        }
                    }
                    letGo = false;
                }


                //columns
                for (int j = 0; j < grid.length; j++) {
                    if (grid[j][columnIndex] == 0) {
                        colValue--;
                    } else if (grid[j][columnIndex] == 1) {
                        colValue++;
                    }
                }

                diff = colValue + rowValue;

                outputArr[i][columnIndex] = diff;
                columnIndex++;
            }
        }

        return outputArr;
    }
}
