package com.ayush;

import java.util.Arrays;

public class Sorted2DmatrixBS {
    public static void main(String[] args) {
        int[][] matrix = {{0, 1, 2, 3},
                {4, 5, 6, 7}};
        int[] result = Search(matrix, 6);

        System.out.println(Arrays.toString(result));

    }

    static int[] Search(int[][] matrix, int target) {

        int row = 0;
        int col = matrix[row].length -1;

        while (row < matrix.length && col >= 0) {

            if (matrix[row][col] == target) {
                return new int[]{row, col};
            }

            if (matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }

        return new int[]{-1, -1};
    }
}
