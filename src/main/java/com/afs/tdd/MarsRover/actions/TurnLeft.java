package com.afs.tdd.MarsRover.actions;

import com.afs.tdd.MarsRover.CommandExecutor;
import com.afs.tdd.MarsRover.MarsRoverCommand;

public class TurnLeft implements CommandExecutor {

    MarsRoverCommand marsRoverCommand;

    public TurnLeft(MarsRoverCommand marsRoverCommand) {
        this.marsRoverCommand = marsRoverCommand;
    }

    @Override
    public void execute() {
        marsRoverCommand.turnLeft();
    }
}
