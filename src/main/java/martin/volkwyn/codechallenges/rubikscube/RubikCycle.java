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



        System.out.println("Input = " + input + ", " + "Should repeat " + result + " times to get the orginal state");
    }

    public int getNumberOfSequenceRequiredToOriginalState(String input) {
        int count = 0;

        int[][][] clonedCubeStateOriginal = RubiksRotations.getDeepCloneCubeState(cubeState);

        RotationRules rotationRules = new RotationRules();

        for (int i = 0; i < input.length(); i++) {
            // accessing each char
            char x = input.charAt(i);
            System.out.println(x);
            cubeState = rotationRules.rotateSideProvidedLetter(x,cubeState);

            System.out.println("CUBE STATE After - " + x + " \n " + cubeState);
        }
        System.out.println("CUBE STATE After- " + cubeState);
//        while (!cubeSolved) {
//            count++;
//            System.out.println("----------------- ");
//            System.out.println("CUBE STATE Before- " + cubeState);
//            //looping through each char
//            for (int i = 0; i < input.length(); i++) {
//                // accessing each char
//                char x = input.charAt(i);
//                cubeState = rotationRules.rotateSideProvidedLetter(x,cubeState);
//            }
//
//            System.out.println("CUBE STATE After- " + cubeState);
//
//            if (Arrays.deepEquals(clonedCubeStateOriginal,cubeState.getCubeState3DArray()) || count > 10000){
//                cubeSolved = true;
//            }
//        }
        return count;
    }
}
