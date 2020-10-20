package com.afs.tdd.MarsRover;

public class CommandInvoker {
    CommandExecutor commandExecutor;

    public CommandInvoker(CommandExecutor commandExecutor) {
        this.commandExecutor = commandExecutor;
    }

    public void executeAction(){
        commandExecutor.execute();
    }
}
