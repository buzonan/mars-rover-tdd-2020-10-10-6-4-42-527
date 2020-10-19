package com.afs.tdd.MarsRover;

import com.afs.tdd.MarsRover.standard.Direction;

public class MarsRover implements MarsRoverShips {
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

    }

    @Override
    public void turnRight() {

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
