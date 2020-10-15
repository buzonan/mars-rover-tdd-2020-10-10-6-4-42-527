package com.afs.tdd;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MarsRover {

    public static final String NORTH = "N";
    public static final String SOUTH = "S";
    public static final String EAST = "E";
    public static final String WEST = "W";
    public static final String MOVE = "M";
    public static final String LEFT = "L";
    public static final String RIGHT = "R";
    public static final int FIRST_INDEX = 0;
    private int locationX;
    private int locationY;
    private String currentDirection;


    private String[] movementList = new String[]{MOVE, LEFT, RIGHT};
    private String[] directionList = new String[]{NORTH, EAST, SOUTH, WEST};

    public MarsRover(int locationX, int locationY, String currentDirection) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.currentDirection = currentDirection;
    }

    public boolean validateMovementInstruction(String movementInstruction) {
        return Arrays.stream(movementList).anyMatch(movement->movement.equals(movementInstruction));
    }

    public void executeMovementInstruction(String movementInstruction) {
        if(movementInstruction.equals(MOVE)){
            move();
        }
        if(movementInstruction.equals(LEFT)){
            turnLeft();
        }
        if(movementInstruction.equals(RIGHT)){
            turnRight();
        }
    }

    private void turnRight() {
        int directionIndex = IntStream.range(FIRST_INDEX, directionList.length)
                .filter(index-> directionList[index].equals(currentDirection))
                .map(direction->{
                    if(direction == directionList.length-1){
                        return FIRST_INDEX;
                    }
                    return ++direction;
                })
                .findFirst()
                .orElse(-1);

        currentDirection = directionList[directionIndex];
    }

    private void turnLeft() {
        int directionIndex = IntStream.range(FIRST_INDEX, directionList.length)
                .filter(index-> directionList[index].equals(currentDirection))
                .map(direction->{
                    if(direction == FIRST_INDEX){
                        return directionList.length-1;
                    }
                    return --direction;
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
        if (currentDirection.equals(NORTH)) {
            locationY++;
        }
        if (currentDirection.equals(SOUTH)){
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
