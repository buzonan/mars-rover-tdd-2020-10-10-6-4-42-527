package com.afs.tdd.MarsRover.movements;

import com.afs.tdd.MarsRover.Command;
import com.afs.tdd.MarsRover.MarsRoverShips;

public class Move implements Command {

    MarsRoverShips marsRoverShips;

    public Move(MarsRoverShips marsRoverShips) {
        this.marsRoverShips = marsRoverShips;
    }

    @Override
    public void execute() {
        marsRoverShips.move();
    }
}
