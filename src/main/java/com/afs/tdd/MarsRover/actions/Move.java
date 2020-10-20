package com.afs.tdd.MarsRover.actions;

import com.afs.tdd.MarsRover.CommandExecutor;
import com.afs.tdd.MarsRover.MarsRoverCommand;

public class Move implements CommandExecutor {

    MarsRoverCommand marsRoverCommand;

    public Move(MarsRoverCommand marsRoverCommand) {
        this.marsRoverCommand = marsRoverCommand;
    }

    @Override
    public void execute() {
        marsRoverCommand.move();
    }
}
