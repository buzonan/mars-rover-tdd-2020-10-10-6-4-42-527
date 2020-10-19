package com.afs.tdd.MarsRover;

public class CommandNotDefinedException extends RuntimeException {
    public CommandNotDefinedException() {
        super("Invalid Command");
    }
}
