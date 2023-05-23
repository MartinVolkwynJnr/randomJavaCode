package martin.volkwyn.codechallenges.rubikscube;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RubiksRotations {

    public static int[][][] getDeepCloneCubeState(CubeState cubeState) {
        // DEEP CLONE 3D Array
        int[][][] clonedCubeState = new int[6][3][3];
        for (int i = 0; i < cubeState.getCubeState3DArray().length; i++) {
            clonedCubeState[i] = Arrays.stream(cubeState.getCubeState3DArray()[i])               // deep copy
                    .map(arr -> Arrays.copyOf(arr, arr.length)).toArray(int[][]::new);
        }
        return clonedCubeState;
    }

    public CubeState rotate(CubeState cubeState, boolean clockwise, CubeSide cubeSideRotate, Map<CubeSide,CubeSide> rotationRule, RowColumnIndex[] numRows, RowColumnIndex[] numColumns) {
        int[][][] clonedCubeState = getDeepCloneCubeState(cubeState);
        
        rotationRule.forEach((key, value) -> {
            System.out.println("Rotation Rule Key : Value -> " + key + " " + value);

            if (cubeSideRotate != CubeSide.UPPER || cubeSideRotate != CubeSide.DOWN){
                if (numRows.length == 3 && numColumns.length == 1){
                    clonedCubeState[key.ordinal()][numRows[0].ordinal()][numColumns[0].ordinal()]
                            = cubeState.getCubeState3DArray()[value.ordinal()][numRows[0].ordinal()][numColumns[0].ordinal()];
                    clonedCubeState[key.ordinal()][numRows[1].ordinal()][numColumns[0].ordinal()]
                            = cubeState.getCubeState3DArray()[value.ordinal()][numRows[1].ordinal()][numColumns[0].ordinal()];
                    clonedCubeState[key.ordinal()][numRows[2].ordinal()][numColumns[0].ordinal()]
                            = cubeState.getCubeState3DArray()[value.ordinal()][numRows[2].ordinal()][numColumns[0].ordinal()];
                }
                else if (numRows.length == 1 && numColumns.length == 3){
                    clonedCubeState[key.ordinal()][numRows[0].ordinal()][numColumns[0].ordinal()]
                            = cubeState.getCubeState3DArray()[value.ordinal()][numRows[0].ordinal()][numColumns[0].ordinal()];
                    clonedCubeState[key.ordinal()][numRows[0].ordinal()][numColumns[1].ordinal()]
                            = cubeState.getCubeState3DArray()[value.ordinal()][numRows[0].ordinal()][numColumns[1].ordinal()];
                    clonedCubeState[key.ordinal()][numRows[0].ordinal()][numColumns[2].ordinal()]
                            = cubeState.getCubeState3DArray()[value.ordinal()][numRows[0].ordinal()][numColumns[2].ordinal()];
                }
            }

        });

        // 9 Squares rotating same side
        rotateSingleSide9Pieces(clonedCubeState, cubeState, cubeSideRotate, clockwise);

        CubeState newCubeStateObj = new CubeState();
        newCubeStateObj.setCubeState3DArray(clonedCubeState);

        return newCubeStateObj;
    }

    public int[][][] rotateSide(int[][][] clonedCubeState,CubeState cubeState,int[] rotatingSides, int[] movingPiece1,
                                int[] movingPiece2, int[] newPiece1, int[] newPiece2){
        clonedCubeState[rotatingSides[0]][movingPiece1[0]][movingPiece2[0]]
                = cubeState.getCubeState3DArray()[rotatingSides[1]][newPiece1[0]][newPiece2[0]];
        clonedCubeState[rotatingSides[0]][movingPiece1[1]][movingPiece2[1]]
                = cubeState.getCubeState3DArray()[rotatingSides[1]][newPiece1[1]][newPiece2[1]];
        clonedCubeState[rotatingSides[0]][movingPiece1[2]][movingPiece2[2]]
                = cubeState.getCubeState3DArray()[rotatingSides[1]][newPiece1[2]][newPiece2[2]];
        return clonedCubeState;
    }

    public int[][][] rotateSingleSide9Pieces(int[][][] clonedCubeState, CubeState cubeState, CubeSide cubeSideRotate, boolean clockwise) {
        // 9 Squares rotating same side
        if (!clockwise) {
            // counterclockwise
            clonedCubeState[cubeSideRotate.ordinal()][RowColumnIndex.FIRST.ordinal()][RowColumnIndex.FIRST.ordinal()] = cubeState.getCubeState3DArray()[cubeSideRotate.ordinal()][RowColumnIndex.FIRST.ordinal()][RowColumnIndex.LAST.ordinal()];
            clonedCubeState[cubeSideRotate.ordinal()][RowColumnIndex.FIRST.ordinal()][RowColumnIndex.MID.ordinal()] = cubeState.getCubeState3DArray()[cubeSideRotate.ordinal()][RowColumnIndex.MID.ordinal()][RowColumnIndex.LAST.ordinal()];
            clonedCubeState[cubeSideRotate.ordinal()][RowColumnIndex.FIRST.ordinal()][RowColumnIndex.LAST.ordinal()] = cubeState.getCubeState3DArray()[cubeSideRotate.ordinal()][RowColumnIndex.LAST.ordinal()][RowColumnIndex.LAST.ordinal()];
            clonedCubeState[cubeSideRotate.ordinal()][RowColumnIndex.MID.ordinal()][RowColumnIndex.FIRST.ordinal()] = cubeState.getCubeState3DArray()[cubeSideRotate.ordinal()][RowColumnIndex.FIRST.ordinal()][RowColumnIndex.MID.ordinal()];
            clonedCubeState[cubeSideRotate.ordinal()][RowColumnIndex.MID.ordinal()][RowColumnIndex.MID.ordinal()] = cubeState.getCubeState3DArray()[cubeSideRotate.ordinal()][RowColumnIndex.MID.ordinal()][RowColumnIndex.MID.ordinal()];
            clonedCubeState[cubeSideRotate.ordinal()][RowColumnIndex.MID.ordinal()][RowColumnIndex.LAST.ordinal()] = cubeState.getCubeState3DArray()[cubeSideRotate.ordinal()][RowColumnIndex.LAST.ordinal()][RowColumnIndex.MID.ordinal()];
            clonedCubeState[cubeSideRotate.ordinal()][RowColumnIndex.LAST.ordinal()][RowColumnIndex.FIRST.ordinal()] = cubeState.getCubeState3DArray()[cubeSideRotate.ordinal()][RowColumnIndex.FIRST.ordinal()][RowColumnIndex.FIRST.ordinal()];
            clonedCubeState[cubeSideRotate.ordinal()][RowColumnIndex.LAST.ordinal()][RowColumnIndex.MID.ordinal()] = cubeState.getCubeState3DArray()[cubeSideRotate.ordinal()][RowColumnIndex.MID.ordinal()][RowColumnIndex.FIRST.ordinal()];
            clonedCubeState[cubeSideRotate.ordinal()][RowColumnIndex.LAST.ordinal()][RowColumnIndex.LAST.ordinal()] = cubeState.getCubeState3DArray()[cubeSideRotate.ordinal()][RowColumnIndex.LAST.ordinal()][RowColumnIndex.FIRST.ordinal()];
        } else {
            // clockwise
            clonedCubeState[cubeSideRotate.ordinal()][RowColumnIndex.FIRST.ordinal()][RowColumnIndex.FIRST.ordinal()] = cubeState.getCubeState3DArray()[cubeSideRotate.ordinal()][RowColumnIndex.LAST.ordinal()][RowColumnIndex.FIRST.ordinal()];
            clonedCubeState[cubeSideRotate.ordinal()][RowColumnIndex.FIRST.ordinal()][RowColumnIndex.MID.ordinal()] = cubeState.getCubeState3DArray()[cubeSideRotate.ordinal()][RowColumnIndex.MID.ordinal()][RowColumnIndex.FIRST.ordinal()];
            clonedCubeState[cubeSideRotate.ordinal()][RowColumnIndex.FIRST.ordinal()][RowColumnIndex.LAST.ordinal()] = cubeState.getCubeState3DArray()[cubeSideRotate.ordinal()][RowColumnIndex.FIRST.ordinal()][RowColumnIndex.FIRST.ordinal()];
            clonedCubeState[cubeSideRotate.ordinal()][RowColumnIndex.MID.ordinal()][RowColumnIndex.FIRST.ordinal()] = cubeState.getCubeState3DArray()[cubeSideRotate.ordinal()][RowColumnIndex.LAST.ordinal()][RowColumnIndex.MID.ordinal()];
            clonedCubeState[cubeSideRotate.ordinal()][RowColumnIndex.MID.ordinal()][RowColumnIndex.MID.ordinal()] = cubeState.getCubeState3DArray()[cubeSideRotate.ordinal()][RowColumnIndex.MID.ordinal()][RowColumnIndex.MID.ordinal()];
            clonedCubeState[cubeSideRotate.ordinal()][RowColumnIndex.MID.ordinal()][RowColumnIndex.LAST.ordinal()] = cubeState.getCubeState3DArray()[cubeSideRotate.ordinal()][RowColumnIndex.FIRST.ordinal()][RowColumnIndex.MID.ordinal()];
            clonedCubeState[cubeSideRotate.ordinal()][RowColumnIndex.LAST.ordinal()][RowColumnIndex.FIRST.ordinal()] = cubeState.getCubeState3DArray()[cubeSideRotate.ordinal()][RowColumnIndex.LAST.ordinal()][RowColumnIndex.LAST.ordinal()];
            clonedCubeState[cubeSideRotate.ordinal()][RowColumnIndex.LAST.ordinal()][RowColumnIndex.MID.ordinal()] = cubeState.getCubeState3DArray()[cubeSideRotate.ordinal()][RowColumnIndex.MID.ordinal()][RowColumnIndex.LAST.ordinal()];
            clonedCubeState[cubeSideRotate.ordinal()][RowColumnIndex.LAST.ordinal()][RowColumnIndex.LAST.ordinal()] = cubeState.getCubeState3DArray()[cubeSideRotate.ordinal()][RowColumnIndex.FIRST.ordinal()][RowColumnIndex.LAST.ordinal()];
        }
        return clonedCubeState;
    }

}
