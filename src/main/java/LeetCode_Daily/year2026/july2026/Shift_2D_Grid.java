package LeetCode_Daily.year2026.july2026;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/shift-2d-grid/description/?envType=daily-question&envId=2026-07-20
public class Shift_2D_Grid {
    public static void main(String[] args) {
        int[][] arr = {
                {100},
        };
        System.out.println(shiftGrid(arr, 0));
    }

    private static List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int gridHorizontally = grid[0].length;
        int gridVertically = grid.length;

        List<List<Integer>> mirror = fillList(grid);
        List<List<Integer>> output = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            if (i != 0) {
                mirror = List.copyOf(output);
                output.clear();
            } else {
                output.clear();
            }
            List<Integer> line = new ArrayList<>();
            for (int gV = 0; gV < gridVertically; gV++) {
                if (gV == 0) {
                    line.add(mirror.get(gridVertically - 1).get(gridHorizontally - 1)); // right down corner
                } else {
                    line.add(mirror.get(gV - 1).get(gridHorizontally - 1)); //next row last one
                }
                for (int gH = 0; gH < gridHorizontally - 1; gH++) {
                    line.add(mirror.get(gV).get(gH));
                }
                output.add(line);
                line = new ArrayList<>();
            }
        }
        return output.size() == 0 ? mirror : output;
    }

    private static List<List<Integer>> fillList(int[][] grid) {
        List<List<Integer>> output = new ArrayList<>();

        for (int i = 0; i < grid.length; i++) {
            List<Integer> integerList = new ArrayList<>();
            for (int j = 0; j < grid[i].length; j++) {
                integerList.add(grid[i][j]);
            }
            output.add(integerList);
        }
        return output;
    }
}

//grid m x n

//shift operation
//grid[i][j] moves to grid[i][j+1]
//grid[i][n-1] moves to grid[i+1][0]
//grid[m-1][n-1] moves to grid[0][0]
