package com.afs.tdd.MarsRover;

public class MarsRover implements MarsRoverActions {
    public static final String NORTH = "N";
    public static final String SOUTH = "S";
    public static final String EAST = "E";
    public static final String WEST = "W";
    public static final String RIGHT = "Right";
    public static final String LEFT = "Left";
    public static final String MOVE = "M";
    public static final String TURN_LEFT = "L";
    public static final String TURN_RIGHT = "R";
    private int positionX;
    private int positionY;
    private String direction;

    public MarsRover(int positionX, int positionY, String direction) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.direction = direction;
    }

    private String getUpdateDirection(String turnDirection) {
        switch (direction) {
            case NORTH: return turnDirection.equals(RIGHT) ? EAST : WEST;
            case SOUTH: return turnDirection.equals(RIGHT) ? WEST : EAST;
            case EAST: return turnDirection.equals(RIGHT) ? SOUTH : NORTH;
            case WEST: return turnDirection.equals(RIGHT) ? NORTH : SOUTH;
        }
        throw new RuntimeException();
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public String getDirection() {
        return direction;
    }

    @Override
    public void move() {
        updateMarsRover();
    }

    @Override
    public void turnLeft() {
        this.direction = getUpdateDirection(LEFT);
    }

    @Override
    public void turnRight() {
        this.direction = getUpdateDirection(RIGHT);
    }

    private void updateWest(String turnDirection) {
        if(direction.equals(WEST)){
            this.direction = turnDirection.equals(RIGHT) ? NORTH : SOUTH;
        }
    }

    private void updateEast(String turnDirection) {
        if(direction.equals(EAST)){
            this.direction = turnDirection.equals(RIGHT) ? SOUTH : NORTH;
        }
    }

    private void updateSouth(String turnDirection) {
        if(direction.equals(SOUTH)){
            this.direction = turnDirection.equals(RIGHT) ? WEST : EAST;
        }
    }

    private void updateNorth(String turnDirection) {
        if(direction.equals(NORTH)){
            this.direction = turnDirection.equals(RIGHT) ? EAST : WEST;
        }
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

    public void executeMovementInstruction(String command) {
        if(!isCommandValid(command)){
            throw new CommandNotDefinedException();
        }
        moveCommand(command);
        turnRightCommand(command);
        turnLeftCommand(command);

    }

    private void moveCommand(String command) {
        if(command.equals(MOVE)){
            move();
        }
    }

    private void turnLeftCommand(String command) {
        if(command.equals(TURN_LEFT)){
            turnLeft();
        }
    }

    private void turnRightCommand(String command) {
        if(command.equals(TURN_RIGHT)){
            turnRight();
        }
    }

    public boolean isCommandValid(String command) {
        return command.equals(MOVE) || command.equals(TURN_LEFT) || command.equals(TURN_RIGHT);
    }
}
