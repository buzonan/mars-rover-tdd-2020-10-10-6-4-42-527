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
//
//    @Test
//    void should_return_y_1_when_execute_movement_instruction_given_x_0_y_0_direction_N_and_movement_instruction_M() {
//        //given
//        List<String> movementInstruction = new ArrayList<>();
//        movementInstruction.add("M");
//
//        Commands commands = new Commands(movementInstruction);
//
//        //when
//        MarsRover marsRover = new MarsRover(0, 0, "N");
//
//        Move moveCommand = new Move(marsRover);
//
//        MarsSpaceShipConsole marsSpaceShipConsole = new MarsSpaceShipConsole(moveCommand);
//
//        marsSpaceShipConsole.executeAction();
//
//        //then
//        assertEquals(1,marsRover.getPositionY());
//        assertEquals(0,marsRover.getPositionX());
//        assertEquals("N",marsRover.getDirection());
//
//    }
//
//    @Test
//    void should_return_y_negative_1_when_execute_movement_instruction_given_x_0_y_0_direction_S_and_movement_instruction_M() {
//        //given
//        List<String> movementInstruction = new ArrayList<>();
//        movementInstruction.add("M");
//
//        Commands commands = new Commands(movementInstruction);
//        //when
//        MarsRover marsRover = new MarsRover(0, 0, "S");
//        commands.getCommandList().forEach(command-> {
//            try {
//                marsRover.executeMovementInstruction(command);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        });
//        //then
//        assertEquals(-1,marsRover.getPositionY());
//        assertEquals(0,marsRover.getPositionX());
//        assertEquals("S",marsRover.getDirection());
//
//    }
//
//    @Test
//    void should_return_x_1_when_execute_movement_instruction_given_x_0_y_0_direction_E_and_movement_instruction_M() {
//        //given
//        List<String> movementInstruction = new ArrayList<>();
//        movementInstruction.add("M");
//
//        Commands commands = new Commands(movementInstruction);
//
//        //when
//        MarsRover marsRover = new MarsRover(0, 0, "E");
//        commands.getCommandList().forEach(command-> {
//            try {
//                marsRover.executeMovementInstruction(command);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        });
//
//        //then
//        assertEquals(0,marsRover.getPositionY());
//        assertEquals(1,marsRover.getPositionX());
//        assertEquals("E",marsRover.getDirection());
//
//    }
//
//    @Test
//    void should_return_x_negative_1_when_execute_movement_instruction_given_x_0_y_0_direction_E_and_movement_instruction_M() {
//        //given
//        List<String> movementInstruction = new ArrayList<>();
//        movementInstruction.add("M");
//
//        Commands commands = new Commands(movementInstruction);
//
//        //when
//        MarsRover marsRover = new MarsRover(0, 0, "W");
//        commands.getCommandList().forEach(command-> {
//            try {
//                marsRover.executeMovementInstruction(command);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        });
//
//        //then
//        assertEquals(-1,marsRover.getPositionX());
//        assertEquals(0,marsRover.getPositionY());
//        assertEquals("W",marsRover.getDirection());
//
//    }
//
//    @Test
//    void should_return_direction_W_when_execute_movement_instruction_given_x_0_y_0_direction_N_and_movement_instruction_L() {
//        //given
//        List<String> movementInstruction = new ArrayList<>();
//        movementInstruction.add("L");
//
//        Commands commands = new Commands(movementInstruction);
//
//
//        //when
//        MarsRover marsRover = new MarsRover(0, 0, "N");
//        commands.getCommandList().forEach(command-> {
//            try {
//                marsRover.executeMovementInstruction(command);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        });
//
//        //then
//        assertEquals(0,marsRover.getPositionY());
//        assertEquals(0,marsRover.getPositionX());
//        assertEquals("W",marsRover.getDirection());
//    }
//
//    @Test
//    void should_return_direction_N_when_execute_movement_instruction_given_x_0_y_0_direction_E_and_movement_instruction_L() {
//        //given
//        List<String> movementInstruction = new ArrayList<>();
//        movementInstruction.add("L");
//
//        Commands commands = new Commands(movementInstruction);
//
//        //when
//        MarsRover marsRover = new MarsRover(0, 0, "E");
//        commands.getCommandList().forEach(command-> {
//            try {
//                marsRover.executeMovementInstruction(command);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        });
//
//        //then
//        assertEquals(0,marsRover.getPositionY());
//        assertEquals(0,marsRover.getPositionX());
//        assertEquals("N",marsRover.getDirection());
//    }
//
//    @Test
//    void should_return_direction_E_when_execute_movement_instruction_given_x_0_y_0_direction_S_and_movement_instruction_L() {
//        //given
//        List<String> movementInstruction = new ArrayList<>();
//        movementInstruction.add("L");
//
//        Commands commands = new Commands(movementInstruction);
//
//        //when
//        MarsRover marsRover = new MarsRover(0, 0, "S");
//        commands.getCommandList().forEach(command-> {
//            try {
//                marsRover.executeMovementInstruction(command);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        });
//
//        //then
//        assertEquals(0,marsRover.getPositionY());
//        assertEquals(0,marsRover.getPositionX());
//        assertEquals("E",marsRover.getDirection());
//    }
//
//    @Test
//    void should_return_direction_S_when_execute_movement_instruction_given_x_0_y_0_direction_W_and_movement_instruction_L() {
//        //given
//        List<String> movementInstruction = new ArrayList<>();
//        movementInstruction.add("L");
//
//        Commands commands = new Commands(movementInstruction);
//
//        //when
//        MarsRover marsRover = new MarsRover(0, 0, "W");
//        commands.getCommandList().forEach(command-> {
//            try {
//                marsRover.executeMovementInstruction(command);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        });
//
//        //then
//        assertEquals(0,marsRover.getPositionY());
//        assertEquals(0,marsRover.getPositionX());
//        assertEquals("S",marsRover.getDirection());
//    }
//
//    @Test
//    void should_return_direction_E_when_execute_movement_instruction_given_x_0_y_0_direction_N_and_movement_instruction_R() {
//        //given
//        List<String> movementInstruction = new ArrayList<>();
//        movementInstruction.add("R");
//
//        Commands commands = new Commands(movementInstruction);
//
//        //when
//        MarsRover marsRover = new MarsRover(0, 0, "N");
//        commands.getCommandList().forEach(command-> {
//            try {
//                marsRover.executeMovementInstruction(command);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        });
//
//        //then
//        assertEquals(0,marsRover.getPositionY());
//        assertEquals(0,marsRover.getPositionX());
//        assertEquals("E",marsRover.getDirection());
//    }
//
//    @Test
//    void should_return_direction_S_when_execute_movement_instruction_given_x_0_y_0_direction_E_and_movement_instruction_R() {
//        //given
//        List<String> movementInstruction = new ArrayList<>();
//        movementInstruction.add("R");
//
//        Commands commands = new Commands(movementInstruction);
//
//        //when
//        MarsRover marsRover = new MarsRover(0, 0, "E");
//        commands.getCommandList().forEach(command-> {
//            try {
//                marsRover.executeMovementInstruction(command);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        });
//
//        //then
//        assertEquals(0,marsRover.getPositionY());
//        assertEquals(0,marsRover.getPositionX());
//        assertEquals("S",marsRover.getDirection());
//    }
//
//    @Test
//    void should_return_direction_W_when_execute_movement_instruction_given_x_0_y_0_direction_S_and_movement_instruction_R() {
//        //given
//        List<String> movementInstruction = new ArrayList<>();
//        movementInstruction.add("R");
//
//        Commands commands = new Commands(movementInstruction);
//
//        //when
//        MarsRover marsRover = new MarsRover(0, 0, "S");
//        commands.getCommandList().forEach(command-> {
//            try {
//                marsRover.executeMovementInstruction(command);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        });
//
//        //then
//        assertEquals(0,marsRover.getPositionY());
//        assertEquals(0,marsRover.getPositionX());
//        assertEquals("W",marsRover.getDirection());
//    }
//
//    @Test
//    void should_return_direction_N_when_execute_movement_instruction_given_x_0_y_0_direction_W_and_movement_instruction_R(){
//        //given
//        List<String> movementInstruction = new ArrayList<>();
//        movementInstruction.add("R");
//
//        Commands commands = new Commands(movementInstruction);
//
//        //when
//        MarsRover marsRover = new MarsRover(0, 0, "W");
//        commands.getCommandList().forEach(command-> {
//            try {
//                marsRover.executeMovementInstruction(command);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        });
//
//        //then
//        assertEquals(0,marsRover.getPositionY());
//        assertEquals(0,marsRover.getPositionX());
//        assertEquals("N",marsRover.getDirection());
//    }
//

}