package martin.volkwyn.codechallenges.rubikscube;

import java.util.Arrays;

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
        if (clockwise) {
            clonedCubeState[cubeSideRotate.ordinal()][0][0] = cubeState.getCubeState3DArray()[cubeSideRotate.ordinal()][2][0];
            clonedCubeState[cubeSideRotate.ordinal()][0][1] = cubeState.getCubeState3DArray()[cubeSideRotate.ordinal()][1][0];
            clonedCubeState[cubeSideRotate.ordinal()][0][2] = cubeState.getCubeState3DArray()[cubeSideRotate.ordinal()][0][0];
            clonedCubeState[cubeSideRotate.ordinal()][1][0] = cubeState.getCubeState3DArray()[cubeSideRotate.ordinal()][2][1];
            clonedCubeState[cubeSideRotate.ordinal()][1][1] = cubeState.getCubeState3DArray()[cubeSideRotate.ordinal()][1][1];
            clonedCubeState[cubeSideRotate.ordinal()][1][2] = cubeState.getCubeState3DArray()[cubeSideRotate.ordinal()][0][1];
            clonedCubeState[cubeSideRotate.ordinal()][2][0] = cubeState.getCubeState3DArray()[cubeSideRotate.ordinal()][2][2];
            clonedCubeState[cubeSideRotate.ordinal()][2][1] = cubeState.getCubeState3DArray()[cubeSideRotate.ordinal()][1][2];
            clonedCubeState[cubeSideRotate.ordinal()][2][2] = cubeState.getCubeState3DArray()[cubeSideRotate.ordinal()][0][2];
        } else {
            clonedCubeState[cubeSideRotate.ordinal()][0][0] = cubeState.getCubeState3DArray()[cubeSideRotate.ordinal()][0][2];
            clonedCubeState[cubeSideRotate.ordinal()][0][1] = cubeState.getCubeState3DArray()[cubeSideRotate.ordinal()][1][2];
            clonedCubeState[cubeSideRotate.ordinal()][0][2] = cubeState.getCubeState3DArray()[cubeSideRotate.ordinal()][2][2];
            clonedCubeState[cubeSideRotate.ordinal()][1][0] = cubeState.getCubeState3DArray()[cubeSideRotate.ordinal()][0][1];
            clonedCubeState[cubeSideRotate.ordinal()][1][1] = cubeState.getCubeState3DArray()[cubeSideRotate.ordinal()][1][1];
            clonedCubeState[cubeSideRotate.ordinal()][1][2] = cubeState.getCubeState3DArray()[cubeSideRotate.ordinal()][2][1];
            clonedCubeState[cubeSideRotate.ordinal()][2][0] = cubeState.getCubeState3DArray()[cubeSideRotate.ordinal()][0][0];
            clonedCubeState[cubeSideRotate.ordinal()][2][1] = cubeState.getCubeState3DArray()[cubeSideRotate.ordinal()][1][0];
            clonedCubeState[cubeSideRotate.ordinal()][2][2] = cubeState.getCubeState3DArray()[cubeSideRotate.ordinal()][2][0];
        }
        return clonedCubeState;
    }

}
