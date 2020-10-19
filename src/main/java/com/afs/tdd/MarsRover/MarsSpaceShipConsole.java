package com.afs.tdd.MarsRover;

public class MarsSpaceShipConsole {
    Command command;

    public MarsSpaceShipConsole(Command command) {
        this.command = command;
    }

    public void executeAction(){
        command.execute();
    }
}
