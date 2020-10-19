package com.afs.tdd;

import com.afs.tdd.MarsRover.CommandListExecutor;
import com.afs.tdd.MarsRover.CommandNotDefinedException;
import com.afs.tdd.MarsRover.MarsRover;
import com.afs.tdd.MarsRover.standard.Direction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MarsRoverTest {

    @Test
    void should_return_true_when_validate_movement_instructions_given_command_MLMR() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, Direction.NORTH);
        CommandListExecutor commandListExecutor = new CommandListExecutor(marsRover);

        String command = "MLMR";

        //when
        commandListExecutor.sendMarsRoverCommand(command);

        //then
        assertEquals(1,marsRover.getPositionY());
        assertEquals(-1,marsRover.getPositionX());
        assertEquals(Direction.NORTH, marsRover.getDirection());

    }
    @Test
    void should_return_CommandNotDefinedException_when_sendMarsRoverCommand_given_command_P(){
        //given
        String command = "P";

        //when
        MarsRover marsRover = new MarsRover(0, 0, Direction.NORTH);
        CommandListExecutor commandListExecutor = new CommandListExecutor(marsRover);


        //then
        assertThrows(CommandNotDefinedException.class, () -> commandListExecutor.sendMarsRoverCommand(command));
    }

    @Test
    void should_return_y_1_when_sendMarsRoverCommand_given_x_0_y_0_direction_NORTH_and_command_M() {
        //given
        String command = "M";
        MarsRover marsRover = new MarsRover(0, 0, Direction.NORTH);
        CommandListExecutor commandListExecutor = new CommandListExecutor(marsRover);

        //when
        commandListExecutor.sendMarsRoverCommand(command);

        //then
        assertEquals(1,marsRover.getPositionY());
        assertEquals(0,marsRover.getPositionX());
        assertEquals(Direction.NORTH,marsRover.getDirection());
    }

    @Test
    void should_return_y_negative_1_when_sendMarsRoverCommand_given_x_0_y_0_direction_S_and_command_M() {
        //given
        String command = "M";
        MarsRover marsRover = new MarsRover(0, 0, Direction.SOUTH);
        CommandListExecutor commandListExecutor = new CommandListExecutor(marsRover);

        //when
        commandListExecutor.sendMarsRoverCommand(command);

        //then
        assertEquals(-1,marsRover.getPositionY());
        assertEquals(0,marsRover.getPositionX());
        assertEquals(Direction.SOUTH, marsRover.getDirection());

    }

    @Test
    void should_return_x_1_when_sendMarsRoverCommand_given_x_0_y_0_direction_E_and_command_M() {
        //given
        String command = "M";
        MarsRover marsRover = new MarsRover(0, 0, Direction.EAST);
        CommandListExecutor commandListExecutor = new CommandListExecutor(marsRover);

        //when
        commandListExecutor.sendMarsRoverCommand(command);

        //then
        assertEquals(0,marsRover.getPositionY());
        assertEquals(1,marsRover.getPositionX());
        assertEquals(Direction.EAST, marsRover.getDirection());

    }

    @Test
    void should_return_x_negative_1_when_sendMarsRoverCommand_given_x_0_y_0_direction_E_and_command_M() {
        //given
        String command = "M";
        MarsRover marsRover = new MarsRover(0, 0, Direction.EAST);
        CommandListExecutor commandListExecutor = new CommandListExecutor(marsRover);


        //when
        commandListExecutor.sendMarsRoverCommand(command);

        //then
        assertEquals(1,marsRover.getPositionX());
        assertEquals(0,marsRover.getPositionY());
        assertEquals(Direction.EAST, marsRover.getDirection());

    }

    @Test
    void should_return_direction_WEST_when_sendMarsRoverCommand_given_x_0_y_0_direction_N_and_command_L() {
        //given
        String command = "L";
        MarsRover marsRover = new MarsRover(0, 0, Direction.NORTH);
        CommandListExecutor commandListExecutor = new CommandListExecutor(marsRover);

        //when
        commandListExecutor.sendMarsRoverCommand(command);

        //then
        assertEquals(0,marsRover.getPositionY());
        assertEquals(0,marsRover.getPositionX());
        assertEquals(Direction.WEST, marsRover.getDirection());
    }

    @Test
    void should_return_direction_NORTH_when_sendMarsRoverCommand_given_x_0_y_0_direction_E_and_command_L() {
        //given
        String command = "L";
        MarsRover marsRover = new MarsRover(0, 0, Direction.EAST);
        CommandListExecutor commandListExecutor = new CommandListExecutor(marsRover);

        //when
        commandListExecutor.sendMarsRoverCommand(command);

        //then
        assertEquals(0,marsRover.getPositionY());
        assertEquals(0,marsRover.getPositionX());
        assertEquals(Direction.NORTH, marsRover.getDirection());
    }

    @Test
    void should_return_direction_E_when_sendMarsRoverCommand_given_x_0_y_0_direction_S_and_command_L() {
        //given
        String command = "L";
        MarsRover marsRover = new MarsRover(0, 0, Direction.SOUTH);
        CommandListExecutor commandListExecutor = new CommandListExecutor(marsRover);

        //when
        commandListExecutor.sendMarsRoverCommand(command);

        //then
        assertEquals(0,marsRover.getPositionY());
        assertEquals(0,marsRover.getPositionX());
        assertEquals(Direction.EAST, marsRover.getDirection());
    }

    @Test
    void should_return_direction_S_when_sendMarsRoverCommand_given_x_0_y_0_direction_W_and_command_L() {
        //given
        String command = "L";
        MarsRover marsRover = new MarsRover(0, 0, Direction.WEST);
        CommandListExecutor commandListExecutor = new CommandListExecutor(marsRover);

        //when
        commandListExecutor.sendMarsRoverCommand(command);

        //then
        assertEquals(0,marsRover.getPositionY());
        assertEquals(0,marsRover.getPositionX());
        assertEquals(Direction.SOUTH, marsRover.getDirection());
    }

    @Test
    void should_return_direction_E_when_sendMarsRoverCommand_given_x_0_y_0_direction_N_and_command_R() {
        //given
        String command = "R";
        MarsRover marsRover = new MarsRover(0, 0, Direction.NORTH);
        CommandListExecutor commandListExecutor = new CommandListExecutor(marsRover);

        //when
        commandListExecutor.sendMarsRoverCommand(command);


        //then
        assertEquals(0,marsRover.getPositionY());
        assertEquals(0,marsRover.getPositionX());
        assertEquals(Direction.EAST, marsRover.getDirection());
    }

    @Test
    void should_return_direction_S_when_sendMarsRoverCommand_given_x_0_y_0_direction_E_and_command_R() {
        //given
        String command = "R";
        MarsRover marsRover = new MarsRover(0, 0, Direction.EAST);
        CommandListExecutor commandListExecutor = new CommandListExecutor(marsRover);

        //when
        commandListExecutor.sendMarsRoverCommand(command);


        //then
        assertEquals(0,marsRover.getPositionY());
        assertEquals(0,marsRover.getPositionX());
        assertEquals(Direction.SOUTH, marsRover.getDirection());
    }

    @Test
    void should_return_direction_W_when_sendMarsRoverCommand_given_x_0_y_0_direction_S_and_command_R() {
        //given
        String command = "R";
        MarsRover marsRover = new MarsRover(0, 0, Direction.SOUTH);
        CommandListExecutor commandListExecutor = new CommandListExecutor(marsRover);

        //when
        commandListExecutor.sendMarsRoverCommand(command);


        //then
        assertEquals(0,marsRover.getPositionY());
        assertEquals(0,marsRover.getPositionX());
        assertEquals(Direction.WEST, marsRover.getDirection());
    }

    @Test
    void should_return_direction_N_when_sendMarsRoverCommand_given_x_0_y_0_direction_W_and_command_R(){
        //given
        String command = "R";
        MarsRover marsRover = new MarsRover(0, 0, Direction.WEST);
        CommandListExecutor commandListExecutor = new CommandListExecutor(marsRover);

        //when
        commandListExecutor.sendMarsRoverCommand(command);


        //then
        assertEquals(0,marsRover.getPositionY());
        assertEquals(0,marsRover.getPositionX());
        assertEquals(Direction.NORTH, marsRover.getDirection());
    }


}