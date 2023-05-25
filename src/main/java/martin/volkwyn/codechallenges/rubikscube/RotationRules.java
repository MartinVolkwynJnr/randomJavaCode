package martin.volkwyn.codechallenges.rubikscube;

public class RotationRules {
    RubiksRotations rubiksRotations = new RubiksRotations();

    public RotationRules() {

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

                clonedCubeState = rubiksRotations.rotateSide(clonedCubeState, cubeState, new int[]{CubeSide.RIGHT.ordinal(), CubeSide.BACK.ordinal()},
                        threeRowsOrColumns, // move RowIndex
                        firstRowOrColumn, // move ColumnIndex
                        lastRowOrColumn, // new RowIndex
                        threeRowsOrColumns // new RowIndex
                );

                clonedCubeState = rubiksRotations.rotateSide(clonedCubeState, cubeState, new int[]{CubeSide.BACK.ordinal(), CubeSide.LEFT.ordinal()},
                        lastRowOrColumn, // move RowIndex
                        threeRowsOrColumns, // move ColumnIndex
                        threeRowsOrColumnsReverse, // new RowIndex
                        lastRowOrColumn // new RowIndex
                );

                clonedCubeState = rubiksRotations.rotateSide(clonedCubeState, cubeState, new int[]{CubeSide.LEFT.ordinal(), CubeSide.FRONT.ordinal()},
                        threeRowsOrColumns, // move RowIndex
                        lastRowOrColumn, // move ColumnIndex
                        firstRowOrColumn, // new RowIndex
                        threeRowsOrColumns // new RowIndex
                );

                clonedCubeState = rubiksRotations.rotateSingleSide9Pieces(clonedCubeState, cubeState, CubeSide.UPPER, true);
                break;
            }
            case 'F': {
                //call 4 times...for each side accordingly
                clonedCubeState = rubiksRotations.rotateSide(clonedCubeState, cubeState, new int[]{CubeSide.UPPER.ordinal(), CubeSide.LEFT.ordinal()},
                        lastRowOrColumn, // move RowIndex
                        threeRowsOrColumns, // move ColumnIndex
                        lastRowOrColumn, // new RowIndex
                        threeRowsOrColumns // new RowIndex
                );

                clonedCubeState = rubiksRotations.rotateSide(clonedCubeState, cubeState, new int[]{CubeSide.LEFT.ordinal(), CubeSide.DOWN.ordinal()},
                        lastRowOrColumn, // move RowIndex
                        threeRowsOrColumns, // move ColumnIndex
                        lastRowOrColumn, // new RowIndex
                        threeRowsOrColumns // new RowIndex
                );

                clonedCubeState = rubiksRotations.rotateSide(clonedCubeState, cubeState, new int[]{CubeSide.DOWN.ordinal(), CubeSide.RIGHT.ordinal()},
                        lastRowOrColumn, // move RowIndex
                        threeRowsOrColumns, // move ColumnIndex
                        lastRowOrColumn, // new RowIndex
                        threeRowsOrColumns // new RowIndex
                );

                clonedCubeState = rubiksRotations.rotateSide(clonedCubeState, cubeState, new int[]{CubeSide.RIGHT.ordinal(), CubeSide.UPPER.ordinal()},
                        lastRowOrColumn, // move RowIndex
                        threeRowsOrColumns, // move ColumnIndex
                        lastRowOrColumn, // new RowIndex
                        threeRowsOrColumns // new RowIndex
                );

                clonedCubeState = rubiksRotations.rotateSingleSide9Pieces(clonedCubeState, cubeState, CubeSide.FRONT, true);
                break;
            }
            case 'D': {
                //call 4 times...for each side accordingly
                clonedCubeState = rubiksRotations.rotateSide(clonedCubeState, cubeState, new int[]{CubeSide.FRONT.ordinal(), CubeSide.LEFT.ordinal()},
                        lastRowOrColumn, // move RowIndex
                        threeRowsOrColumns, // move ColumnIndex
                        threeRowsOrColumns, // new RowIndex
                        firstRowOrColumn // new RowIndex
                );

                clonedCubeState = rubiksRotations.rotateSide(clonedCubeState, cubeState, new int[]{CubeSide.LEFT.ordinal(), CubeSide.BACK.ordinal()},
                        threeRowsOrColumns, // move RowIndex
                        firstRowOrColumn, // move ColumnIndex
                        firstRowOrColumn, // new RowIndex
                        threeRowsOrColumnsReverse // new RowIndex
                );

                clonedCubeState = rubiksRotations.rotateSide(clonedCubeState, cubeState, new int[]{CubeSide.BACK.ordinal(), CubeSide.RIGHT.ordinal()},
                        firstRowOrColumn, // move RowIndex
                        threeRowsOrColumns, // move ColumnIndex
                        threeRowsOrColumnsReverse, // new RowIndex
                        lastRowOrColumn // new RowIndex
                );

                clonedCubeState = rubiksRotations.rotateSide(clonedCubeState, cubeState, new int[]{CubeSide.RIGHT.ordinal(), CubeSide.FRONT.ordinal()},
                        threeRowsOrColumns, // move RowIndex
                        lastRowOrColumn, // move ColumnIndex
                        lastRowOrColumn, // new RowIndex
                        threeRowsOrColumnsReverse // new RowIndex
                );

                clonedCubeState = rubiksRotations.rotateSingleSide9Pieces(clonedCubeState, cubeState, CubeSide.DOWN, true);
                break;
            }
            case 'R': {
                //call 4 times...for each side accordingly
                clonedCubeState = rubiksRotations.rotateSide(clonedCubeState,
                        cubeState, new int[]{CubeSide.UPPER.ordinal(), CubeSide.FRONT.ordinal()},
                        threeRowsOrColumns, // move RowIndex
                        lastRowOrColumn, // move ColumnIndex
                        threeRowsOrColumns, // new RowIndex
                        lastRowOrColumn // new RowIndex
                );

                clonedCubeState = rubiksRotations.rotateSide(clonedCubeState,
                        cubeState, new int[]{CubeSide.FRONT.ordinal(), CubeSide.DOWN.ordinal()},
                        threeRowsOrColumns, // move RowIndex
                        lastRowOrColumn, // move ColumnIndex
                        threeRowsOrColumnsReverse, // move RowIndex
                        firstRowOrColumn // move ColumnIndex
                );

                clonedCubeState = rubiksRotations.rotateSide(clonedCubeState,
                        cubeState, new int[]{CubeSide.DOWN.ordinal(), CubeSide.BACK.ordinal()},
                        threeRowsOrColumns, // move RowIndex
                        firstRowOrColumn, // move ColumnIndex
                        threeRowsOrColumnsReverse, // new RowIndex
                        lastRowOrColumn // new RowIndex
                );

                clonedCubeState = rubiksRotations.rotateSide(clonedCubeState,
                        cubeState, new int[]{CubeSide.BACK.ordinal(), CubeSide.UPPER.ordinal()},
                        threeRowsOrColumns, // move RowIndex
                        lastRowOrColumn, // move ColumnIndex
                        threeRowsOrColumns, // new RowIndex
                        lastRowOrColumn // new RowIndex
                );

                clonedCubeState = rubiksRotations.rotateSingleSide9Pieces(clonedCubeState, cubeState, CubeSide.RIGHT, true);
                break;
            }
            case 'L': {
                //call 4 times...for each side accordingly
                clonedCubeState = rubiksRotations.rotateSide(clonedCubeState, cubeState, new int[]{CubeSide.UPPER.ordinal(), CubeSide.BACK.ordinal()},
                        threeRowsOrColumns, // move RowIndex
                        firstRowOrColumn, // move ColumnIndex
                        threeRowsOrColumns, // new RowIndex
                        firstRowOrColumn // new RowIndex
                );

                clonedCubeState = rubiksRotations.rotateSide(clonedCubeState, cubeState, new int[]{CubeSide.BACK.ordinal(), CubeSide.DOWN.ordinal()},
                        threeRowsOrColumns, // move RowIndex
                        firstRowOrColumn, // move ColumnIndex
                        threeRowsOrColumns, // new RowIndex
                        lastRowOrColumn // new RowIndex
                );

                clonedCubeState = rubiksRotations.rotateSide(clonedCubeState, cubeState, new int[]{CubeSide.DOWN.ordinal(), CubeSide.FRONT.ordinal()},
                        threeRowsOrColumns, // move RowIndex
                        lastRowOrColumn, // move ColumnIndex
                        threeRowsOrColumns, // new RowIndex
                        firstRowOrColumn // new RowIndex
                );

                clonedCubeState = rubiksRotations.rotateSide(clonedCubeState, cubeState, new int[]{CubeSide.FRONT.ordinal(), CubeSide.UPPER.ordinal()},
                        threeRowsOrColumns, // move RowIndex
                        firstRowOrColumn, // move ColumnIndex
                        threeRowsOrColumns, // new RowIndex
                        firstRowOrColumn // new RowIndex
                );

                clonedCubeState = rubiksRotations.rotateSingleSide9Pieces(clonedCubeState, cubeState, CubeSide.LEFT, true);
                break;
            }
            case 'B': {
                //call 4 times...for each side accordingly
                clonedCubeState = rubiksRotations.rotateSide(clonedCubeState, cubeState, new int[]{CubeSide.UPPER.ordinal(), CubeSide.RIGHT.ordinal()},
                        firstRowOrColumn, // move RowIndex
                        threeRowsOrColumns, // move ColumnIndex
                        firstRowOrColumn, // new RowIndex
                        threeRowsOrColumns // new RowIndex
                );

                clonedCubeState = rubiksRotations.rotateSide(clonedCubeState, cubeState, new int[]{CubeSide.RIGHT.ordinal(), CubeSide.DOWN.ordinal()},
                        firstRowOrColumn, // move RowIndex
                        threeRowsOrColumns, // move ColumnIndex
                        firstRowOrColumn, // new RowIndex
                        threeRowsOrColumns // new RowIndex
                );

                clonedCubeState = rubiksRotations.rotateSide(clonedCubeState, cubeState, new int[]{CubeSide.DOWN.ordinal(), CubeSide.LEFT.ordinal()},
                        firstRowOrColumn, // move RowIndex
                        threeRowsOrColumns, // move ColumnIndex
                        firstRowOrColumn, // new RowIndex
                        threeRowsOrColumns // new RowIndex
                );

                clonedCubeState = rubiksRotations.rotateSide(clonedCubeState, cubeState, new int[]{CubeSide.LEFT.ordinal(), CubeSide.UPPER.ordinal()},
                        firstRowOrColumn, // move RowIndex
                        threeRowsOrColumns, // move ColumnIndex
                        firstRowOrColumn, // new RowIndex
                        threeRowsOrColumns // new RowIndex
                );

                clonedCubeState = rubiksRotations.rotateSingleSide9Pieces(clonedCubeState, cubeState, CubeSide.BACK, true);
                break;
            }
            // counterclockwise
            case 'u': {
                //call 4 times...for each side accordingly
                clonedCubeState = rubiksRotations.rotateSide(clonedCubeState, cubeState, new int[]{CubeSide.FRONT.ordinal(), CubeSide.LEFT.ordinal()},
                        firstRowOrColumn, // move RowIndex
                        threeRowsOrColumns, // move ColumnIndex
                        threeRowsOrColumns, // new RowIndex
                        lastRowOrColumn // new RowIndex
                );

                clonedCubeState = rubiksRotations.rotateSide(clonedCubeState, cubeState, new int[]{CubeSide.LEFT.ordinal(), CubeSide.BACK.ordinal()},
                        threeRowsOrColumns, // move RowIndex
                        lastRowOrColumn, // move ColumnIndex
                        lastRowOrColumn, // new RowIndex
                        threeRowsOrColumnsReverse // new RowIndex
                );

                clonedCubeState = rubiksRotations.rotateSide(clonedCubeState, cubeState, new int[]{CubeSide.BACK.ordinal(), CubeSide.RIGHT.ordinal()},
                        lastRowOrColumn, // move RowIndex
                        threeRowsOrColumns, // move ColumnIndex
                        threeRowsOrColumnsReverse, // new RowIndex
                        firstRowOrColumn // new RowIndex
                );

                clonedCubeState = rubiksRotations.rotateSide(clonedCubeState, cubeState, new int[]{CubeSide.RIGHT.ordinal(), CubeSide.FRONT.ordinal()},
                        threeRowsOrColumns, // move RowIndex
                        firstRowOrColumn, // move ColumnIndex
                        firstRowOrColumn, // new RowIndex
                        threeRowsOrColumnsReverse // new RowIndex
                );

                clonedCubeState = rubiksRotations.rotateSingleSide9Pieces(clonedCubeState, cubeState, CubeSide.UPPER, false);
                break;
            }
            case 'f': {
                //call 4 times...for each side accordingly
                clonedCubeState = rubiksRotations.rotateSide(clonedCubeState, cubeState, new int[]{CubeSide.UPPER.ordinal(), CubeSide.RIGHT.ordinal()},
                        lastRowOrColumn, // move RowIndex
                        threeRowsOrColumns, // move ColumnIndex
                        lastRowOrColumn, // new RowIndex
                        threeRowsOrColumns // new RowIndex
                );

                clonedCubeState = rubiksRotations.rotateSide(clonedCubeState, cubeState, new int[]{CubeSide.RIGHT.ordinal(), CubeSide.DOWN.ordinal()},
                        lastRowOrColumn, // move RowIndex
                        threeRowsOrColumns, // move ColumnIndex
                        lastRowOrColumn, // new RowIndex
                        threeRowsOrColumns // new RowIndex
                );

                clonedCubeState = rubiksRotations.rotateSide(clonedCubeState, cubeState, new int[]{CubeSide.DOWN.ordinal(), CubeSide.LEFT.ordinal()},
                        lastRowOrColumn, // move RowIndex
                        threeRowsOrColumns, // move ColumnIndex
                        lastRowOrColumn, // new RowIndex
                        threeRowsOrColumns // new RowIndex
                );

                clonedCubeState = rubiksRotations.rotateSide(clonedCubeState, cubeState, new int[]{CubeSide.LEFT.ordinal(), CubeSide.UPPER.ordinal()},
                        lastRowOrColumn, // move RowIndex
                        threeRowsOrColumns, // move ColumnIndex
                        lastRowOrColumn, // new RowIndex
                        threeRowsOrColumns // new RowIndex
                );

                clonedCubeState = rubiksRotations.rotateSingleSide9Pieces(clonedCubeState, cubeState, CubeSide.FRONT, false);
                break;
            }
            case 'd': {
                //call 4 times...for each side accordingly
                clonedCubeState = rubiksRotations.rotateSide(clonedCubeState, cubeState, new int[]{CubeSide.FRONT.ordinal(), CubeSide.RIGHT.ordinal()},
                        lastRowOrColumn, // move RowIndex
                        threeRowsOrColumns, // move ColumnIndex
                        threeRowsOrColumnsReverse, // new RowIndex
                        lastRowOrColumn // new RowIndex
                );

                clonedCubeState = rubiksRotations.rotateSide(clonedCubeState, cubeState, new int[]{CubeSide.RIGHT.ordinal(), CubeSide.BACK.ordinal()},
                        threeRowsOrColumns, // move RowIndex
                        lastRowOrColumn, // move ColumnIndex
                        firstRowOrColumn, // new RowIndex
                        threeRowsOrColumns // new RowIndex
                );

                clonedCubeState = rubiksRotations.rotateSide(clonedCubeState, cubeState, new int[]{CubeSide.BACK.ordinal(), CubeSide.LEFT.ordinal()},
                        firstRowOrColumn, // move RowIndex
                        threeRowsOrColumns, // move ColumnIndex
                        threeRowsOrColumnsReverse, // new RowIndex
                        firstRowOrColumn // new RowIndex
                );

                clonedCubeState = rubiksRotations.rotateSide(clonedCubeState, cubeState, new int[]{CubeSide.LEFT.ordinal(), CubeSide.FRONT.ordinal()},
                        threeRowsOrColumns, // move RowIndex
                        firstRowOrColumn, // move ColumnIndex
                        lastRowOrColumn, // new RowIndex
                        threeRowsOrColumns // new RowIndex
                );

                clonedCubeState = rubiksRotations.rotateSingleSide9Pieces(clonedCubeState, cubeState, CubeSide.DOWN, false);
                break;
            }
            case 'r': {
                //call 4 times...for each side accordingly
                clonedCubeState = rubiksRotations.rotateSide(clonedCubeState, cubeState, new int[]{CubeSide.UPPER.ordinal(), CubeSide.BACK.ordinal()},
                        threeRowsOrColumns, // move RowIndex
                        lastRowOrColumn, // move ColumnIndex
                        threeRowsOrColumns, // new RowIndex
                        lastRowOrColumn // new RowIndex
                );

                clonedCubeState = rubiksRotations.rotateSide(clonedCubeState, cubeState, new int[]{CubeSide.BACK.ordinal(), CubeSide.DOWN.ordinal()},
                        threeRowsOrColumns, // move RowIndex
                        lastRowOrColumn, // move ColumnIndex
                        threeRowsOrColumns, // new RowIndex
                        firstRowOrColumn // new RowIndex
                );

                clonedCubeState = rubiksRotations.rotateSide(clonedCubeState, cubeState, new int[]{CubeSide.DOWN.ordinal(), CubeSide.FRONT.ordinal()},
                        threeRowsOrColumns, // move RowIndex
                        firstRowOrColumn, // move ColumnIndex
                        threeRowsOrColumns, // new RowIndex
                        lastRowOrColumn // new RowIndex
                );

                clonedCubeState = rubiksRotations.rotateSide(clonedCubeState, cubeState, new int[]{CubeSide.FRONT.ordinal(), CubeSide.UPPER.ordinal()},
                        threeRowsOrColumns, // move RowIndex
                        lastRowOrColumn, // move ColumnIndex
                        threeRowsOrColumns, // new RowIndex
                        lastRowOrColumn // new RowIndex
                );

                clonedCubeState = rubiksRotations.rotateSingleSide9Pieces(clonedCubeState, cubeState, CubeSide.RIGHT, false);
                break;
            }
            case 'l': {
                //call 4 times...for each side accordingly
                clonedCubeState = rubiksRotations.rotateSide(clonedCubeState,
                        cubeState, new int[]{CubeSide.UPPER.ordinal(), CubeSide.FRONT.ordinal()},
                        threeRowsOrColumns, // move RowIndex
                        firstRowOrColumn, // move ColumnIndex
                        threeRowsOrColumns, // new RowIndex
                        firstRowOrColumn // new RowIndex
                );

                clonedCubeState = rubiksRotations.rotateSide(clonedCubeState,
                        cubeState, new int[]{CubeSide.FRONT.ordinal(), CubeSide.DOWN.ordinal()},
                        threeRowsOrColumns, // move RowIndex
                        firstRowOrColumn, // move ColumnIndex
                        threeRowsOrColumnsReverse, // move RowIndex
                        lastRowOrColumn // move ColumnIndex
                );

                clonedCubeState = rubiksRotations.rotateSide(clonedCubeState,
                        cubeState, new int[]{CubeSide.DOWN.ordinal(), CubeSide.BACK.ordinal()},
                        threeRowsOrColumns, // move RowIndex
                        lastRowOrColumn, // move ColumnIndex
                        threeRowsOrColumnsReverse, // new RowIndex
                        firstRowOrColumn // new ColumnIndex
                );

                clonedCubeState = rubiksRotations.rotateSide(clonedCubeState,
                        cubeState, new int[]{CubeSide.BACK.ordinal(), CubeSide.UPPER.ordinal()},
                        threeRowsOrColumns, // move RowIndex
                        firstRowOrColumn, // move ColumnIndex
                        threeRowsOrColumns, // new RowIndex
                        firstRowOrColumn // new RowIndex
                );

                clonedCubeState = rubiksRotations.rotateSingleSide9Pieces(clonedCubeState, cubeState, CubeSide.LEFT, false);
                break;
            }
            case 'b': {
                //call 4 times...for each side accordingly
                clonedCubeState = rubiksRotations.rotateSide(clonedCubeState, cubeState, new int[]{CubeSide.UPPER.ordinal(), CubeSide.LEFT.ordinal()},
                        firstRowOrColumn, // move RowIndex
                        threeRowsOrColumns, // move ColumnIndex
                        firstRowOrColumn, // new RowIndex
                        threeRowsOrColumns // new RowIndex
                );

                clonedCubeState = rubiksRotations.rotateSide(clonedCubeState, cubeState, new int[]{CubeSide.LEFT.ordinal(), CubeSide.DOWN.ordinal()},
                        firstRowOrColumn, // move RowIndex
                        threeRowsOrColumns, // move ColumnIndex
                        firstRowOrColumn, // new RowIndex
                        threeRowsOrColumns // new RowIndex
                );

                clonedCubeState = rubiksRotations.rotateSide(clonedCubeState, cubeState, new int[]{CubeSide.DOWN.ordinal(), CubeSide.RIGHT.ordinal()},
                        firstRowOrColumn, // move RowIndex
                        threeRowsOrColumns, // move ColumnIndex
                        firstRowOrColumn, // new RowIndex
                        threeRowsOrColumns // new RowIndex
                );

                clonedCubeState = rubiksRotations.rotateSide(clonedCubeState, cubeState, new int[]{CubeSide.RIGHT.ordinal(), CubeSide.UPPER.ordinal()},
                        firstRowOrColumn, // move RowIndex
                        threeRowsOrColumns, // move ColumnIndex
                        firstRowOrColumn, // new RowIndex
                        threeRowsOrColumns // new RowIndex
                );

                clonedCubeState = rubiksRotations.rotateSingleSide9Pieces(clonedCubeState, cubeState, CubeSide.BACK, false);
                break;
            }
        }
        CubeState newCubeState = new CubeState();
        newCubeState.setCubeState3DArray(clonedCubeState);
        return newCubeState;
    }

}
