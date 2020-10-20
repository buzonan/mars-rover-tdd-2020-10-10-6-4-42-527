package com.afs.tdd.MarsRover.actions;

import com.afs.tdd.MarsRover.CommandExecutor;
import com.afs.tdd.MarsRover.MarsRoverCommand;

public class TurnRight implements CommandExecutor {

    MarsRoverCommand marsRoverCommand;

    public TurnRight(MarsRoverCommand marsRoverCommand) {
        this.marsRoverCommand = marsRoverCommand;
    }

    @Override
    public void execute() {
        marsRoverCommand.turnRight();
    }
}
