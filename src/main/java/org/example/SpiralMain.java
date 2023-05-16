package org.example;

import java.util.ArrayList;
import java.util.List;

public class SpiralMain {
    public static void main(String[] args) {
        int[][] matrixBox = {
                { 1, 2, 3, 4 ,5},
                { 6, 7, 8, 9 ,10},
                { 11, 12, 13, 14 ,15},
                { 16, 17, 18, 19 ,20},
                { 21, 22, 23, 24 ,25}
        };

        System.out.println(SpiralOrder(matrixBox));
    }

    public static List<Integer> SpiralOrder(int[][] matrix)
    {
        List<Integer> resultArray = new ArrayList<>();

        if (matrix.length == 0)
            return resultArray;

        int numberOfRows = matrix.length;
        int rowWidth = matrix[0].length;

        boolean[][] includedValues = new boolean[numberOfRows][rowWidth];
        // 0 same row ; 1 forward; -1 revers
        int[] rowDirection = { 0, 1, 0, -1 };  // rotation for the rows
        int[] columnDirection = { 1, 0, -1, 0 }; // rotation for the columns
        int x = 0;
        int y = 0;
        int direction = 0;

        // loop from 0 to Rows * Columns - 1 (based off that we have squares / rectangles)
        for (int i = 0; i < numberOfRows * rowWidth; i++) {
            resultArray.add(matrix[x][y]); // adds the number of the value in the specific x,y location in the matrix
            includedValues[x][y] = true; // adds the bool check if we have this value yet for later
            int nextValueRow = x + rowDirection[direction];
            int nextValueColumn = y + columnDirection[direction];

            if (0 <= nextValueRow && nextValueRow < numberOfRows && 0 <= nextValueColumn && nextValueColumn < rowWidth
                    && !includedValues[nextValueRow][nextValueColumn]) {
                x = nextValueRow;
                y = nextValueColumn;
            }
            else {
                direction = (direction + 1) % 4;
                x += rowDirection[direction];
                y += columnDirection[direction];
            }
        }
        return resultArray;
    }
}
