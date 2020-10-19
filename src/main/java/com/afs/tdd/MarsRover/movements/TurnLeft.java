package com.afs.tdd.MarsRover.movements;

import com.afs.tdd.MarsRover.Command;
import com.afs.tdd.MarsRover.MarsRoverShips;

public class TurnLeft implements Command {

    MarsRoverShips marsRoverShips;

    public TurnLeft(MarsRoverShips marsRoverShips) {
        this.marsRoverShips = marsRoverShips;
    }

    @Override
    public void execute() {
        marsRoverShips.turnLeft();
    }
}
