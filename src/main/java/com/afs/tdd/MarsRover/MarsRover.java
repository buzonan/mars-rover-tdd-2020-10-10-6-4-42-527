package com.afs.tdd.MarsRover;

import com.afs.tdd.MarsRover.enums.Direction;

public class MarsRover implements MarsRoverCommand {
    private int positionX;
    private int positionY;
    private Direction direction;

    public MarsRover(int positionX, int positionY, Direction direction) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.direction = direction;
    }

    @Override
    public void move() {
        updatePositionY();
        updatePositionX();
    }

    @Override
    public void turnLeft() {
        int directionIndex = getDirectionUpdate();
        direction = getTurnLeftDirection(directionIndex);
    }

    @Override
    public void turnRight() {
        int directionIndex = getDirectionUpdate();
        direction = getTurnRightDirection(directionIndex);
    }

    private Direction getTurnRightDirection(int directionIndex) {
        if(IsDirectionLastIndex(directionIndex)){
            return Direction.NORTH;
        }
        return Direction.values()[++directionIndex];
    }

    private boolean IsDirectionLastIndex(int directionOrdinal) {
        return directionOrdinal == Direction.values().length-1;
    }

    private boolean isDirectionFirstIndex(int directionOrdinal) {
        return directionOrdinal == 0;
    }

    private Direction getTurnLeftDirection(int directionIndex) {
        if(isDirectionFirstIndex(directionIndex)){
            return Direction.WEST;
        }
        return Direction.values()[--directionIndex];
    }

    private int getDirectionUpdate() {
        return direction.ordinal();
    }

    private void updatePositionX() {
        if(!isCoordinateX()){
            return;
        }
        positionX = (direction.equals(Direction.EAST)) ? ++positionX : --positionX;
    }

    private void updatePositionY() {
        if(!isCoordinateY()){
            return;
        }
        positionY = (direction.equals(Direction.NORTH)) ? ++positionY : --positionY;
    }

    private boolean isCoordinateY() {
        return direction.equals(Direction.NORTH) || direction.equals(Direction.SOUTH);
    }

    private boolean isCoordinateX() {
        return direction.equals(Direction.EAST) || direction.equals(Direction.WEST);
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public Direction getDirection() {
        return direction;
    }
}
