package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class SpiralMainTest {


    @Test
    public void AssertValuesReturnedSpiralOrder() {
        int[][] matrixBox = {
                { 1, 2, 3, 4 ,5},
                { 6, 7, 8, 9 ,10},
                { 11, 12, 13, 14 ,15},
                { 16, 17, 18, 19 ,20},
                { 21, 22, 23, 24 ,25}
        };


        List<Integer> expectedArray = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5, 10, 15, 20, 25, 24, 23, 22, 21, 16, 11, 6, 7, 8, 9, 14, 19, 18, 17, 12, 13));

        List<Integer> result = SpiralMain.SpiralOrder(matrixBox);
        Assert.assertEquals(expectedArray, result);
    }

    @Test
    public void AssertValuesReturnedSpiralOrdertest() {
        int[][] matrixBox = {
                { 1, 2, 3, 4 ,5},
                { 6, 7, 8, 9 ,10, 38},
                { 11, 12, 13, 14 ,15},
                { 16, 17, 18, 19 ,20},
                { 21, 22, 23, 24 ,25}
        };


        List<Integer> expectedArray = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5, 10, 15, 20, 25, 24, 23, 22, 21, 16, 11, 6, 7, 8, 9, 14, 19, 18, 17, 12, 13));

        List<Integer> result = SpiralMain.SpiralOrder(matrixBox);
        Assert.assertEquals(expectedArray, result);
    }

    @Test
    public void AssertValuesReturnedSpiralOrderEightByThree() {
        int[][] matrixBox = {
                { 1, 2, 3, 4 ,5, 6, 7, 8},
                { 9 ,10, 11, 12, 13, 14 ,15, 16},
                { 17, 18, 19 ,20, 21, 22, 23, 24}
        };

        List<Integer> expectedArray = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 16, 24, 23, 22, 21, 20, 19, 18, 17, 9, 10, 11, 12, 13, 14, 15));

        List<Integer> result = SpiralMain.SpiralOrder(matrixBox);
        Assert.assertEquals(expectedArray, result);
    }

    @Test
    public void AssertValuesReturnedSpiralOrderTestTwoByFive() {
        int[][] matrixBox = {
                { 1, 2},
                { 3, 4},
                { 5, 6},
                { 7, 8},
                { 9, 10}
        };

        List<Integer> expectedArray = new ArrayList<>(
                Arrays.asList(1, 2, 4, 6, 8, 10, 9, 7, 5, 3));

        List<Integer> result = SpiralMain.SpiralOrder(matrixBox);
        Assert.assertEquals(expectedArray, result);
    }
}