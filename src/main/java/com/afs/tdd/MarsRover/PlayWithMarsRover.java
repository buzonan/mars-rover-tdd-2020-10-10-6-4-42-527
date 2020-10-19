package com.afs.tdd.MarsRover;

import com.afs.tdd.MarsRover.movements.TurnRight;
import com.afs.tdd.MarsRover.standard.Direction;

public class PlayWithMarsRover {
    public static void main(String[] args) {
        MarsRover marsRover = new MarsRover(0, 0, Direction.WEST);

        TurnRight turnRightCommand = new TurnRight(marsRover);

        MarsSpaceShipConsole marsSpaceShipConsole = new MarsSpaceShipConsole(turnRightCommand);

        marsSpaceShipConsole.executeAction();

        System.out.println(marsRover.getDirection());
    }
}
