package martin.volkwyn.codechallenges.rubikscube;

import org.junit.Assert;
import org.junit.Test;

public class RotationRulesTest {

    @Test
    public void rotateSideProvidedLetterU() {

        RotationRules rotationRules = new RotationRules();
        CubeState cubeState = new CubeState();
        cubeState.setDefaultSolvedCube();

        cubeState.getCubeState3DArray()[CubeSide.FRONT.ordinal()][0][0] = CubeColours.GREEN.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.FRONT.ordinal()][0][1] = CubeColours.WHITE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.FRONT.ordinal()][0][2] = CubeColours.BLUE.ordinal();

        cubeState.getCubeState3DArray()[CubeSide.BACK.ordinal()][0][0] = CubeColours.WHITE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.BACK.ordinal()][0][1] = CubeColours.GREEN.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.BACK.ordinal()][0][2] = CubeColours.RED.ordinal();

        cubeState.getCubeState3DArray()[CubeSide.LEFT.ordinal()][0][2] = CubeColours.YELLOW.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.LEFT.ordinal()][1][2] = CubeColours.WHITE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.LEFT.ordinal()][2][2] = CubeColours.ORANGE.ordinal();

        cubeState.getCubeState3DArray()[CubeSide.RIGHT.ordinal()][0][0] = CubeColours.ORANGE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.RIGHT.ordinal()][1][0] = CubeColours.WHITE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.RIGHT.ordinal()][2][0] = CubeColours.YELLOW.ordinal();

        CubeState cubeResult = rotationRules.rotateSideProvidedLetter('U',cubeState);

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
    public void rotateSideProvidedLetterUCounter() {
        RotationRules rotationRules = new RotationRules();
        CubeState cubeState = new CubeState();
        cubeState.setDefaultSolvedCube();

        cubeState.getCubeState3DArray()[CubeSide.FRONT.ordinal()][0][0] = CubeColours.GREEN.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.FRONT.ordinal()][0][1] = CubeColours.WHITE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.FRONT.ordinal()][0][2] = CubeColours.BLUE.ordinal();

        cubeState.getCubeState3DArray()[CubeSide.BACK.ordinal()][0][0] = CubeColours.WHITE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.BACK.ordinal()][0][1] = CubeColours.GREEN.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.BACK.ordinal()][0][2] = CubeColours.RED.ordinal();

        cubeState.getCubeState3DArray()[CubeSide.LEFT.ordinal()][0][2] = CubeColours.YELLOW.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.LEFT.ordinal()][1][2] = CubeColours.WHITE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.LEFT.ordinal()][2][2] = CubeColours.ORANGE.ordinal();

        cubeState.getCubeState3DArray()[CubeSide.RIGHT.ordinal()][0][0] = CubeColours.ORANGE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.RIGHT.ordinal()][1][0] = CubeColours.WHITE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.RIGHT.ordinal()][2][0] = CubeColours.YELLOW.ordinal();

        CubeState cubeResult = rotationRules.rotateSideProvidedLetter('u',cubeState);
        
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
        RotationRules rotationRules = new RotationRules();
        CubeState cubeState = new CubeState();
        cubeState.setDefaultSolvedCube();

        cubeState.getCubeState3DArray()[CubeSide.FRONT.ordinal()][2][0] = CubeColours.GREEN.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.FRONT.ordinal()][2][1] = CubeColours.WHITE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.FRONT.ordinal()][2][2] = CubeColours.BLUE.ordinal();

        cubeState.getCubeState3DArray()[CubeSide.BACK.ordinal()][2][0] = CubeColours.WHITE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.BACK.ordinal()][2][1] = CubeColours.GREEN.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.BACK.ordinal()][2][2] = CubeColours.RED.ordinal();

        cubeState.getCubeState3DArray()[CubeSide.LEFT.ordinal()][0][0] = CubeColours.YELLOW.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.LEFT.ordinal()][1][0] = CubeColours.WHITE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.LEFT.ordinal()][2][0] = CubeColours.ORANGE.ordinal();

        cubeState.getCubeState3DArray()[CubeSide.RIGHT.ordinal()][0][2] = CubeColours.ORANGE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.RIGHT.ordinal()][1][2] = CubeColours.WHITE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.RIGHT.ordinal()][2][2] = CubeColours.YELLOW.ordinal();

        CubeState cubeResult = rotationRules.rotateSideProvidedLetter('D',cubeState);

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
        RotationRules rotationRules = new RotationRules();
        CubeState cubeState = new CubeState();
        cubeState.setDefaultSolvedCube();

        cubeState.getCubeState3DArray()[CubeSide.FRONT.ordinal()][2][0] = CubeColours.GREEN.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.FRONT.ordinal()][2][1] = CubeColours.WHITE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.FRONT.ordinal()][2][2] = CubeColours.BLUE.ordinal();

        cubeState.getCubeState3DArray()[CubeSide.BACK.ordinal()][2][0] = CubeColours.WHITE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.BACK.ordinal()][2][1] = CubeColours.GREEN.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.BACK.ordinal()][2][2] = CubeColours.RED.ordinal();

        cubeState.getCubeState3DArray()[CubeSide.LEFT.ordinal()][0][0] = CubeColours.YELLOW.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.LEFT.ordinal()][1][0] = CubeColours.WHITE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.LEFT.ordinal()][2][0] = CubeColours.ORANGE.ordinal();

        cubeState.getCubeState3DArray()[CubeSide.RIGHT.ordinal()][0][2] = CubeColours.ORANGE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.RIGHT.ordinal()][1][2] = CubeColours.WHITE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.RIGHT.ordinal()][2][2] = CubeColours.YELLOW.ordinal();

        CubeState cubeResult = rotationRules.rotateSideProvidedLetter('d',cubeState);

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
}