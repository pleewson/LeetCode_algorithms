package LeetCode_Daily.year2023;

public class Special_Positions_in_a_Binary_Matrix {

    public static void main(String[] args) {

        int[][] testArray = {
                {0, 0, 1, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 1, 0, 0}};

        System.out.println(numSpecial(testArray));

    }


    public static int numSpecial(int[][] mat) {

        int num = 0;

        for (int i = 0; i < mat.length; i++) {
            int rowValue = 0;
            int columnValue = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    rowValue++;
                    //check
                    for (int l = 0; l < mat.length; l++) {
                        if (mat[l][j] == 1) {
                            columnValue++;
                        }
                    }
                }
            }
            if (columnValue == 1 && rowValue == 1) {
                num++;
            }
        }

        return num;
    }
}
