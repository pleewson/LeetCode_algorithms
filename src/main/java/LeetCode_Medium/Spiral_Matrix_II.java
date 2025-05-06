package LeetCode_Medium;

// https://leetcode.com/problems/spiral-matrix-ii/

public class Spiral_Matrix_II {
    public static void main(String[] args) {
        int n = 5;

        System.out.println(generateMatrix(n));

    }

    public static int[][] generateMatrix(int n) {
        int num = 1;
        int[][] outputArr = new int[n][n];

        int index = 0;
        while (num != ((n*n)+1)) {

            //to right
            for (int i = index; i < (n - index); i++) {
                outputArr[0+index][i] = num;
                num++;
                if((num == ((n*n)+1))){
                    break;
                }
            }

            if((num == ((n*n)+1))){
                break;
            }

            //down
            for (int i = (index + 1); i < (n - index - 1); i++) {
                outputArr[i][n - index - 1] = num;
                num++;
                if((num == ((n*n)+1))){
                    break;
                }
            }

            if((num == ((n*n)+1))){
                break;
            }


            //to left
            for (int i = (n - index - 1); i >= index; i--) {
                outputArr[n - index - 1][i] = num;
                num++;
                if((num == ((n*n)+1))){
                    break;
                }
            }

            if((num == ((n*n)+1))){
                break;
            }

            //up
            for (int i = (n - index - 2); i >= (index + 1); i--) {
                outputArr[i][index] = num;
                num++;
                if((num == ((n*n)+1))){
                    break;
                }
            }

            if((num == ((n*n)+1))){
                break;
            }

                index++;
        }


//        //print
//        for (int i = 0; i < outputArr.length; i++) {
//            System.out.println();
//            for (int j = 0; j < outputArr[i].length; j++) {
//                System.out.print(outputArr[i][j] + ", ");
//            }
//        }

        return outputArr;
    }


}
