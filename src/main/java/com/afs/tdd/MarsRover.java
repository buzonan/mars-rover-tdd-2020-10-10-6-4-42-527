package com.afs.tdd;

import java.util.Arrays;
import java.util.List;

public class MarsRover {

    private int locationX;
    private int locationY;
    private String currentDirection;
    private String[] movementList = new String[]{"M", "L", "R"};

    public MarsRover(int locationX, int locationY, String currentDirection) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.currentDirection = currentDirection;
    }

    public boolean validateMovementInstructions(String movementInstruction) {
        return Arrays.stream(movementList).anyMatch(movement->movement.equals(movementInstruction));
    }

    public int getLocationX() {
        return locationX;
    }

    public void setLocationX(int locationX) {
        this.locationX = locationX;
    }

    public int getLocationY() {
        return locationY;
    }

    public void setLocationY(int locationY) {
        this.locationY = locationY;
    }

    public String getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(String currentDirection) {
        this.currentDirection = currentDirection;
    }

}
