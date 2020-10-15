package com.afs.tdd;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MarsRover {

    private int locationX;
    private int locationY;
    private String currentDirection;


    private String[] movementList = new String[]{"M", "L", "R"};
    private String[] directionList = new String[]{"N", "E", "S", "W"};

    public MarsRover(int locationX, int locationY, String currentDirection) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.currentDirection = currentDirection;
    }

    public boolean validateMovementInstruction(String movementInstruction) {
        return Arrays.stream(movementList).anyMatch(movement->movement.equals(movementInstruction));
    }

    public void executeMovementInstruction(String movementInstruction) {
        if(movementInstruction == "M"){
            move();
        }
        if(movementInstruction.equals("L")){
            turnLeft();
        }
    }

    private void turnLeft() {
        int directionIndex = IntStream.range(0, directionList.length)
                .filter(index-> directionList[index].equals(currentDirection))
                .map(direction->{
                    if(direction == 0){
                        return directionList.length-1;
                    }
                    return direction-1;
                })
                .findFirst()
                .orElse(-1);

        currentDirection = directionList[directionIndex];

    }

    private void move() {
        if(isCoordinateX()){
            updateLocationX(currentDirection);
        }
        if(isCoordinateY()){
            updateLocationY(currentDirection);
        }
    }

    private void updateLocationY(String currentDirection) {
        if (currentDirection.equals("N")) {
            locationY++;
        }
        if (currentDirection.equals("S")){
            locationY--;
        }
    }

    private void updateLocationX(String currentDirection) {
        if (currentDirection.equals("E")) {
            locationX++;
        }
        if (currentDirection.equals("W")){
            locationX--;
        }
    }

    private boolean isCoordinateX() {
        return currentDirection.equals("E") || currentDirection.equals("W");
    }

    private boolean isCoordinateY() {
        return currentDirection.equals("N") || currentDirection.equals("S");
    }

    public int getLocationX() {
        return locationX;
    }

    public int getLocationY() {
        return locationY;
    }

    public String getCurrentDirection() {
        return currentDirection;
    }
}
