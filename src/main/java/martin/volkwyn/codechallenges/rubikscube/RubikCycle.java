package martin.volkwyn.codechallenges.rubikscube;

import java.util.Arrays;

public class RubikCycle {
    RubiksRotations rubiksRotations = new RubiksRotations();


    //cube states
    CubeState cubeState = new CubeState();
    private boolean cubeSolved = false;

    public static void main(String[] args) {
        RubikCycle rubikCycle = new RubikCycle();
        String input = "DdD";
        rubikCycle.cubeState.setDefaultSolvedCube();

        System.out.println("CUBE STATE Front- " + rubikCycle.cubeState);

        int result = rubikCycle.getNumberOfSequenceRequiredToOriginalState(input);


        System.out.println("----------------- ");
        System.out.println("CUBE STATE Front- " + rubikCycle.cubeState);

        System.out.println("Input = " + input + ", " + "Should repeat " + result + " times to get the orginal state");
    }

    public int getNumberOfSequenceRequiredToOriginalState(String input) {
        int count = 0;

        int[][][] clonedCubeStateOriginal = RubiksRotations.getDeepCloneCubeState(cubeState);

        RotationRules rotationRules = new RotationRules();

        while (!cubeSolved) {

            //looping through each char
            for (int i = 0; i < input.length(); i++) {
                // accessing each char
                char x = input.charAt(i);
                System.out.println(x);
                cubeState = rotationRules.rotateSideProvidedLetter(x,cubeState);
            }

            count++;
            if (Arrays.deepEquals(clonedCubeStateOriginal,this.cubeState.getCubeState3DArray())){
                cubeSolved = true;
            }
            else if (count> 10000){
                cubeSolved = true;
            }
        }
        return count;
    }
}
