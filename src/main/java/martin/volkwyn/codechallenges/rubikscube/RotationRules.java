package martin.volkwyn.codechallenges.rubikscube;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RotationRules {
    RubiksRotations rubiksRotations = new RubiksRotations();

    public Map<CubeSide, CubeSide> rotateBack = new HashMap<>();
    public Map<CubeSide, CubeSide> rotateFront = new HashMap<>();
    public Map<CubeSide, CubeSide> rotateLeft = new HashMap<>();
    public Map<CubeSide, CubeSide> rotateRight = new HashMap<>();
    public Map<CubeSide, CubeSide> rotateUpper = new HashMap<>();
    public Map<CubeSide, CubeSide> rotateDown = new HashMap<>();


    public Map<CubeSide, CubeSide> rotateBackCounter = new HashMap<>();
    public Map<CubeSide, CubeSide> rotateFrontCounter = new HashMap<>();
    public Map<CubeSide, CubeSide> rotateLeftCounter = new HashMap<>();
    public Map<CubeSide, CubeSide> rotateRightCounter = new HashMap<>();
    public Map<CubeSide, CubeSide> rotateUpperCounter = new HashMap<>();
    public Map<CubeSide, CubeSide> rotateDownCounter = new HashMap<>();

    public List<Integer> rotateBackd = new ArrayList<>();

    public RotationRules() {

        rotateBackd.add(CubeSide.BACK.ordinal());
        rotateBackd.add(CubeSide.BACK.ordinal());
        rotateBackd.add(CubeSide.BACK.ordinal());
        rotateBackd.add(CubeSide.BACK.ordinal());
        rotateBackd.add(CubeSide.BACK.ordinal());
        rotateBackd.add(CubeSide.BACK.ordinal());


        this.rotateBack.put(CubeSide.UPPER,CubeSide.RIGHT);
        this.rotateBack.put(CubeSide.LEFT,CubeSide.UPPER);
        this.rotateBack.put(CubeSide.DOWN,CubeSide.LEFT);
        this.rotateBack.put(CubeSide.RIGHT,CubeSide.DOWN);

        this.rotateFront.put(CubeSide.UPPER,CubeSide.LEFT);
        this.rotateFront.put(CubeSide.LEFT,CubeSide.DOWN);
        this.rotateFront.put(CubeSide.DOWN,CubeSide.RIGHT);
        this.rotateFront.put(CubeSide.RIGHT,CubeSide.UPPER);

        this.rotateLeft.put(CubeSide.UPPER,CubeSide.BACK);
        this.rotateLeft.put(CubeSide.BACK,CubeSide.DOWN);
        this.rotateLeft.put(CubeSide.DOWN,CubeSide.FRONT);
        this.rotateLeft.put(CubeSide.FRONT,CubeSide.UPPER);

        this.rotateRight.put(CubeSide.UPPER,CubeSide.FRONT);
        this.rotateRight.put(CubeSide.FRONT,CubeSide.DOWN);
        this.rotateRight.put(CubeSide.DOWN,CubeSide.BACK);
        this.rotateRight.put(CubeSide.BACK,CubeSide.UPPER);

        this.rotateUpper.put(CubeSide.FRONT,CubeSide.RIGHT);
        this.rotateUpper.put(CubeSide.RIGHT,CubeSide.BACK);
        this.rotateUpper.put(CubeSide.BACK,CubeSide.LEFT);
        this.rotateUpper.put(CubeSide.LEFT,CubeSide.FRONT);

        this.rotateDown.put(CubeSide.FRONT,CubeSide.LEFT);
        this.rotateDown.put(CubeSide.LEFT,CubeSide.BACK);
        this.rotateDown.put(CubeSide.BACK,CubeSide.RIGHT);
        this.rotateDown.put(CubeSide.RIGHT,CubeSide.FRONT);

        //counterClock rules
        this.rotateBackCounter.put(CubeSide.UPPER,CubeSide.LEFT);
        this.rotateBackCounter.put(CubeSide.LEFT,CubeSide.DOWN);
        this.rotateBackCounter.put(CubeSide.DOWN,CubeSide.RIGHT);
        this.rotateBackCounter.put(CubeSide.RIGHT,CubeSide.UPPER);

        this.rotateFrontCounter.put(CubeSide.UPPER,CubeSide.RIGHT);
        this.rotateFrontCounter.put(CubeSide.RIGHT,CubeSide.DOWN);
        this.rotateFrontCounter.put(CubeSide.DOWN,CubeSide.LEFT);
        this.rotateFrontCounter.put(CubeSide.LEFT,CubeSide.UPPER);

        this.rotateLeftCounter.put(CubeSide.UPPER,CubeSide.FRONT);
        this.rotateLeftCounter.put(CubeSide.FRONT,CubeSide.DOWN);
        this.rotateLeftCounter.put(CubeSide.DOWN,CubeSide.BACK);
        this.rotateLeftCounter.put(CubeSide.BACK,CubeSide.UPPER);

        this.rotateRightCounter.put(CubeSide.UPPER,CubeSide.BACK);
        this.rotateRightCounter.put(CubeSide.BACK,CubeSide.DOWN);
        this.rotateRightCounter.put(CubeSide.DOWN,CubeSide.FRONT);
        this.rotateRightCounter.put(CubeSide.FRONT,CubeSide.UPPER);

        this.rotateUpperCounter.put(CubeSide.FRONT,CubeSide.LEFT);
        this.rotateUpperCounter.put(CubeSide.LEFT,CubeSide.BACK);
        this.rotateUpperCounter.put(CubeSide.BACK,CubeSide.RIGHT);
        this.rotateUpperCounter.put(CubeSide.RIGHT,CubeSide.FRONT);

        this.rotateDownCounter.put(CubeSide.FRONT,CubeSide.RIGHT);
        this.rotateDownCounter.put(CubeSide.RIGHT,CubeSide.BACK);
        this.rotateDownCounter.put(CubeSide.BACK,CubeSide.LEFT);
        this.rotateDownCounter.put(CubeSide.LEFT,CubeSide.FRONT);
    }

    public CubeState rotateSideProvidedLetter(Character sideRotating, CubeState cubeState) {
        int[] threeRowsOrColumns = new int[]{RowColumnIndex.FIRST.ordinal(), RowColumnIndex.MID.ordinal(), RowColumnIndex.LAST.ordinal()};
        int[] threeRowsOrColumnsReverse = new int[]{RowColumnIndex.LAST.ordinal(), RowColumnIndex.MID.ordinal(), RowColumnIndex.FIRST.ordinal()};
        int[] firstRowOrColumn = new int[]{RowColumnIndex.FIRST.ordinal(), RowColumnIndex.FIRST.ordinal(), RowColumnIndex.FIRST.ordinal()};
        int[] lastRowOrColumn = new int[]{RowColumnIndex.LAST.ordinal(), RowColumnIndex.LAST.ordinal(), RowColumnIndex.LAST.ordinal()};

        int[][][] clonedCubeState = RubiksRotations.getDeepCloneCubeState(cubeState);

        //U F D R L B  - CLOCKWISE
        //u f d r l b  - COUNTERCLOCKWISE

        switch (sideRotating) {
            // Clockwise
            case 'U': {
                //call 4 times...for each side accordingly
                clonedCubeState = rubiksRotations.rotateSide(clonedCubeState, cubeState, new int[]{CubeSide.FRONT.ordinal(), CubeSide.RIGHT.ordinal()},
                        firstRowOrColumn, // move RowIndex
                        threeRowsOrColumns, // move ColumnIndex
                        threeRowsOrColumnsReverse, // new RowIndex
                        firstRowOrColumn // new RowIndex
                );

                clonedCubeState = rubiksRotations.rotateSide(
                        clonedCubeState,
                        cubeState,
                        new int[]{CubeSide.RIGHT.ordinal(), CubeSide.BACK.ordinal()},
                        threeRowsOrColumns, // move RowIndex
                        firstRowOrColumn, // move ColumnIndex
                        firstRowOrColumn, // new RowIndex
                        threeRowsOrColumnsReverse // new RowIndex
                );

                clonedCubeState = rubiksRotations.rotateSide(
                        clonedCubeState,
                        cubeState,
                        new int[]{CubeSide.BACK.ordinal(), CubeSide.LEFT.ordinal()},
                        firstRowOrColumn, // move RowIndex
                        threeRowsOrColumns, // move ColumnIndex
                        threeRowsOrColumns, // new RowIndex
                        lastRowOrColumn // new RowIndex
                );

                clonedCubeState = rubiksRotations.rotateSide(
                        clonedCubeState,
                        cubeState,
                        new int[]{CubeSide.LEFT.ordinal(), CubeSide.FRONT.ordinal()},
                        threeRowsOrColumns, // move RowIndex
                        lastRowOrColumn, // move ColumnIndex
                        firstRowOrColumn, // new RowIndex
                        threeRowsOrColumns // new RowIndex
                );

                clonedCubeState = rubiksRotations.rotateSingleSide9Pieces(clonedCubeState, cubeState, CubeSide.UPPER, true);
                break;
            }
//            case 'F': {
//                this.cubeState = this.rubiksRotations.rotate(cubeState, true, CubeSide.FRONT, rotationRules.rotateFront, lastRowOrColumn, threeRowsOrColumns);
//                break;
//            }
            case 'D': {
                //call 4 times...for each side accordingly
                clonedCubeState = rubiksRotations.rotateSide(
                        clonedCubeState,
                        cubeState,
                        new int[]{CubeSide.FRONT.ordinal(), CubeSide.LEFT.ordinal()},
                        lastRowOrColumn, // move RowIndex
                        threeRowsOrColumns, // move ColumnIndex
                        threeRowsOrColumns, // new RowIndex
                        firstRowOrColumn // new RowIndex
                );

                clonedCubeState = rubiksRotations.rotateSide(
                        clonedCubeState,
                        cubeState,
                        new int[]{CubeSide.LEFT.ordinal(), CubeSide.BACK.ordinal()},
                        threeRowsOrColumns, // move RowIndex
                        firstRowOrColumn, // move ColumnIndex
                        lastRowOrColumn, // new RowIndex
                        threeRowsOrColumns // new RowIndex
                );

                clonedCubeState = rubiksRotations.rotateSide(
                        clonedCubeState,
                        cubeState,
                        new int[]{CubeSide.BACK.ordinal(), CubeSide.RIGHT.ordinal()},
                        lastRowOrColumn, // move RowIndex
                        threeRowsOrColumns, // move ColumnIndex
                        threeRowsOrColumnsReverse, // new RowIndex
                        lastRowOrColumn // new RowIndex
                );

                clonedCubeState = rubiksRotations.rotateSide(
                        clonedCubeState,
                        cubeState,
                        new int[]{CubeSide.RIGHT.ordinal(), CubeSide.FRONT.ordinal()},
                        threeRowsOrColumns, // move RowIndex
                        lastRowOrColumn, // move ColumnIndex
                        lastRowOrColumn, // new RowIndex
                        threeRowsOrColumnsReverse // new RowIndex
                );

                clonedCubeState = rubiksRotations.rotateSingleSide9Pieces(clonedCubeState, cubeState, CubeSide.DOWN, true);
                break;
            }
//            case 'R': {
//                this.cubeState = this.rubiksRotations.rotate(cubeState, true, CubeSide.RIGHT, rotationRules.rotateRight, threeRowsOrColumns, lastRowOrColumn);
//                break;
//            }
//            case 'L': {
//                this.cubeState = this.rubiksRotations.rotate(cubeState, true, CubeSide.LEFT, rotationRules.rotateLeft, threeRowsOrColumns, firstRowOrColumn);
//                break;
//            }
//            case 'B': {
//
//                this.cubeState = this.rubiksRotations.rotate(cubeState, true, CubeSide.BACK, rotationRules.rotateBack, firstRowOrColumn, threeRowsOrColumns);
//                break;
//            }
//
//            // counterclockwise
            case 'u': {
                //call 4 times...for each side accordingly
                clonedCubeState = rubiksRotations.rotateSide(
                        clonedCubeState,
                        cubeState,
                        new int[]{CubeSide.FRONT.ordinal(), CubeSide.LEFT.ordinal()},
                        firstRowOrColumn, // move RowIndex
                        threeRowsOrColumns, // move ColumnIndex
                        threeRowsOrColumns, // new RowIndex
                        lastRowOrColumn // new RowIndex
                );

                clonedCubeState = rubiksRotations.rotateSide(
                        clonedCubeState,
                        cubeState,
                        new int[]{CubeSide.LEFT.ordinal(), CubeSide.BACK.ordinal()},
                        threeRowsOrColumns, // move RowIndex
                        lastRowOrColumn, // move ColumnIndex
                        firstRowOrColumn, // new RowIndex
                        threeRowsOrColumns // new RowIndex
                );

                clonedCubeState = rubiksRotations.rotateSide(
                        clonedCubeState,
                        cubeState,
                        new int[]{CubeSide.BACK.ordinal(), CubeSide.RIGHT.ordinal()},
                        firstRowOrColumn, // move RowIndex
                        threeRowsOrColumns, // move ColumnIndex
                        threeRowsOrColumnsReverse, // new RowIndex
                        firstRowOrColumn // new RowIndex
                );

                clonedCubeState = rubiksRotations.rotateSide(
                        clonedCubeState,
                        cubeState,
                        new int[]{CubeSide.RIGHT.ordinal(), CubeSide.FRONT.ordinal()},
                        threeRowsOrColumns, // move RowIndex
                        firstRowOrColumn, // move ColumnIndex
                        firstRowOrColumn, // new RowIndex
                        threeRowsOrColumnsReverse // new RowIndex
                );

                clonedCubeState = rubiksRotations.rotateSingleSide9Pieces(clonedCubeState, cubeState, CubeSide.UPPER, false);
                break;
            }
//            case 'f': {
//                this.cubeState = this.rubiksRotations.rotate(cubeState, false, CubeSide.FRONT, rotationRules.rotateFrontCounter, lastRowOrColumn, threeRowsOrColumns);
//                break;
//            }
            case 'd': {
                //call 4 times...for each side accordingly
                clonedCubeState = rubiksRotations.rotateSide(
                        clonedCubeState,
                        cubeState,
                        new int[]{CubeSide.FRONT.ordinal(), CubeSide.RIGHT.ordinal()},
                        lastRowOrColumn, // move RowIndex
                        threeRowsOrColumns, // move ColumnIndex
                        threeRowsOrColumnsReverse, // new RowIndex
                        lastRowOrColumn // new RowIndex
                );

                clonedCubeState = rubiksRotations.rotateSide(
                        clonedCubeState,
                        cubeState,
                        new int[]{CubeSide.RIGHT.ordinal(), CubeSide.BACK.ordinal()},
                        threeRowsOrColumns, // move RowIndex
                        lastRowOrColumn, // move ColumnIndex
                        lastRowOrColumn, // new RowIndex
                        threeRowsOrColumnsReverse // new RowIndex
                );

                clonedCubeState = rubiksRotations.rotateSide(
                        clonedCubeState,
                        cubeState,
                        new int[]{CubeSide.BACK.ordinal(), CubeSide.LEFT.ordinal()},
                        lastRowOrColumn, // move RowIndex
                        threeRowsOrColumns, // move ColumnIndex
                        threeRowsOrColumns, // new RowIndex
                        firstRowOrColumn // new RowIndex
                );

                clonedCubeState = rubiksRotations.rotateSide(
                        clonedCubeState,
                        cubeState,
                        new int[]{CubeSide.LEFT.ordinal(), CubeSide.FRONT.ordinal()},
                        threeRowsOrColumns, // move RowIndex
                        firstRowOrColumn, // move ColumnIndex
                        lastRowOrColumn, // new RowIndex
                        threeRowsOrColumns // new RowIndex
                );

                clonedCubeState = rubiksRotations.rotateSingleSide9Pieces(clonedCubeState, cubeState, CubeSide.UPPER, true);
                break;
            }
//            case 'r': {
//                this.cubeState = this.rubiksRotations.rotate(cubeState, false, CubeSide.RIGHT, rotationRules.rotateRightCounter, threeRowsOrColumns, lastRowOrColumn);
//                break;
//            }
//            case 'l': {
//                this.cubeState = this.rubiksRotations.rotate(cubeState, false, CubeSide.LEFT, rotationRules.rotateLeftCounter, threeRowsOrColumns, firstRowOrColumn);
//                break;
//            }
//            case 'b': {
//                this.cubeState = this.rubiksRotations.rotate(cubeState, false, CubeSide.BACK, rotationRules.rotateBackCounter, firstRowOrColumn, threeRowsOrColumns);
//                break;
//            }
        }
        CubeState newCubeState = new CubeState();
        newCubeState.setCubeState3DArray(clonedCubeState);
        return newCubeState;
    }

}
