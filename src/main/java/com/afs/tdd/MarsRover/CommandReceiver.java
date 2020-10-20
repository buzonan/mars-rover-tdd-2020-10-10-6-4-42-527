package com.afs.tdd.MarsRover;

import com.afs.tdd.MarsRover.actions.Move;
import com.afs.tdd.MarsRover.actions.TurnLeft;
import com.afs.tdd.MarsRover.actions.TurnRight;
import com.afs.tdd.MarsRover.enums.Action;
import com.afs.tdd.MarsRover.exception.CommandNotDefinedException;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CommandReceiver {

    Map<String, CommandExecutor> marsRoverCommandActionMap = new HashMap<>();
    CommandInvoker commandInvoker;

    public CommandReceiver(MarsRover marsRover) {
        marsRoverCommandActionMap.put(Action.MOVE.getAction(), new Move(marsRover));
        marsRoverCommandActionMap.put(Action.LEFT.getAction(), new TurnLeft(marsRover));
        marsRoverCommandActionMap.put(Action.RIGHT.getAction(), new TurnRight(marsRover));
    }


    private void validateMovementCommand(String command) throws CommandNotDefinedException {
        if(Arrays.stream(Action.values()).anyMatch(action -> command.contains(action.getAction()))){
            return;
        }
        throw new CommandNotDefinedException();
    }

    public void sendMarsRoverCommand(String commands) throws CommandNotDefinedException {
        validateMovementCommand(commands);
        String EMPTY_STRING = "";
        String[] commandList = commands.split(EMPTY_STRING);
        for(String command : commandList){
            commandInvoker = new CommandInvoker(marsRoverCommandActionMap.get(command));
            commandInvoker.executeAction();
        }
    }
}
