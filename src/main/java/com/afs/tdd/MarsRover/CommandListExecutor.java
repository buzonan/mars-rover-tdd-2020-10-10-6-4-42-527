package com.afs.tdd.MarsRover;

import com.afs.tdd.MarsRover.movements.Move;
import com.afs.tdd.MarsRover.movements.TurnLeft;
import com.afs.tdd.MarsRover.movements.TurnRight;
import com.afs.tdd.MarsRover.standard.Movement;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CommandListExecutor {

    Map<String, Command> marsRoverMovementMap = new HashMap<>();
    MarsSpaceShipConsole marsSpaceShipConsole;
    public CommandListExecutor(MarsRover marsRover) {
        marsRoverMovementMap.put(Movement.MOVE.getAction(), new Move(marsRover));
        marsRoverMovementMap.put(Movement.LEFT.getAction(), new TurnLeft(marsRover));
        marsRoverMovementMap.put(Movement.RIGHT.getAction(), new TurnRight(marsRover));
    }


    private void validateMovementCommand(String command) throws CommandNotDefinedException {
        if(Arrays.stream(Movement.values()).anyMatch(movement -> command.contains(movement.getAction()))){
            return;
        }
        throw new CommandNotDefinedException();
    }

    public void sendMarsRoverCommand(String commands) throws CommandNotDefinedException {
        validateMovementCommand(commands);
        String EMPTY_STRING = "";
        String[] commandList = commands.split(EMPTY_STRING);
        for(String command : commandList){
            marsSpaceShipConsole = new MarsSpaceShipConsole(marsRoverMovementMap.get(command));
            marsSpaceShipConsole.executeAction();
        }
    }
}
