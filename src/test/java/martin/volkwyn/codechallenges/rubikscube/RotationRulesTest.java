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

        cubeState.getCubeState3DArray()[CubeSide.BACK.ordinal()][2][0] = CubeColours.WHITE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.BACK.ordinal()][2][1] = CubeColours.GREEN.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.BACK.ordinal()][2][2] = CubeColours.RED.ordinal();

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
        Assert.assertEquals(CubeColours.YELLOW.ordinal(), cubeResult.getBack()[2][0]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getBack()[2][1]);
        Assert.assertEquals(CubeColours.ORANGE.ordinal(), cubeResult.getBack()[2][2]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getRight()[0][0]);
        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getRight()[1][0]);
        Assert.assertEquals(CubeColours.RED.ordinal(), cubeResult.getRight()[2][0]);
        Assert.assertEquals(CubeColours.YELLOW.ordinal(), cubeResult.getFront()[0][0]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getFront()[0][1]);
        Assert.assertEquals(CubeColours.ORANGE.ordinal(), cubeResult.getFront()[0][2]);
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
    public void rotateSideProvidedLetterD() {
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
        Assert.assertEquals(CubeColours.YELLOW.ordinal(), cubeResult.getBack()[0][0]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getBack()[0][1]);
        Assert.assertEquals(CubeColours.ORANGE.ordinal(), cubeResult.getBack()[0][2]);
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
    public void rotateSideProvidedLetterDCounter() {
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

    @Test
    public void rotateSideProvidedLetterF() {
        RotationRules rotationRules = new RotationRules();
        CubeState cubeState = new CubeState();
        cubeState.setDefaultSolvedCube();

        cubeState.getCubeState3DArray()[CubeSide.DOWN.ordinal()][2][0] = CubeColours.GREEN.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.DOWN.ordinal()][2][1] = CubeColours.WHITE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.DOWN.ordinal()][2][2] = CubeColours.BLUE.ordinal();

        cubeState.getCubeState3DArray()[CubeSide.UPPER.ordinal()][2][0] = CubeColours.WHITE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.UPPER.ordinal()][2][1] = CubeColours.GREEN.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.UPPER.ordinal()][2][2] = CubeColours.RED.ordinal();

        cubeState.getCubeState3DArray()[CubeSide.LEFT.ordinal()][2][0] = CubeColours.YELLOW.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.LEFT.ordinal()][2][1] = CubeColours.WHITE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.LEFT.ordinal()][2][2] = CubeColours.ORANGE.ordinal();

        cubeState.getCubeState3DArray()[CubeSide.RIGHT.ordinal()][2][0] = CubeColours.ORANGE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.RIGHT.ordinal()][2][1] = CubeColours.WHITE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.RIGHT.ordinal()][2][2] = CubeColours.YELLOW.ordinal();

        CubeState cubeResult = rotationRules.rotateSideProvidedLetter('F',cubeState);

        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getLeft()[2][0]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getLeft()[2][1]);
        Assert.assertEquals(CubeColours.BLUE.ordinal(), cubeResult.getLeft()[2][2]);
        Assert.assertEquals(CubeColours.YELLOW.ordinal(), cubeResult.getUpper()[2][0]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getUpper()[2][1]);
        Assert.assertEquals(CubeColours.ORANGE.ordinal(), cubeResult.getUpper()[2][2]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getRight()[2][0]);
        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getRight()[2][1]);
        Assert.assertEquals(CubeColours.RED.ordinal(), cubeResult.getRight()[2][2]);
        Assert.assertEquals(CubeColours.ORANGE.ordinal(), cubeResult.getDown()[2][0]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getDown()[2][1]);
        Assert.assertEquals(CubeColours.YELLOW.ordinal(), cubeResult.getDown()[2][2]);

        Assert.assertEquals(CubeColours.YELLOW.ordinal(), cubeResult.getFront()[0][0]);
        Assert.assertEquals(CubeColours.YELLOW.ordinal(), cubeResult.getFront()[0][1]);
        Assert.assertEquals(CubeColours.YELLOW.ordinal(), cubeResult.getFront()[0][2]);
        Assert.assertEquals(CubeColours.YELLOW.ordinal(), cubeResult.getFront()[0][0]);
        Assert.assertEquals(CubeColours.YELLOW.ordinal(), cubeResult.getFront()[1][1]);
        Assert.assertEquals(CubeColours.YELLOW.ordinal(), cubeResult.getFront()[2][2]);
        Assert.assertEquals(CubeColours.YELLOW.ordinal(), cubeResult.getFront()[2][0]);
        Assert.assertEquals(CubeColours.YELLOW.ordinal(), cubeResult.getFront()[2][1]);
        Assert.assertEquals(CubeColours.YELLOW.ordinal(), cubeResult.getFront()[2][2]);
    }


    @Test
    public void rotateSideProvidedLetterFCounter() {
        RotationRules rotationRules = new RotationRules();
        CubeState cubeState = new CubeState();
        cubeState.setDefaultSolvedCube();

        cubeState.getCubeState3DArray()[CubeSide.DOWN.ordinal()][2][0] = CubeColours.GREEN.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.DOWN.ordinal()][2][1] = CubeColours.WHITE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.DOWN.ordinal()][2][2] = CubeColours.BLUE.ordinal();

        cubeState.getCubeState3DArray()[CubeSide.UPPER.ordinal()][2][0] = CubeColours.WHITE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.UPPER.ordinal()][2][1] = CubeColours.GREEN.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.UPPER.ordinal()][2][2] = CubeColours.RED.ordinal();

        cubeState.getCubeState3DArray()[CubeSide.LEFT.ordinal()][2][0] = CubeColours.YELLOW.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.LEFT.ordinal()][2][1] = CubeColours.WHITE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.LEFT.ordinal()][2][2] = CubeColours.ORANGE.ordinal();

        cubeState.getCubeState3DArray()[CubeSide.RIGHT.ordinal()][2][0] = CubeColours.ORANGE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.RIGHT.ordinal()][2][1] = CubeColours.WHITE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.RIGHT.ordinal()][2][2] = CubeColours.YELLOW.ordinal();

        CubeState cubeResult = rotationRules.rotateSideProvidedLetter('f',cubeState);

        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getRight()[2][0]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getRight()[2][1]);
        Assert.assertEquals(CubeColours.BLUE.ordinal(), cubeResult.getRight()[2][2]);
        Assert.assertEquals(CubeColours.YELLOW.ordinal(), cubeResult.getDown()[2][0]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getDown()[2][1]);
        Assert.assertEquals(CubeColours.ORANGE.ordinal(), cubeResult.getDown()[2][2]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getLeft()[2][0]);
        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getLeft()[2][1]);
        Assert.assertEquals(CubeColours.RED.ordinal(), cubeResult.getLeft()[2][2]);
        Assert.assertEquals(CubeColours.ORANGE.ordinal(), cubeResult.getUpper()[2][0]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getUpper()[2][1]);
        Assert.assertEquals(CubeColours.YELLOW.ordinal(), cubeResult.getUpper()[2][2]);

        Assert.assertEquals(CubeColours.YELLOW.ordinal(), cubeResult.getFront()[0][0]);
        Assert.assertEquals(CubeColours.YELLOW.ordinal(), cubeResult.getFront()[0][1]);
        Assert.assertEquals(CubeColours.YELLOW.ordinal(), cubeResult.getFront()[0][2]);
        Assert.assertEquals(CubeColours.YELLOW.ordinal(), cubeResult.getFront()[0][0]);
        Assert.assertEquals(CubeColours.YELLOW.ordinal(), cubeResult.getFront()[1][1]);
        Assert.assertEquals(CubeColours.YELLOW.ordinal(), cubeResult.getFront()[2][2]);
        Assert.assertEquals(CubeColours.YELLOW.ordinal(), cubeResult.getFront()[2][0]);
        Assert.assertEquals(CubeColours.YELLOW.ordinal(), cubeResult.getFront()[2][1]);
        Assert.assertEquals(CubeColours.YELLOW.ordinal(), cubeResult.getFront()[2][2]);
    }

    @Test
    public void rotateSideProvidedLetterB() {
        RotationRules rotationRules = new RotationRules();
        CubeState cubeState = new CubeState();
        cubeState.setDefaultSolvedCube();

        cubeState.getCubeState3DArray()[CubeSide.DOWN.ordinal()][0][0] = CubeColours.GREEN.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.DOWN.ordinal()][0][1] = CubeColours.WHITE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.DOWN.ordinal()][0][2] = CubeColours.BLUE.ordinal();

        cubeState.getCubeState3DArray()[CubeSide.UPPER.ordinal()][0][0] = CubeColours.WHITE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.UPPER.ordinal()][0][1] = CubeColours.GREEN.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.UPPER.ordinal()][0][2] = CubeColours.RED.ordinal();

        cubeState.getCubeState3DArray()[CubeSide.LEFT.ordinal()][0][0] = CubeColours.YELLOW.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.LEFT.ordinal()][0][1] = CubeColours.WHITE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.LEFT.ordinal()][0][2] = CubeColours.ORANGE.ordinal();

        cubeState.getCubeState3DArray()[CubeSide.RIGHT.ordinal()][0][0] = CubeColours.ORANGE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.RIGHT.ordinal()][0][1] = CubeColours.WHITE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.RIGHT.ordinal()][0][2] = CubeColours.YELLOW.ordinal();

        CubeState cubeResult = rotationRules.rotateSideProvidedLetter('B',cubeState);

        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getRight()[0][0]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getRight()[0][1]);
        Assert.assertEquals(CubeColours.BLUE.ordinal(), cubeResult.getRight()[0][2]);
        Assert.assertEquals(CubeColours.YELLOW.ordinal(), cubeResult.getDown()[0][0]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getDown()[0][1]);
        Assert.assertEquals(CubeColours.ORANGE.ordinal(), cubeResult.getDown()[0][2]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getLeft()[0][0]);
        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getLeft()[0][1]);
        Assert.assertEquals(CubeColours.RED.ordinal(), cubeResult.getLeft()[0][2]);
        Assert.assertEquals(CubeColours.ORANGE.ordinal(), cubeResult.getUpper()[0][0]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getUpper()[0][1]);
        Assert.assertEquals(CubeColours.YELLOW.ordinal(), cubeResult.getUpper()[0][2]);

        Assert.assertEquals(CubeColours.YELLOW.ordinal(), cubeResult.getFront()[0][0]);
        Assert.assertEquals(CubeColours.YELLOW.ordinal(), cubeResult.getFront()[0][1]);
        Assert.assertEquals(CubeColours.YELLOW.ordinal(), cubeResult.getFront()[0][2]);
        Assert.assertEquals(CubeColours.YELLOW.ordinal(), cubeResult.getFront()[0][0]);
        Assert.assertEquals(CubeColours.YELLOW.ordinal(), cubeResult.getFront()[1][1]);
        Assert.assertEquals(CubeColours.YELLOW.ordinal(), cubeResult.getFront()[2][2]);
        Assert.assertEquals(CubeColours.YELLOW.ordinal(), cubeResult.getFront()[2][0]);
        Assert.assertEquals(CubeColours.YELLOW.ordinal(), cubeResult.getFront()[2][1]);
        Assert.assertEquals(CubeColours.YELLOW.ordinal(), cubeResult.getFront()[2][2]);
    }

    @Test
    public void rotateSideProvidedLetterBCounter() {
        RotationRules rotationRules = new RotationRules();
        CubeState cubeState = new CubeState();
        cubeState.setDefaultSolvedCube();

        cubeState.getCubeState3DArray()[CubeSide.DOWN.ordinal()][0][0] = CubeColours.GREEN.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.DOWN.ordinal()][0][1] = CubeColours.WHITE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.DOWN.ordinal()][0][2] = CubeColours.BLUE.ordinal();

        cubeState.getCubeState3DArray()[CubeSide.UPPER.ordinal()][0][0] = CubeColours.WHITE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.UPPER.ordinal()][0][1] = CubeColours.GREEN.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.UPPER.ordinal()][0][2] = CubeColours.RED.ordinal();

        cubeState.getCubeState3DArray()[CubeSide.LEFT.ordinal()][0][0] = CubeColours.YELLOW.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.LEFT.ordinal()][0][1] = CubeColours.WHITE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.LEFT.ordinal()][0][2] = CubeColours.ORANGE.ordinal();

        cubeState.getCubeState3DArray()[CubeSide.RIGHT.ordinal()][0][0] = CubeColours.ORANGE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.RIGHT.ordinal()][0][1] = CubeColours.WHITE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.RIGHT.ordinal()][0][2] = CubeColours.YELLOW.ordinal();

        CubeState cubeResult = rotationRules.rotateSideProvidedLetter('b',cubeState);

        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getLeft()[0][0]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getLeft()[0][1]);
        Assert.assertEquals(CubeColours.BLUE.ordinal(), cubeResult.getLeft()[0][2]);
        Assert.assertEquals(CubeColours.YELLOW.ordinal(), cubeResult.getUpper()[0][0]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getUpper()[0][1]);
        Assert.assertEquals(CubeColours.ORANGE.ordinal(), cubeResult.getUpper()[0][2]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getRight()[0][0]);
        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getRight()[0][1]);
        Assert.assertEquals(CubeColours.RED.ordinal(), cubeResult.getRight()[0][2]);
        Assert.assertEquals(CubeColours.ORANGE.ordinal(), cubeResult.getDown()[0][0]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getDown()[0][1]);
        Assert.assertEquals(CubeColours.YELLOW.ordinal(), cubeResult.getDown()[0][2]);

        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getBack()[0][0]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getBack()[0][1]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getBack()[0][2]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getBack()[0][0]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getBack()[1][1]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getBack()[2][2]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getBack()[2][0]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getBack()[2][1]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getBack()[2][2]);
    }

    @Test
    public void rotateSideProvidedLetterR() {
        RotationRules rotationRules = new RotationRules();
        CubeState cubeState = new CubeState();
        cubeState.setDefaultSolvedCube();

        cubeState.getCubeState3DArray()[CubeSide.FRONT.ordinal()][0][2] = CubeColours.GREEN.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.FRONT.ordinal()][1][2] = CubeColours.WHITE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.FRONT.ordinal()][2][2] = CubeColours.BLUE.ordinal();

        cubeState.getCubeState3DArray()[CubeSide.DOWN.ordinal()][0][0] = CubeColours.WHITE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.DOWN.ordinal()][1][0] = CubeColours.GREEN.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.DOWN.ordinal()][2][0] = CubeColours.RED.ordinal();

        cubeState.getCubeState3DArray()[CubeSide.BACK.ordinal()][0][2] = CubeColours.YELLOW.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.BACK.ordinal()][1][2] = CubeColours.WHITE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.BACK.ordinal()][2][2] = CubeColours.ORANGE.ordinal();

        cubeState.getCubeState3DArray()[CubeSide.UPPER.ordinal()][0][2] = CubeColours.ORANGE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.UPPER.ordinal()][1][2] = CubeColours.WHITE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.UPPER.ordinal()][2][2] = CubeColours.YELLOW.ordinal();

        CubeState cubeResult = rotationRules.rotateSideProvidedLetter('R',cubeState);

        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getUpper()[0][2]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getUpper()[1][2]);
        Assert.assertEquals(CubeColours.BLUE.ordinal(), cubeResult.getUpper()[2][2]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getFront()[0][2]);
        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getFront()[1][2]);
        Assert.assertEquals(CubeColours.RED.ordinal(), cubeResult.getFront()[2][2]);
        Assert.assertEquals(CubeColours.YELLOW.ordinal(), cubeResult.getDown()[2][0]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getDown()[1][0]);
        Assert.assertEquals(CubeColours.ORANGE.ordinal(), cubeResult.getDown()[0][0]);
        Assert.assertEquals(CubeColours.YELLOW.ordinal(), cubeResult.getBack()[0][2]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getBack()[1][2]);
        Assert.assertEquals(CubeColours.ORANGE.ordinal(), cubeResult.getBack()[2][2]);

        Assert.assertEquals(CubeColours.BLUE.ordinal(), cubeResult.getRight()[0][0]);
        Assert.assertEquals(CubeColours.BLUE.ordinal(), cubeResult.getRight()[0][1]);
        Assert.assertEquals(CubeColours.BLUE.ordinal(), cubeResult.getRight()[0][2]);
        Assert.assertEquals(CubeColours.BLUE.ordinal(), cubeResult.getRight()[0][0]);
        Assert.assertEquals(CubeColours.BLUE.ordinal(), cubeResult.getRight()[1][1]);
        Assert.assertEquals(CubeColours.BLUE.ordinal(), cubeResult.getRight()[2][2]);
        Assert.assertEquals(CubeColours.BLUE.ordinal(), cubeResult.getRight()[2][0]);
        Assert.assertEquals(CubeColours.BLUE.ordinal(), cubeResult.getRight()[2][1]);
        Assert.assertEquals(CubeColours.BLUE.ordinal(), cubeResult.getRight()[2][2]);
    }

    @Test
    public void rotateSideProvidedLetterRCounter() {
        RotationRules rotationRules = new RotationRules();
        CubeState cubeState = new CubeState();
        cubeState.setDefaultSolvedCube();

        cubeState.getCubeState3DArray()[CubeSide.FRONT.ordinal()][0][2] = CubeColours.GREEN.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.FRONT.ordinal()][1][2] = CubeColours.WHITE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.FRONT.ordinal()][2][2] = CubeColours.BLUE.ordinal();

        cubeState.getCubeState3DArray()[CubeSide.DOWN.ordinal()][0][0] = CubeColours.WHITE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.DOWN.ordinal()][1][0] = CubeColours.GREEN.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.DOWN.ordinal()][2][0] = CubeColours.RED.ordinal();

        cubeState.getCubeState3DArray()[CubeSide.BACK.ordinal()][0][2] = CubeColours.YELLOW.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.BACK.ordinal()][1][2] = CubeColours.WHITE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.BACK.ordinal()][2][2] = CubeColours.ORANGE.ordinal();

        cubeState.getCubeState3DArray()[CubeSide.UPPER.ordinal()][0][2] = CubeColours.ORANGE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.UPPER.ordinal()][1][2] = CubeColours.WHITE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.UPPER.ordinal()][2][2] = CubeColours.YELLOW.ordinal();

        CubeState cubeResult = rotationRules.rotateSideProvidedLetter('r',cubeState);

        Assert.assertEquals(CubeColours.YELLOW.ordinal(), cubeResult.getUpper()[0][2]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getUpper()[1][2]);
        Assert.assertEquals(CubeColours.ORANGE.ordinal(), cubeResult.getUpper()[2][2]);
        Assert.assertEquals(CubeColours.ORANGE.ordinal(), cubeResult.getFront()[0][2]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getFront()[1][2]);
        Assert.assertEquals(CubeColours.YELLOW.ordinal(), cubeResult.getFront()[2][2]);
        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getDown()[0][0]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getDown()[1][0]);
        Assert.assertEquals(CubeColours.BLUE.ordinal(), cubeResult.getDown()[2][0]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getBack()[0][2]);
        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getBack()[1][2]);
        Assert.assertEquals(CubeColours.RED.ordinal(), cubeResult.getBack()[2][2]);

        Assert.assertEquals(CubeColours.BLUE.ordinal(), cubeResult.getRight()[0][0]);
        Assert.assertEquals(CubeColours.BLUE.ordinal(), cubeResult.getRight()[0][1]);
        Assert.assertEquals(CubeColours.BLUE.ordinal(), cubeResult.getRight()[0][2]);
        Assert.assertEquals(CubeColours.BLUE.ordinal(), cubeResult.getRight()[0][0]);
        Assert.assertEquals(CubeColours.BLUE.ordinal(), cubeResult.getRight()[1][1]);
        Assert.assertEquals(CubeColours.BLUE.ordinal(), cubeResult.getRight()[2][2]);
        Assert.assertEquals(CubeColours.BLUE.ordinal(), cubeResult.getRight()[2][0]);
        Assert.assertEquals(CubeColours.BLUE.ordinal(), cubeResult.getRight()[2][1]);
        Assert.assertEquals(CubeColours.BLUE.ordinal(), cubeResult.getRight()[2][2]);
    }

    @Test
    public void rotateSideProvidedLetterL() {
        RotationRules rotationRules = new RotationRules();
        CubeState cubeState = new CubeState();
        cubeState.setDefaultSolvedCube();

        cubeState.getCubeState3DArray()[CubeSide.FRONT.ordinal()][0][0] = CubeColours.GREEN.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.FRONT.ordinal()][1][0] = CubeColours.WHITE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.FRONT.ordinal()][2][0] = CubeColours.BLUE.ordinal();

        cubeState.getCubeState3DArray()[CubeSide.DOWN.ordinal()][0][2] = CubeColours.WHITE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.DOWN.ordinal()][1][2] = CubeColours.GREEN.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.DOWN.ordinal()][2][2] = CubeColours.RED.ordinal();

        cubeState.getCubeState3DArray()[CubeSide.BACK.ordinal()][0][0] = CubeColours.YELLOW.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.BACK.ordinal()][1][0] = CubeColours.WHITE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.BACK.ordinal()][2][0] = CubeColours.ORANGE.ordinal();

        cubeState.getCubeState3DArray()[CubeSide.UPPER.ordinal()][0][0] = CubeColours.ORANGE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.UPPER.ordinal()][1][0] = CubeColours.WHITE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.UPPER.ordinal()][2][0] = CubeColours.YELLOW.ordinal();

        CubeState cubeResult = rotationRules.rotateSideProvidedLetter('L',cubeState);

        Assert.assertEquals(CubeColours.YELLOW.ordinal(), cubeResult.getUpper()[0][0]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getUpper()[1][0]);
        Assert.assertEquals(CubeColours.ORANGE.ordinal(), cubeResult.getUpper()[2][0]);
        Assert.assertEquals(CubeColours.ORANGE.ordinal(), cubeResult.getFront()[0][0]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getFront()[1][0]);
        Assert.assertEquals(CubeColours.YELLOW.ordinal(), cubeResult.getFront()[2][0]);
        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getDown()[0][2]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getDown()[1][2]);
        Assert.assertEquals(CubeColours.BLUE.ordinal(), cubeResult.getDown()[2][2]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getBack()[0][0]);
        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getBack()[1][0]);
        Assert.assertEquals(CubeColours.RED.ordinal(), cubeResult.getBack()[2][0]);

        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getLeft()[0][0]);
        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getLeft()[0][1]);
        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getLeft()[0][2]);
        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getLeft()[0][0]);
        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getLeft()[1][1]);
        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getLeft()[2][2]);
        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getLeft()[2][0]);
        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getLeft()[2][1]);
        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getLeft()[2][2]);
    }

    @Test
    public void rotateSideProvidedLetterLCounter() {
        RotationRules rotationRules = new RotationRules();
        CubeState cubeState = new CubeState();
        cubeState.setDefaultSolvedCube();

        cubeState.getCubeState3DArray()[CubeSide.FRONT.ordinal()][0][0] = CubeColours.GREEN.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.FRONT.ordinal()][1][0] = CubeColours.WHITE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.FRONT.ordinal()][2][0] = CubeColours.BLUE.ordinal();

        cubeState.getCubeState3DArray()[CubeSide.DOWN.ordinal()][0][2] = CubeColours.WHITE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.DOWN.ordinal()][1][2] = CubeColours.GREEN.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.DOWN.ordinal()][2][2] = CubeColours.RED.ordinal();

        cubeState.getCubeState3DArray()[CubeSide.BACK.ordinal()][0][0] = CubeColours.YELLOW.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.BACK.ordinal()][1][0] = CubeColours.WHITE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.BACK.ordinal()][2][0] = CubeColours.ORANGE.ordinal();

        cubeState.getCubeState3DArray()[CubeSide.UPPER.ordinal()][0][0] = CubeColours.ORANGE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.UPPER.ordinal()][1][0] = CubeColours.WHITE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.UPPER.ordinal()][2][0] = CubeColours.YELLOW.ordinal();

        CubeState cubeResult = rotationRules.rotateSideProvidedLetter('l',cubeState);

        Assert.assertEquals(CubeColours.YELLOW.ordinal(), cubeResult.getDown()[0][2]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getDown()[1][2]);
        Assert.assertEquals(CubeColours.ORANGE.ordinal(), cubeResult.getDown()[2][2]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getFront()[0][0]);
        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getFront()[1][0]);
        Assert.assertEquals(CubeColours.RED.ordinal(), cubeResult.getFront()[2][0]);
        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getUpper()[0][0]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getUpper()[1][0]);
        Assert.assertEquals(CubeColours.BLUE.ordinal(), cubeResult.getUpper()[2][0]);
        Assert.assertEquals(CubeColours.ORANGE.ordinal(), cubeResult.getBack()[2][0]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getBack()[1][0]);
        Assert.assertEquals(CubeColours.YELLOW.ordinal(), cubeResult.getBack()[0][0]);

        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getLeft()[0][0]);
        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getLeft()[0][1]);
        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getLeft()[0][2]);
        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getLeft()[0][0]);
        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getLeft()[1][1]);
        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getLeft()[2][2]);
        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getLeft()[2][0]);
        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getLeft()[2][1]);
        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getLeft()[2][2]);
    }

    @Test
    public void rotateSingleSide9PiecesTest(){
        RotationRules rotationRules = new RotationRules();

        RubiksRotations rubiksRotations = new RubiksRotations();

        CubeState cubeState = new CubeState();
        cubeState.setDefaultSolvedCube();

        cubeState.getCubeState3DArray()[CubeSide.LEFT.ordinal()][0][0] = CubeColours.RED.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.LEFT.ordinal()][0][1] = CubeColours.ORANGE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.LEFT.ordinal()][0][2] = CubeColours.GREEN.ordinal();

        cubeState.getCubeState3DArray()[CubeSide.LEFT.ordinal()][1][0] = CubeColours.ORANGE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.LEFT.ordinal()][1][1] = CubeColours.WHITE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.LEFT.ordinal()][1][2] = CubeColours.RED.ordinal();

        cubeState.getCubeState3DArray()[CubeSide.LEFT.ordinal()][2][0] = CubeColours.WHITE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.LEFT.ordinal()][2][1] = CubeColours.YELLOW.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.LEFT.ordinal()][2][2] = CubeColours.BLUE.ordinal();

        int[][][] clonedCubeState = RubiksRotations.getDeepCloneCubeState(cubeState);
        CubeState cubeResult = new CubeState();
        clonedCubeState = rubiksRotations.rotateSingleSide9Pieces(clonedCubeState, cubeState, CubeSide.LEFT, true);
        cubeResult.setCubeState3DArray(clonedCubeState);

        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getLeft()[0][0]);
        Assert.assertEquals(CubeColours.ORANGE.ordinal(), cubeResult.getLeft()[0][1]);
        Assert.assertEquals(CubeColours.RED.ordinal(), cubeResult.getLeft()[0][2]);
        Assert.assertEquals(CubeColours.YELLOW.ordinal(), cubeResult.getLeft()[1][0]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getLeft()[1][1]);
        Assert.assertEquals(CubeColours.ORANGE.ordinal(), cubeResult.getLeft()[1][2]);
        Assert.assertEquals(CubeColours.BLUE.ordinal(), cubeResult.getLeft()[2][0]);
        Assert.assertEquals(CubeColours.RED.ordinal(), cubeResult.getLeft()[2][1]);
        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getLeft()[2][2]);
    }

    @Test
    public void rotateSingleSide9PiecesTestCounter(){
        RotationRules rotationRules = new RotationRules();

        RubiksRotations rubiksRotations = new RubiksRotations();

        CubeState cubeState = new CubeState();
        cubeState.setDefaultSolvedCube();

        cubeState.getCubeState3DArray()[CubeSide.LEFT.ordinal()][0][0] = CubeColours.RED.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.LEFT.ordinal()][0][1] = CubeColours.ORANGE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.LEFT.ordinal()][0][2] = CubeColours.GREEN.ordinal();

        cubeState.getCubeState3DArray()[CubeSide.LEFT.ordinal()][1][0] = CubeColours.ORANGE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.LEFT.ordinal()][1][1] = CubeColours.WHITE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.LEFT.ordinal()][1][2] = CubeColours.RED.ordinal();

        cubeState.getCubeState3DArray()[CubeSide.LEFT.ordinal()][2][0] = CubeColours.WHITE.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.LEFT.ordinal()][2][1] = CubeColours.YELLOW.ordinal();
        cubeState.getCubeState3DArray()[CubeSide.LEFT.ordinal()][2][2] = CubeColours.BLUE.ordinal();

        int[][][] clonedCubeState = RubiksRotations.getDeepCloneCubeState(cubeState);
        CubeState cubeResult = new CubeState();
        clonedCubeState = rubiksRotations.rotateSingleSide9Pieces(clonedCubeState, cubeState, CubeSide.LEFT, false);
        cubeResult.setCubeState3DArray(clonedCubeState);

        Assert.assertEquals(CubeColours.GREEN.ordinal(), cubeResult.getLeft()[0][0]);
        Assert.assertEquals(CubeColours.RED.ordinal(), cubeResult.getLeft()[0][1]);
        Assert.assertEquals(CubeColours.BLUE.ordinal(), cubeResult.getLeft()[0][2]);
        Assert.assertEquals(CubeColours.ORANGE.ordinal(), cubeResult.getLeft()[1][0]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getLeft()[1][1]);
        Assert.assertEquals(CubeColours.YELLOW.ordinal(), cubeResult.getLeft()[1][2]);
        Assert.assertEquals(CubeColours.RED.ordinal(), cubeResult.getLeft()[2][0]);
        Assert.assertEquals(CubeColours.ORANGE.ordinal(), cubeResult.getLeft()[2][1]);
        Assert.assertEquals(CubeColours.WHITE.ordinal(), cubeResult.getLeft()[2][2]);
    }

    @Test
    public void testPatternRUrURUUr(){
        //RUrURUUr
        RubikCycle rubikCycle = new RubikCycle();
        rubikCycle.cubeState.setDefaultSolvedCube();
        int result = rubikCycle.getNumberOfSequenceRequiredToOriginalState("RUrURUUr");

        Assert.assertEquals(6,result);
    }
    @Test
    public void testPatternRr(){
        //RUrURUUr
        RubikCycle rubikCycle = new RubikCycle();
        rubikCycle.cubeState.setDefaultSolvedCube();
        int result = rubikCycle.getNumberOfSequenceRequiredToOriginalState("Rr");

        Assert.assertEquals(1,result);
    }

    @Test
    public void testPatternLLL(){
        //RUrURUUr
        RubikCycle rubikCycle = new RubikCycle();
        rubikCycle.cubeState.setDefaultSolvedCube();
        int result = rubikCycle.getNumberOfSequenceRequiredToOriginalState("LLL");

        Assert.assertEquals(4,result);
    }

    @Test
    public void testPatterndl(){
        //RUrURUUr
        RubikCycle rubikCycle = new RubikCycle();
        rubikCycle.cubeState.setDefaultSolvedCube();
        int result = rubikCycle.getNumberOfSequenceRequiredToOriginalState("dl");

        Assert.assertEquals(105,result);
    }

    @Test
    public void testPatternRUUdBd(){
        //RUrURUUr
        RubikCycle rubikCycle = new RubikCycle();
        rubikCycle.cubeState.setDefaultSolvedCube();
        int result = rubikCycle.getNumberOfSequenceRequiredToOriginalState("RUUdBd");

        Assert.assertEquals(1260,result);
    }
}