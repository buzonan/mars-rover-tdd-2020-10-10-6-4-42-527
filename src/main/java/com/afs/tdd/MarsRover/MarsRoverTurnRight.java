package com.afs.tdd.MarsRover;

public class MarsRoverTurnRight implements MarsRoverExecute{

    MarsRoverActions marsRoverActions;

    public MarsRoverTurnRight(MarsRoverActions marsRoverActions) {
        this.marsRoverActions = marsRoverActions;
    }

    @Override
    public void execute() {
        marsRoverActions.turnRight();
    }
}
