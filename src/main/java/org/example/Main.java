package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

enum SquareContains {
    NOTHING,
    LADDERSTART,
    SNAKEHEAD
}

class Square {
    public int squareNumber;
    public SquareContains squareContains;
    public int squareEntry;
    public int squareResult;


    public Square(){

    }

    public Square(int squareNumber,SquareContains squareContains, int squareEntry, int squareResult) {
        this.squareNumber = squareNumber;
        this.squareContains = squareContains;
        this.squareEntry = squareEntry;
        this.squareResult = squareResult;
    }
}

public class Main {
    private static int Dice;
    private static int PlayerLocation;
    private static int NewPlayerLocation;

    private static Map<Integer,Square> snakeBoard = new HashMap<>();

    public static void main(String[] args) {
        Main main = new Main();
        // Initialize Board
        main.initializeBoard();
        // Role Dice while game is running
        PlayerLocation = 0;

        while(PlayerLocation <= 25){
            Random rn = new Random();
            Dice = rn.nextInt(6);
            NewPlayerLocation = PlayerLocation + Dice;
            String eventOccured = "";
            // Loop through board event if exist then do event else continue with play...
            for (Map.Entry<Integer,Square> entry : snakeBoard.entrySet()) {
                if (entry.getKey() == NewPlayerLocation){
                    Square newSquare = entry.getValue();
                    NewPlayerLocation = newSquare.squareResult;
                    eventOccured = newSquare.squareContains.toString();
                }
            }

            System.out.println("----------------------------");
            System.out.println("Location of Player = " + PlayerLocation);
            System.out.println("New Location of Player = " + NewPlayerLocation);
            System.out.println("Event that occured = " + eventOccured);
            System.out.println("Dice value thrown = " + Dice);
            System.out.println("----------------------------");

            PlayerLocation = NewPlayerLocation;
        }
    }

    private void initializeBoard(){
        snakeBoard.put(3, new Square(3,SquareContains.LADDERSTART, 3,11));
        snakeBoard.put(6, new Square(6,SquareContains.LADDERSTART, 6,17));
        snakeBoard.put(9, new Square(9,SquareContains.LADDERSTART, 9,18));
        snakeBoard.put(10, new Square(10,SquareContains.LADDERSTART, 10,12));
        snakeBoard.put(14, new Square(14,SquareContains.SNAKEHEAD, 0,4));
        snakeBoard.put(19, new Square(19,SquareContains.SNAKEHEAD, 0,8));
        snakeBoard.put(22, new Square(22,SquareContains.SNAKEHEAD, 0,20));
        snakeBoard.put(24, new Square(24,SquareContains.SNAKEHEAD, 0,16));
    }

}