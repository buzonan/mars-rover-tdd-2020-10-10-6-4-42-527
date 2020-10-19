package com.afs.tdd.MarsRover.movements;

import com.afs.tdd.MarsRover.Command;
import com.afs.tdd.MarsRover.MarsRoverShips;

public class TurnRight implements Command {

    MarsRoverShips marsRoverShips;

    public TurnRight(MarsRoverShips marsRoverShips) {
        this.marsRoverShips = marsRoverShips;
    }

    @Override
    public void execute() {
        marsRoverShips.turnRight();
    }
}
