package org.example;

import java.util.ArrayList;
import java.util.List;

public class SpiralMain {

    private static final int SAME_DIRECTION = 0;
    private static final int BACKWARDS = -1;
    private static final int FORWARD = 1;
    public static void main(String[] args) {
        int[][] matrixBox = {
                { 1, 2, 3, 4 ,5},
                { 6, 7, 8, 9 ,10},
                { 11, 12, 13, 14 ,15},
                { 16, 17, 18, 19 ,20},
                { 21, 22, 23, 24 ,25}
        };

        System.out.println(spiralOrder(matrixBox));
    }

    public static List<Integer> spiralOrder(int[][] matrix)
    {
        List<Integer> resultArray = new ArrayList<>();

        if (matrix.length == 0)
            return resultArray;

        int numberOfRows = matrix.length;
        int rowWidth = matrix[0].length;

        boolean[][] includedValues = new boolean[numberOfRows][rowWidth];
        // 0 same row ; 1 forward; -1 revers
        int[] rowDirection = { SAME_DIRECTION, FORWARD, SAME_DIRECTION, BACKWARDS };  // rotation for the rows
        int[] columnDirection = { FORWARD, SAME_DIRECTION, BACKWARDS, SAME_DIRECTION }; // rotation for the columns
        int rowIndex = 0; // default index for rowDirection to start with
        int columnIndex = 0; // default index for columnDirection to start with
        // Thus rowIndex , columnIndex of directions = 0, 1
        int direction = 0; // same row/column = 0

        // loop from 0 to Rows * Columns - 1 (based off that we have squares / rectangles)
        for (int i = 0; i < numberOfRows * rowWidth; i++) {
            resultArray.add(matrix[rowIndex][columnIndex]); // adds the number of the value in the specific rowIndex,columnIndex location in the matrix
            includedValues[rowIndex][columnIndex] = true; // adds the bool check if we have this value yet for later
            int nextRowIndex = rowIndex + rowDirection[direction]; // basic math to  0 + 0 = 0  (next value is on the same row)
            int nextColumnIndex = columnIndex + columnDirection[direction]; // basic math to 0 + 1 = 1  (next value is on the next column)

            // if in same direction or in reverse direction we can just assign new index values else
            if (SAME_DIRECTION <= nextRowIndex && nextRowIndex < numberOfRows && // checks on same row or reverse row...
                    SAME_DIRECTION <= nextColumnIndex && nextColumnIndex < rowWidth && // checks on same column or reverse column...
                    !includedValues[nextRowIndex][nextColumnIndex] // checks to make sure the value hasn't been included yet...
            ){
                rowIndex = nextRowIndex;// simply assign new row index
                columnIndex = nextColumnIndex;// simply assin new column index
            }
            else {
                direction = (direction + 1) % 4; // we add 1 to direction but mod by 4 because we only have 4 direction indexes 0, 1, 2,3  (all results when x % 4)
                // critical that the rowindex and column index is readjusted because direction has changed...
                rowIndex += rowDirection[direction];
                columnIndex += columnDirection[direction];
            }
        }
        return resultArray;
    }
}
