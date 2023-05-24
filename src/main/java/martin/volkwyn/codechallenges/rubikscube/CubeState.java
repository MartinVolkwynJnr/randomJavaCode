package martin.volkwyn.codechallenges.rubikscube;

import java.util.Arrays;

public class CubeState {
    private int[][][] cubeState3DArray = new int[6][3][3];
    private int[][] front = new int[3][3];
    private int[][] back = new int[3][3];
    private int[][] left = new int[3][3];
    private int[][] right = new int[3][3];
    private int[][] upper = new int[3][3];
    private int[][] down = new int[3][3];

    @Override
    public String toString() {
        String[][][] colourCube = new String[6][3][3];
        String output = "";
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3 ; j++) {
                for (int k = 0; k < 3; k++) {
                    colourCube[i][j][k] = CubeColours.values()[cubeState3DArray[i][j][k]].name();
                }

            }
            output += "  ---------   \n";
            output += Arrays.deepToString(colourCube[i][0]) + "\n";
            output += Arrays.deepToString(colourCube[i][1]) + "\n";
            output += Arrays.deepToString(colourCube[i][2]) + "\n";
        }

        return "CubeState = \n" + output ;
    }

    public CubeState() {
        //default 
    }

    public void setDefaultSolvedCube(){
        this.setSideFullColour(this.front, CubeColours.YELLOW);
        this.setSideFullColour(this.back, CubeColours.WHITE);
        this.setSideFullColour(this.left, CubeColours.GREEN);
        this.setSideFullColour(this.right, CubeColours.BLUE);
        this.setSideFullColour(this.upper, CubeColours.RED);
        this.setSideFullColour(this.down, CubeColours.ORANGE);

        this.cubeState3DArray = new int[][][]{this.front, this.back, this.left, this.right, this.upper, this.down}; // THIS SHOULD BE SAME SEQUENCE AS CubeSide enum

    }

    private void setSideFullColour(int[][] inputSide, CubeColours colourToFillSide){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                inputSide[i][j] = colourToFillSide.ordinal();
            }
        }
    }

    public int[][][] getCubeState3DArray() {
        return cubeState3DArray;
    }

    public void setCubeState3DArray(int[][][] cubeState3DArray) {
        this.cubeState3DArray = cubeState3DArray;
        this.setFront(cubeState3DArray[CubeSide.FRONT.ordinal()]);
        this.setBack(cubeState3DArray[CubeSide.BACK.ordinal()]);
        this.setLeft(cubeState3DArray[CubeSide.LEFT.ordinal()]);
        this.setRight(cubeState3DArray[CubeSide.RIGHT.ordinal()]);
        this.setUpper(cubeState3DArray[CubeSide.UPPER.ordinal()]);
        this.setDown(cubeState3DArray[CubeSide.DOWN.ordinal()]);
    }

    public int[][] getFront() {
        return front;
    }

    public void setFront(int[][] front) {
        this.front = front;
    }

    public int[][] getBack() {
        return back;
    }

    public void setBack(int[][] back) {
        this.back = back;
    }

    public int[][] getLeft() {
        return left;
    }

    public void setLeft(int[][] left) {
        this.left = left;
    }

    public int[][] getRight() {
        return right;
    }

    public void setRight(int[][] right) {
        this.right = right;
    }

    public int[][] getUpper() {
        return upper;
    }

    public void setUpper(int[][] upper) {
        this.upper = upper;
    }

    public int[][] getDown() {
        return down;
    }

    public void setDown(int[][] down) {
        this.down = down;
    }
}
