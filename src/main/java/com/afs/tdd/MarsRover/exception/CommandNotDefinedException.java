package com.afs.tdd.MarsRover.exception;

public class CommandNotDefinedException extends RuntimeException {
    public CommandNotDefinedException() {
        super("Invalid Command");
    }
}
