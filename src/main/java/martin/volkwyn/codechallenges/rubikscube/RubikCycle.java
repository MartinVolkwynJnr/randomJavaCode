package martin.volkwyn.codechallenges.rubikscube;

import java.util.Arrays;

public class RubikCycle {
    RubiksRotations rubiksRotations = new RubiksRotations();


    //cube states
    CubeState cubeState = new CubeState();
    private boolean cubeSolved = false;

    public static void main(String[] args) {
        RubikCycle rubikCycle = new RubikCycle();
        String input = "LRUDBFlrudbf";
        rubikCycle.cubeState.setDefaultSolvedCube();

        int result = rubikCycle.getNumberOfSequenceRequiredToOriginalState(input);
        if (result > 0){
            System.out.println("Input = " + input + ", " + "Should repeat " + result + " times to get the orginal state");
        }else {
            System.out.println("String sequence was incorrect or more than 100 000 repetitions required");
        }
    }

    public int getNumberOfSequenceRequiredToOriginalState(String input) {
        int count = 0;

        int[][][] clonedCubeStateOriginal = RubiksRotations.getDeepCloneCubeState(cubeState);

        RotationRules rotationRules = new RotationRules();
        while (!cubeSolved) {
            count++;
            //looping through each char
            for (int i = 0; i < input.length(); i++) {
                // accessing each char
                char x = input.charAt(i);
                cubeState = rotationRules.rotateSideProvidedLetter(x,cubeState);
                if (cubeState == null){
                    return -1;
                }
            }


            if (Arrays.deepEquals(clonedCubeStateOriginal,cubeState.getCubeState3DArray())){
                cubeSolved = true;
            }
            if (count > 100000){
                return -1;
            }
        }
        return count;
    }
}
