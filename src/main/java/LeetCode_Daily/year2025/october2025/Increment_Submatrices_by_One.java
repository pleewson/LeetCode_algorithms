package LeetCode_Daily.year2025.october2025;

public class Increment_Submatrices_by_One {

    public static void main(String[] args) {
        int n = 3;
        int[][] queries = {
                {1, 1, 2, 2},
                {0, 0, 1, 1}
        };

        rangeAddQueries(n, queries);
    }

    public static int[][] rangeAddQueries(int n, int[][] queries) {
        int[][] array = new int[n][n];

        //initialize
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = 0;
            }
        }

        for (int i = 0; i < queries.length; i++) {
            int val1 = queries[i][0];
            int val2 = queries[i][1];
            int val3 = queries[i][2];
            int val4 = queries[i][3];

            for (int x = val1; x <= val3; x++) {
                for (int y = val2; y <= val4; y++) {
                    array[x][y]++;
                }
            }
        }

        return array;
    }
}
