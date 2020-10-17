package com.afs.tdd.MarsRover;

public class MarsRoverMove implements MarsRoverExecute{

    MarsRoverActions marsRoverActions;

    public MarsRoverMove(MarsRoverActions marsRoverActions) {
        this.marsRoverActions = marsRoverActions;
    }

    @Override
    public void execute() {
        marsRoverActions.move();
    }
}
