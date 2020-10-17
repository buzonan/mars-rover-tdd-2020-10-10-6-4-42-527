package com.afs.tdd.MarsRover;

public class MarsRoverModel implements MarsRoverActions {
    public static final String NORTH = "N";
    public static final String SOUTH = "S";
    public static final String EAST = "E";
    public static final String WEST = "W";
    private int positionX;
    private int positionY;
    private String direction;

    public MarsRoverModel(int positionX, int positionY, String direction) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.direction = direction;
    }

    @Override
    public void move() {

    }

    @Override
    public void turnLeft() {

    }

    @Override
    public void turnRight() {

    }

    private void updateMarsRover() {
        updateNorthSouthDirection();
        updateEastWestDirection();


    }

    private void updateEastWestDirection() {
        if(isEastWestDirection()){
            this.positionX = direction.equals(EAST) ? ++positionX : --positionX;
        }
    }

    private boolean isEastWestDirection() {
        return direction.equals(EAST) || direction.equals(WEST);
    }

    private void updateNorthSouthDirection() {
        if(isNorthSouth(direction)){
            this.positionY = direction.equals(NORTH) ? ++positionY : --positionY;
        }
    }

    private boolean isNorthSouth(String direction) {
        return direction.equals(NORTH) || direction.equals(SOUTH);
    }


}
