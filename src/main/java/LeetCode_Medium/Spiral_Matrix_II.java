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
            System.out.println("to right");
            for (int i = index; i < (n - index); i++) {
                outputArr[0+index][i] = num;
                System.out.print(outputArr[0+index][i]);
                num++;
                if((num == ((n*n)+1))){
                    break;
                }
            }

            System.out.println();

            //down
            System.out.println("down");
            for (int i = (index + 1); i < (n - index - 1); i++) {
//                System.out.println("I = " + i);
//                System.out.println("n = " + n);
//                System.out.println("Index = " + index);
//                System.out.println("rownianie = " + (n - index - 1));
                outputArr[i][n - index - 1] = num;
                System.out.print(outputArr[i][n - index - 1]);
                num++;
                if((num == ((n*n)+1))){
                    break;
                }
            }

            System.out.println();


            //to left
            System.out.println("to left");
            for (int i = (n - index - 1); i >= index; i--) {
                outputArr[n - index - 1][i] = num;
                System.out.print(outputArr[n - index - 1][i]);
                num++;
                if((num == ((n*n)+1))){
                    break;
                }
            }

            System.out.println();

            //up
            System.out.println("up");
            for (int i = (n - index - 2); i >= (index + 1); i--) {
                outputArr[i][index] = num;
                System.out.print(outputArr[i][index]);
                num++;
                if((num == ((n*n)+1))){
                    break;
                }
            }

            System.out.println();
            index++;
        }


        //print
        for (int i = 0; i < outputArr.length; i++) {
            System.out.println();
            for (int j = 0; j < outputArr[i].length; j++) {
                System.out.print(outputArr[i][j] + ", ");
            }
        }

        return null;
    }


}
