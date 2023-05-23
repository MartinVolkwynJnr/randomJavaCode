package martin.volkwyn.codechallenges.rubikscube;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RubiksRotationsTest {
    @Test
    public void AssertRotateUpper() {
        RubikCycle rubikCycle = new RubikCycle();
        rubikCycle.cubeState.setDefaultSolvedCube();

        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.FRONT.ordinal()][0][0] = CubeColours.GREEN.ordinal();
        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.FRONT.ordinal()][0][1] = CubeColours.WHITE.ordinal();
        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.FRONT.ordinal()][0][2] = CubeColours.BLUE.ordinal();

        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.BACK.ordinal()][0][0] = CubeColours.WHITE.ordinal();
        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.BACK.ordinal()][0][1] = CubeColours.GREEN.ordinal();
        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.BACK.ordinal()][0][2] = CubeColours.RED.ordinal();

        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.LEFT.ordinal()][0][2] = CubeColours.YELLOW.ordinal();
        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.LEFT.ordinal()][1][2] = CubeColours.WHITE.ordinal();
        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.LEFT.ordinal()][2][2] = CubeColours.ORANGE.ordinal();

        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.RIGHT.ordinal()][0][0] = CubeColours.ORANGE.ordinal();
        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.RIGHT.ordinal()][1][0] = CubeColours.WHITE.ordinal();
        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.RIGHT.ordinal()][2][0] = CubeColours.YELLOW.ordinal();

        RotationRules rotationRules = new RotationRules();

        RowColumnIndex[] threeRowsOrColumns = new RowColumnIndex[]{RowColumnIndex.FIRST, RowColumnIndex.MID, RowColumnIndex.LAST};

        CubeState cubeResult = rubikCycle.rubiksRotations.rotate(rubikCycle.cubeState, true, CubeSide.UPPER, rotationRules.rotateUpper, threeRowsOrColumns, threeRowsOrColumns);

        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getLeft()[0][2]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getLeft()[1][2]);
        Assert.assertEquals(CubeColours.BLUE.ordinal(), cubeResult.getLeft()[2][2]);
        Assert.assertEquals(CubeColours.YELLOW.ordinal(), cubeResult.getBack()[0][0]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getBack()[0][1]);
        Assert.assertEquals(CubeColours.ORANGE.ordinal(), cubeResult.getBack()[0][2]);
        Assert.assertEquals(CubeColours.RED.ordinal(), cubeResult.getRight()[0][0]);
        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getRight()[1][0]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getRight()[2][0]);
        Assert.assertEquals(CubeColours.YELLOW.ordinal(), cubeResult.getFront()[0][0]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getFront()[0][1]);
        Assert.assertEquals(CubeColours.ORANGE.ordinal(), cubeResult.getFront()[0][2]);

        Assert.assertEquals(CubeColours.RED.ordinal(), cubeResult.getUpper()[0][0]);
        Assert.assertEquals(CubeColours.RED.ordinal(), cubeResult.getUpper()[0][1]);
        Assert.assertEquals(CubeColours.RED.ordinal(), cubeResult.getUpper()[0][2]);
        Assert.assertEquals(CubeColours.RED.ordinal(), cubeResult.getUpper()[0][0]);
        Assert.assertEquals(CubeColours.RED.ordinal(), cubeResult.getUpper()[1][1]);
        Assert.assertEquals(CubeColours.RED.ordinal(), cubeResult.getUpper()[2][2]);
        Assert.assertEquals(CubeColours.RED.ordinal(), cubeResult.getUpper()[2][0]);
        Assert.assertEquals(CubeColours.RED.ordinal(), cubeResult.getUpper()[2][1]);
        Assert.assertEquals(CubeColours.RED.ordinal(), cubeResult.getUpper()[2][2]);
    }

    @Test
    public void AssertRotateUpperCounter() {
        RubikCycle rubikCycle = new RubikCycle();
        rubikCycle.cubeState.setDefaultSolvedCube();

        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.FRONT.ordinal()][0][0] = CubeColours.GREEN.ordinal();
        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.FRONT.ordinal()][0][1] = CubeColours.WHITE.ordinal();
        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.FRONT.ordinal()][0][2] = CubeColours.BLUE.ordinal();

        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.BACK.ordinal()][0][0] = CubeColours.WHITE.ordinal();
        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.BACK.ordinal()][0][1] = CubeColours.GREEN.ordinal();
        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.BACK.ordinal()][0][2] = CubeColours.RED.ordinal();

        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.LEFT.ordinal()][0][2] = CubeColours.YELLOW.ordinal();
        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.LEFT.ordinal()][1][2] = CubeColours.WHITE.ordinal();
        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.LEFT.ordinal()][2][2] = CubeColours.ORANGE.ordinal();

        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.RIGHT.ordinal()][0][0] = CubeColours.ORANGE.ordinal();
        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.RIGHT.ordinal()][1][0] = CubeColours.WHITE.ordinal();
        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.RIGHT.ordinal()][2][0] = CubeColours.YELLOW.ordinal();

        RotationRules rotationRules = new RotationRules();

        RowColumnIndex[] threeRowsOrColumns = new RowColumnIndex[]{RowColumnIndex.FIRST, RowColumnIndex.MID, RowColumnIndex.LAST};

        CubeState cubeResult = rubikCycle.rubiksRotations.rotate(rubikCycle.cubeState, false, CubeSide.UPPER, rotationRules.rotateUpperCounter, threeRowsOrColumns, threeRowsOrColumns);

        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getLeft()[0][2]);
        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getLeft()[1][2]);
        Assert.assertEquals(CubeColours.RED.ordinal(), cubeResult.getLeft()[2][2]);
        Assert.assertEquals(CubeColours.YELLOW.ordinal(), cubeResult.getBack()[0][0]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getBack()[0][1]);
        Assert.assertEquals(CubeColours.ORANGE.ordinal(), cubeResult.getBack()[0][2]);
        Assert.assertEquals(CubeColours.BLUE.ordinal(), cubeResult.getRight()[0][0]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getRight()[1][0]);
        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getRight()[2][0]);
        Assert.assertEquals(CubeColours.YELLOW.ordinal(), cubeResult.getFront()[0][0]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getFront()[0][1]);
        Assert.assertEquals(CubeColours.ORANGE.ordinal(), cubeResult.getFront()[0][2]);

        Assert.assertEquals(CubeColours.RED.ordinal(), cubeResult.getUpper()[0][0]);
        Assert.assertEquals(CubeColours.RED.ordinal(), cubeResult.getUpper()[0][1]);
        Assert.assertEquals(CubeColours.RED.ordinal(), cubeResult.getUpper()[0][2]);
        Assert.assertEquals(CubeColours.RED.ordinal(), cubeResult.getUpper()[0][0]);
        Assert.assertEquals(CubeColours.RED.ordinal(), cubeResult.getUpper()[1][1]);
        Assert.assertEquals(CubeColours.RED.ordinal(), cubeResult.getUpper()[2][2]);
        Assert.assertEquals(CubeColours.RED.ordinal(), cubeResult.getUpper()[2][0]);
        Assert.assertEquals(CubeColours.RED.ordinal(), cubeResult.getUpper()[2][1]);
        Assert.assertEquals(CubeColours.RED.ordinal(), cubeResult.getUpper()[2][2]);
    }

    @Test
    public void AssertRotateDown() {
        RubikCycle rubikCycle = new RubikCycle();
        rubikCycle.cubeState.setDefaultSolvedCube();

        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.FRONT.ordinal()][2][0] = CubeColours.GREEN.ordinal();
        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.FRONT.ordinal()][2][1] = CubeColours.WHITE.ordinal();
        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.FRONT.ordinal()][2][2] = CubeColours.BLUE.ordinal();

        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.BACK.ordinal()][2][0] = CubeColours.WHITE.ordinal();
        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.BACK.ordinal()][2][1] = CubeColours.GREEN.ordinal();
        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.BACK.ordinal()][2][2] = CubeColours.RED.ordinal();

        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.LEFT.ordinal()][0][0] = CubeColours.YELLOW.ordinal();
        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.LEFT.ordinal()][1][0] = CubeColours.WHITE.ordinal();
        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.LEFT.ordinal()][2][0] = CubeColours.ORANGE.ordinal();

        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.RIGHT.ordinal()][0][2] = CubeColours.ORANGE.ordinal();
        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.RIGHT.ordinal()][1][2] = CubeColours.WHITE.ordinal();
        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.RIGHT.ordinal()][2][2] = CubeColours.YELLOW.ordinal();

        RotationRules rotationRules = new RotationRules();

        RowColumnIndex[] threeRowsOrColumns = new RowColumnIndex[]{RowColumnIndex.FIRST, RowColumnIndex.MID, RowColumnIndex.LAST};

        CubeState cubeResult = rubikCycle.rubiksRotations.rotate(rubikCycle.cubeState, true, CubeSide.DOWN, rotationRules.rotateDown, threeRowsOrColumns, threeRowsOrColumns);

        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getLeft()[0][0]);
        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getLeft()[1][0]);
        Assert.assertEquals(CubeColours.RED.ordinal(), cubeResult.getLeft()[2][0]);
        Assert.assertEquals(CubeColours.YELLOW.ordinal(), cubeResult.getBack()[2][0]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getBack()[2][1]);
        Assert.assertEquals(CubeColours.ORANGE.ordinal(), cubeResult.getBack()[2][2]);
        Assert.assertEquals(CubeColours.BLUE.ordinal(), cubeResult.getRight()[0][2]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getRight()[1][2]);
        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getRight()[2][2]);
        Assert.assertEquals(CubeColours.YELLOW.ordinal(), cubeResult.getFront()[2][0]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getFront()[2][1]);
        Assert.assertEquals(CubeColours.ORANGE.ordinal(), cubeResult.getFront()[2][2]);

        Assert.assertEquals(CubeColours.ORANGE.ordinal(), cubeResult.getDown()[0][0]);
        Assert.assertEquals(CubeColours.ORANGE.ordinal(), cubeResult.getDown()[0][1]);
        Assert.assertEquals(CubeColours.ORANGE.ordinal(), cubeResult.getDown()[0][2]);
        Assert.assertEquals(CubeColours.ORANGE.ordinal(), cubeResult.getDown()[0][0]);
        Assert.assertEquals(CubeColours.ORANGE.ordinal(), cubeResult.getDown()[1][1]);
        Assert.assertEquals(CubeColours.ORANGE.ordinal(), cubeResult.getDown()[2][2]);
        Assert.assertEquals(CubeColours.ORANGE.ordinal(), cubeResult.getDown()[2][0]);
        Assert.assertEquals(CubeColours.ORANGE.ordinal(), cubeResult.getDown()[2][1]);
        Assert.assertEquals(CubeColours.ORANGE.ordinal(), cubeResult.getDown()[2][2]);
    }


    @Test
    public void AssertRotateDownCounter() {
        RubikCycle rubikCycle = new RubikCycle();
        rubikCycle.cubeState.setDefaultSolvedCube();

        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.FRONT.ordinal()][2][0] = CubeColours.GREEN.ordinal();
        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.FRONT.ordinal()][2][1] = CubeColours.WHITE.ordinal();
        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.FRONT.ordinal()][2][2] = CubeColours.BLUE.ordinal();

        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.BACK.ordinal()][2][0] = CubeColours.WHITE.ordinal();
        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.BACK.ordinal()][2][1] = CubeColours.GREEN.ordinal();
        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.BACK.ordinal()][2][2] = CubeColours.RED.ordinal();

        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.LEFT.ordinal()][0][0] = CubeColours.YELLOW.ordinal();
        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.LEFT.ordinal()][1][0] = CubeColours.WHITE.ordinal();
        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.LEFT.ordinal()][2][0] = CubeColours.ORANGE.ordinal();

        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.RIGHT.ordinal()][0][2] = CubeColours.ORANGE.ordinal();
        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.RIGHT.ordinal()][1][2] = CubeColours.WHITE.ordinal();
        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.RIGHT.ordinal()][2][2] = CubeColours.YELLOW.ordinal();

        RotationRules rotationRules = new RotationRules();

        RowColumnIndex[] threeRowsOrColumns = new RowColumnIndex[]{RowColumnIndex.FIRST, RowColumnIndex.MID, RowColumnIndex.LAST};

        CubeState cubeResult = rubikCycle.rubiksRotations.rotate(rubikCycle.cubeState, false, CubeSide.DOWN, rotationRules.rotateDownCounter, threeRowsOrColumns, threeRowsOrColumns);

        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getLeft()[0][0]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getLeft()[1][0]);
        Assert.assertEquals(CubeColours.BLUE.ordinal(), cubeResult.getLeft()[2][0]);
        Assert.assertEquals(CubeColours.YELLOW.ordinal(), cubeResult.getBack()[2][0]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getBack()[2][1]);
        Assert.assertEquals(CubeColours.ORANGE.ordinal(), cubeResult.getBack()[2][2]);
        Assert.assertEquals(CubeColours.RED.ordinal(), cubeResult.getRight()[0][2]);
        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getRight()[1][2]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getRight()[2][2]);
        Assert.assertEquals(CubeColours.YELLOW.ordinal(), cubeResult.getFront()[2][0]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getFront()[2][1]);
        Assert.assertEquals(CubeColours.ORANGE.ordinal(), cubeResult.getFront()[2][2]);

        Assert.assertEquals(CubeColours.ORANGE.ordinal(), cubeResult.getDown()[0][0]);
        Assert.assertEquals(CubeColours.ORANGE.ordinal(), cubeResult.getDown()[0][1]);
        Assert.assertEquals(CubeColours.ORANGE.ordinal(), cubeResult.getDown()[0][2]);
        Assert.assertEquals(CubeColours.ORANGE.ordinal(), cubeResult.getDown()[0][0]);
        Assert.assertEquals(CubeColours.ORANGE.ordinal(), cubeResult.getDown()[1][1]);
        Assert.assertEquals(CubeColours.ORANGE.ordinal(), cubeResult.getDown()[2][2]);
        Assert.assertEquals(CubeColours.ORANGE.ordinal(), cubeResult.getDown()[2][0]);
        Assert.assertEquals(CubeColours.ORANGE.ordinal(), cubeResult.getDown()[2][1]);
        Assert.assertEquals(CubeColours.ORANGE.ordinal(), cubeResult.getDown()[2][2]);
    }

    @Test
    public void AssertRotateLeft() {
        RubikCycle rubikCycle = new RubikCycle();
        rubikCycle.cubeState.setDefaultSolvedCube();

        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.FRONT.ordinal()][0][0] = CubeColours.GREEN.ordinal();
        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.FRONT.ordinal()][0][1] = CubeColours.WHITE.ordinal();
        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.FRONT.ordinal()][0][2] = CubeColours.BLUE.ordinal();

        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.BACK.ordinal()][0][0] = CubeColours.WHITE.ordinal();
        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.BACK.ordinal()][0][1] = CubeColours.GREEN.ordinal();
        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.BACK.ordinal()][0][2] = CubeColours.RED.ordinal();

        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.UPPER.ordinal()][0][2] = CubeColours.YELLOW.ordinal();
        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.UPPER.ordinal()][1][2] = CubeColours.WHITE.ordinal();
        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.UPPER.ordinal()][2][2] = CubeColours.ORANGE.ordinal();

        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.DOWN.ordinal()][0][0] = CubeColours.ORANGE.ordinal();
        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.DOWN.ordinal()][1][0] = CubeColours.WHITE.ordinal();
        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.DOWN.ordinal()][2][0] = CubeColours.YELLOW.ordinal();

        RotationRules rotationRules = new RotationRules();

        RowColumnIndex[] threeRowsOrColumns = new RowColumnIndex[]{RowColumnIndex.FIRST, RowColumnIndex.MID, RowColumnIndex.LAST};
        RowColumnIndex[] firstRowOrColumn = new RowColumnIndex[]{RowColumnIndex.FIRST};
        RowColumnIndex[] lastRowOrColumn = new RowColumnIndex[]{RowColumnIndex.LAST};

        CubeState cubeResult = rubikCycle.rubiksRotations.rotate(rubikCycle.cubeState, true, CubeSide.LEFT, rotationRules.rotateLeft, threeRowsOrColumns, firstRowOrColumn);

        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getUpper()[0][0]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getUpper()[1][0]);
        Assert.assertEquals(CubeColours.BLUE.ordinal(), cubeResult.getUpper()[2][0]);
        Assert.assertEquals(CubeColours.YELLOW.ordinal(), cubeResult.getBack()[0][2]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getBack()[1][2]);
        Assert.assertEquals(CubeColours.ORANGE.ordinal(), cubeResult.getBack()[2][2]);
        Assert.assertEquals(CubeColours.RED.ordinal(), cubeResult.getDown()[0][2]);
        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getDown()[1][2]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getDown()[2][2]);
        Assert.assertEquals(CubeColours.YELLOW.ordinal(), cubeResult.getFront()[0][0]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getFront()[1][0]);
        Assert.assertEquals(CubeColours.ORANGE.ordinal(), cubeResult.getFront()[2][0]);

        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getUpper()[0][0]);
        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getUpper()[0][1]);
        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getUpper()[0][2]);
        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getUpper()[0][0]);
        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getUpper()[1][1]);
        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getUpper()[2][2]);
        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getUpper()[2][0]);
        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getUpper()[2][1]);
        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getUpper()[2][2]);
    }


    @Test
    public void AssertRotateLeftCounter() {
        RubikCycle rubikCycle = new RubikCycle();
        rubikCycle.cubeState.setDefaultSolvedCube();

        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.FRONT.ordinal()][0][0] = CubeColours.GREEN.ordinal();
        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.FRONT.ordinal()][0][1] = CubeColours.WHITE.ordinal();
        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.FRONT.ordinal()][0][2] = CubeColours.BLUE.ordinal();

        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.BACK.ordinal()][0][0] = CubeColours.WHITE.ordinal();
        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.BACK.ordinal()][0][1] = CubeColours.GREEN.ordinal();
        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.BACK.ordinal()][0][2] = CubeColours.RED.ordinal();

        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.UPPER.ordinal()][0][2] = CubeColours.YELLOW.ordinal();
        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.UPPER.ordinal()][1][2] = CubeColours.WHITE.ordinal();
        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.UPPER.ordinal()][2][2] = CubeColours.ORANGE.ordinal();

        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.DOWN.ordinal()][0][0] = CubeColours.ORANGE.ordinal();
        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.DOWN.ordinal()][1][0] = CubeColours.WHITE.ordinal();
        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.DOWN.ordinal()][2][0] = CubeColours.YELLOW.ordinal();

        RotationRules rotationRules = new RotationRules();

        RowColumnIndex[] threeRowsOrColumns = new RowColumnIndex[]{RowColumnIndex.FIRST, RowColumnIndex.MID, RowColumnIndex.LAST};
        RowColumnIndex[] firstRowOrColumn = new RowColumnIndex[]{RowColumnIndex.FIRST};
        RowColumnIndex[] lastRowOrColumn = new RowColumnIndex[]{RowColumnIndex.LAST};

        CubeState cubeResult = rubikCycle.rubiksRotations.rotate(rubikCycle.cubeState, false, CubeSide.LEFT, rotationRules.rotateLeftCounter, threeRowsOrColumns, firstRowOrColumn);

        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getUpper()[0][0]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getUpper()[1][0]);
        Assert.assertEquals(CubeColours.BLUE.ordinal(), cubeResult.getUpper()[2][0]);
        Assert.assertEquals(CubeColours.YELLOW.ordinal(), cubeResult.getBack()[0][2]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getBack()[1][2]);
        Assert.assertEquals(CubeColours.ORANGE.ordinal(), cubeResult.getBack()[2][2]);
        Assert.assertEquals(CubeColours.RED.ordinal(), cubeResult.getDown()[0][2]);
        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getDown()[1][2]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getDown()[2][2]);
        Assert.assertEquals(CubeColours.YELLOW.ordinal(), cubeResult.getFront()[0][0]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getFront()[1][0]);
        Assert.assertEquals(CubeColours.ORANGE.ordinal(), cubeResult.getFront()[2][0]);

        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getUpper()[0][0]);
        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getUpper()[0][1]);
        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getUpper()[0][2]);
        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getUpper()[0][0]);
        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getUpper()[1][1]);
        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getUpper()[2][2]);
        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getUpper()[2][0]);
        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getUpper()[2][1]);
        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getUpper()[2][2]);
    }
//
//    @Test
//    public void AssertRotateRight() {
//        RubikCycle rubikCycle = new RubikCycle();
//        rubikCycle.cubeState.setDefaultSolvedCube();
//
//        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.FRONT.ordinal()][0][0] = CubeColours.GREEN.ordinal();
//        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.FRONT.ordinal()][0][1] = CubeColours.WHITE.ordinal();
//        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.FRONT.ordinal()][0][2] = CubeColours.BLUE.ordinal();
//
//        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.BACK.ordinal()][0][0] = CubeColours.WHITE.ordinal();
//        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.BACK.ordinal()][0][1] = CubeColours.GREEN.ordinal();
//        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.BACK.ordinal()][0][2] = CubeColours.RED.ordinal();
//
//        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.LEFT.ordinal()][0][2] = CubeColours.YELLOW.ordinal();
//        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.LEFT.ordinal()][1][2] = CubeColours.WHITE.ordinal();
//        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.LEFT.ordinal()][2][2] = CubeColours.ORANGE.ordinal();
//
//        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.RIGHT.ordinal()][0][0] = CubeColours.ORANGE.ordinal();
//        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.RIGHT.ordinal()][1][0] = CubeColours.WHITE.ordinal();
//        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.RIGHT.ordinal()][2][0] = CubeColours.YELLOW.ordinal();
//
//        RotationRules rotationRules = new RotationRules();
//
//        RowColumnIndex[] threeRowsOrColumns = new RowColumnIndex[]{RowColumnIndex.FIRST, RowColumnIndex.MID, RowColumnIndex.LAST};
//
//        CubeState cubeResult = rubikCycle.rubiksRotations.rotate(rubikCycle.cubeState, true, CubeSide.UPPER, rotationRules.rotateUpper, threeRowsOrColumns, threeRowsOrColumns);
//
//        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getLeft()[0][2]);
//        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getLeft()[1][2]);
//        Assert.assertEquals(CubeColours.BLUE.ordinal(), cubeResult.getLeft()[2][2]);
//        Assert.assertEquals(CubeColours.YELLOW.ordinal(), cubeResult.getBack()[0][0]);
//        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getBack()[0][1]);
//        Assert.assertEquals(CubeColours.ORANGE.ordinal(), cubeResult.getBack()[0][2]);
//        Assert.assertEquals(CubeColours.RED.ordinal(), cubeResult.getRight()[0][0]);
//        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getRight()[1][0]);
//        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getRight()[2][0]);
//        Assert.assertEquals(CubeColours.YELLOW.ordinal(), cubeResult.getFront()[0][0]);
//        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getFront()[0][1]);
//        Assert.assertEquals(CubeColours.ORANGE.ordinal(), cubeResult.getFront()[0][2]);
//
//        Assert.assertEquals(CubeColours.RED.ordinal(), cubeResult.getUpper()[0][0]);
//        Assert.assertEquals(CubeColours.RED.ordinal(), cubeResult.getUpper()[0][1]);
//        Assert.assertEquals(CubeColours.RED.ordinal(), cubeResult.getUpper()[0][2]);
//        Assert.assertEquals(CubeColours.RED.ordinal(), cubeResult.getUpper()[0][0]);
//        Assert.assertEquals(CubeColours.RED.ordinal(), cubeResult.getUpper()[1][1]);
//        Assert.assertEquals(CubeColours.RED.ordinal(), cubeResult.getUpper()[2][2]);
//        Assert.assertEquals(CubeColours.RED.ordinal(), cubeResult.getUpper()[2][0]);
//        Assert.assertEquals(CubeColours.RED.ordinal(), cubeResult.getUpper()[2][1]);
//        Assert.assertEquals(CubeColours.RED.ordinal(), cubeResult.getUpper()[2][2]);
//    }
//
//    @Test
//    public void AssertRotateBack() {
//        RubikCycle rubikCycle = new RubikCycle();
//        rubikCycle.cubeState.setDefaultSolvedCube();
//
//        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.FRONT.ordinal()][0][0] = CubeColours.GREEN.ordinal();
//        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.FRONT.ordinal()][0][1] = CubeColours.WHITE.ordinal();
//        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.FRONT.ordinal()][0][2] = CubeColours.BLUE.ordinal();
//
//        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.BACK.ordinal()][0][0] = CubeColours.WHITE.ordinal();
//        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.BACK.ordinal()][0][1] = CubeColours.GREEN.ordinal();
//        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.BACK.ordinal()][0][2] = CubeColours.RED.ordinal();
//
//        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.LEFT.ordinal()][0][2] = CubeColours.YELLOW.ordinal();
//        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.LEFT.ordinal()][1][2] = CubeColours.WHITE.ordinal();
//        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.LEFT.ordinal()][2][2] = CubeColours.ORANGE.ordinal();
//
//        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.RIGHT.ordinal()][0][0] = CubeColours.ORANGE.ordinal();
//        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.RIGHT.ordinal()][1][0] = CubeColours.WHITE.ordinal();
//        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.RIGHT.ordinal()][2][0] = CubeColours.YELLOW.ordinal();
//
//        RotationRules rotationRules = new RotationRules();
//
//        RowColumnIndex[] threeRowsOrColumns = new RowColumnIndex[]{RowColumnIndex.FIRST, RowColumnIndex.MID, RowColumnIndex.LAST};
//
//        CubeState cubeResult = rubikCycle.rubiksRotations.rotate(rubikCycle.cubeState, true, CubeSide.UPPER, rotationRules.rotateUpper, threeRowsOrColumns, threeRowsOrColumns);
//
//        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getLeft()[0][2]);
//        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getLeft()[1][2]);
//        Assert.assertEquals(CubeColours.BLUE.ordinal(), cubeResult.getLeft()[2][2]);
//        Assert.assertEquals(CubeColours.YELLOW.ordinal(), cubeResult.getBack()[0][0]);
//        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getBack()[0][1]);
//        Assert.assertEquals(CubeColours.ORANGE.ordinal(), cubeResult.getBack()[0][2]);
//        Assert.assertEquals(CubeColours.RED.ordinal(), cubeResult.getRight()[0][0]);
//        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getRight()[1][0]);
//        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getRight()[2][0]);
//        Assert.assertEquals(CubeColours.YELLOW.ordinal(), cubeResult.getFront()[0][0]);
//        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getFront()[0][1]);
//        Assert.assertEquals(CubeColours.ORANGE.ordinal(), cubeResult.getFront()[0][2]);
//
//        Assert.assertEquals(CubeColours.RED.ordinal(), cubeResult.getUpper()[0][0]);
//        Assert.assertEquals(CubeColours.RED.ordinal(), cubeResult.getUpper()[0][1]);
//        Assert.assertEquals(CubeColours.RED.ordinal(), cubeResult.getUpper()[0][2]);
//        Assert.assertEquals(CubeColours.RED.ordinal(), cubeResult.getUpper()[0][0]);
//        Assert.assertEquals(CubeColours.RED.ordinal(), cubeResult.getUpper()[1][1]);
//        Assert.assertEquals(CubeColours.RED.ordinal(), cubeResult.getUpper()[2][2]);
//        Assert.assertEquals(CubeColours.RED.ordinal(), cubeResult.getUpper()[2][0]);
//        Assert.assertEquals(CubeColours.RED.ordinal(), cubeResult.getUpper()[2][1]);
//        Assert.assertEquals(CubeColours.RED.ordinal(), cubeResult.getUpper()[2][2]);
//    }
//
//    @Test
//    public void AssertRotateFront() {
//        RubikCycle rubikCycle = new RubikCycle();
//        rubikCycle.cubeState.setDefaultSolvedCube();
//
//        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.FRONT.ordinal()][0][0] = CubeColours.GREEN.ordinal();
//        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.FRONT.ordinal()][0][1] = CubeColours.WHITE.ordinal();
//        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.FRONT.ordinal()][0][2] = CubeColours.BLUE.ordinal();
//
//        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.BACK.ordinal()][0][0] = CubeColours.WHITE.ordinal();
//        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.BACK.ordinal()][0][1] = CubeColours.GREEN.ordinal();
//        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.BACK.ordinal()][0][2] = CubeColours.RED.ordinal();
//
//        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.LEFT.ordinal()][0][2] = CubeColours.YELLOW.ordinal();
//        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.LEFT.ordinal()][1][2] = CubeColours.WHITE.ordinal();
//        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.LEFT.ordinal()][2][2] = CubeColours.ORANGE.ordinal();
//
//        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.RIGHT.ordinal()][0][0] = CubeColours.ORANGE.ordinal();
//        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.RIGHT.ordinal()][1][0] = CubeColours.WHITE.ordinal();
//        rubikCycle.cubeState.getCubeState3DArray()[CubeSide.RIGHT.ordinal()][2][0] = CubeColours.YELLOW.ordinal();
//
//        RotationRules rotationRules = new RotationRules();
//
//        RowColumnIndex[] threeRowsOrColumns = new RowColumnIndex[]{RowColumnIndex.FIRST, RowColumnIndex.MID, RowColumnIndex.LAST};
//
//        CubeState cubeResult = rubikCycle.rubiksRotations.rotate(rubikCycle.cubeState, true, CubeSide.UPPER, rotationRules.rotateUpper, threeRowsOrColumns, threeRowsOrColumns);
//
//        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getLeft()[0][2]);
//        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getLeft()[1][2]);
//        Assert.assertEquals(CubeColours.BLUE.ordinal(), cubeResult.getLeft()[2][2]);
//        Assert.assertEquals(CubeColours.YELLOW.ordinal(), cubeResult.getBack()[0][0]);
//        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getBack()[0][1]);
//        Assert.assertEquals(CubeColours.ORANGE.ordinal(), cubeResult.getBack()[0][2]);
//        Assert.assertEquals(CubeColours.RED.ordinal(), cubeResult.getRight()[0][0]);
//        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getRight()[1][0]);
//        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getRight()[2][0]);
//        Assert.assertEquals(CubeColours.YELLOW.ordinal(), cubeResult.getFront()[0][0]);
//        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getFront()[0][1]);
//        Assert.assertEquals(CubeColours.ORANGE.ordinal(), cubeResult.getFront()[0][2]);
//
//        Assert.assertEquals(CubeColours.RED.ordinal(), cubeResult.getUpper()[0][0]);
//        Assert.assertEquals(CubeColours.RED.ordinal(), cubeResult.getUpper()[0][1]);
//        Assert.assertEquals(CubeColours.RED.ordinal(), cubeResult.getUpper()[0][2]);
//        Assert.assertEquals(CubeColours.RED.ordinal(), cubeResult.getUpper()[0][0]);
//        Assert.assertEquals(CubeColours.RED.ordinal(), cubeResult.getUpper()[1][1]);
//        Assert.assertEquals(CubeColours.RED.ordinal(), cubeResult.getUpper()[2][2]);
//        Assert.assertEquals(CubeColours.RED.ordinal(), cubeResult.getUpper()[2][0]);
//        Assert.assertEquals(CubeColours.RED.ordinal(), cubeResult.getUpper()[2][1]);
//        Assert.assertEquals(CubeColours.RED.ordinal(), cubeResult.getUpper()[2][2]);
//    }



}