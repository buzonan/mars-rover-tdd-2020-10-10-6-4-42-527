package com.afs.tdd.MarsRover;

public class MarsRoverActionHandler {
    MarsRoverExecute marsRoverExecute;

    public MarsRoverActionHandler(MarsRoverExecute marsRoverExecute) {
        this.marsRoverExecute = marsRoverExecute;
    }

    public void move(){
        marsRoverExecute.execute();
    }
}
