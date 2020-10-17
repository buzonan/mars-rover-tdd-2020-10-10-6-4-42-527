package com.afs.tdd.MarsRover;

public class MarsRoverTurnLeft implements MarsRoverExecute{

    MarsRoverActions marsRoverActions;

    public MarsRoverTurnLeft(MarsRoverActions marsRoverActions) {
        this.marsRoverActions = marsRoverActions;
    }

    @Override
    public void execute() {
        marsRoverActions.turnLeft();
    }
}
