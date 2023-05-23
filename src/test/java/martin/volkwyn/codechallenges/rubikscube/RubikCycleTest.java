package martin.volkwyn.codechallenges.rubikscube;

import org.example.SpiralMain;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class RubikCycleTest {
    @Test
    public void AssertRotateCorrectLeft() {
        RubikCycle rubikCycle = new RubikCycle();
        String input = "L";
        rubikCycle.cubeState.setDefaultSolvedCube();

        int result = rubikCycle.getNumberOfSequenceRequiredToOriginalState(input);

        Assert.assertEquals(4, result);
    }

    @Test
    public void AssertRotateCorrectRight() {
        RubikCycle rubikCycle = new RubikCycle();
        String input = "R";
        rubikCycle.cubeState.setDefaultSolvedCube();

        int result = rubikCycle.getNumberOfSequenceRequiredToOriginalState(input);

        Assert.assertEquals(4, result);
    }

    @Test
    public void AssertRotateCorrectUpper() {
        RubikCycle rubikCycle = new RubikCycle();
        String input = "U";
        rubikCycle.cubeState.setDefaultSolvedCube();

        int result = rubikCycle.getNumberOfSequenceRequiredToOriginalState(input);

        Assert.assertEquals(4, result);
    }

    @Test
    public void AssertRotateCorrectDown() {
        RubikCycle rubikCycle = new RubikCycle();
        String input = "D";
        rubikCycle.cubeState.setDefaultSolvedCube();

        int result = rubikCycle.getNumberOfSequenceRequiredToOriginalState(input);

        Assert.assertEquals(4, result);
    }

    @Test
    public void AssertRotateCorrectFront() {
        RubikCycle rubikCycle = new RubikCycle();
        String input = "F";
        rubikCycle.cubeState.setDefaultSolvedCube();

        int result = rubikCycle.getNumberOfSequenceRequiredToOriginalState(input);

        Assert.assertEquals(4, result);
    }

    @Test
    public void AssertRotateCorrectBack() {
        RubikCycle rubikCycle = new RubikCycle();
        String input = "B";
        rubikCycle.cubeState.setDefaultSolvedCube();

        int result = rubikCycle.getNumberOfSequenceRequiredToOriginalState(input);

        Assert.assertEquals(4, result);
    }

    @Test
    public void AssertRotateCorrectLeftReverse() {
        RubikCycle rubikCycle = new RubikCycle();
        String input = "l";
        rubikCycle.cubeState.setDefaultSolvedCube();

        int result = rubikCycle.getNumberOfSequenceRequiredToOriginalState(input);

        Assert.assertEquals(4, result);
    }

    @Test
    public void AssertRotateCorrectRightReverse() {
        RubikCycle rubikCycle = new RubikCycle();
        String input = "r";
        rubikCycle.cubeState.setDefaultSolvedCube();

        int result = rubikCycle.getNumberOfSequenceRequiredToOriginalState(input);

        Assert.assertEquals(4, result);
    }

    @Test
    public void AssertRotateCorrectUpperReverse() {
        RubikCycle rubikCycle = new RubikCycle();
        String input = "u";
        rubikCycle.cubeState.setDefaultSolvedCube();

        int result = rubikCycle.getNumberOfSequenceRequiredToOriginalState(input);

        Assert.assertEquals(4, result);
    }

    @Test
    public void AssertRotateCorrectDownReverse() {
        RubikCycle rubikCycle = new RubikCycle();
        String input = "d";
        rubikCycle.cubeState.setDefaultSolvedCube();

        int result = rubikCycle.getNumberOfSequenceRequiredToOriginalState(input);

        Assert.assertEquals(4, result);
    }

    @Test
    public void AssertRotateCorrectFrontReverse() {
        RubikCycle rubikCycle = new RubikCycle();
        String input = "f";
        rubikCycle.cubeState.setDefaultSolvedCube();

        int result = rubikCycle.getNumberOfSequenceRequiredToOriginalState(input);

        Assert.assertEquals(4, result);
    }

    @Test
    public void AssertRotateCorrectBackReverse() {
        RubikCycle rubikCycle = new RubikCycle();
        String input = "b";
        rubikCycle.cubeState.setDefaultSolvedCube();

        int result = rubikCycle.getNumberOfSequenceRequiredToOriginalState(input);

        Assert.assertEquals(4, result);
    }
}