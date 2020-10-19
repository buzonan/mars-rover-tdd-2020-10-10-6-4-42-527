package com.afs.tdd.MarsRover;

public class MarsRoverConsole {
    Command command;

    public MarsRoverConsole(Command command) {
        this.command = command;
    }

    public void executeAction(){
        command.execute();
    }
}
