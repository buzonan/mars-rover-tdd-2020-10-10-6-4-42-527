package com.afs.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MarsRoverTest {
    @Test
    void should_return_true_when_validate_movement_instructions_given_movement_instruction_M() throws Exception {
        //given
        String movementInstruction = "M";

        //when
        MarsRover marsRover = new MarsRover(0, 0, "N");

        //then
        assertTrue(marsRover.validateMovementInstruction(movementInstruction));

    }
    @Test
    void should_return_false_when_validate_movement_instructions_given_movement_instruction_B() throws Exception {
        //given
        String movementInstruction = "B";

        //when
        MarsRover marsRover = new MarsRover(0, 0, "N");

        //then
        assertFalse(marsRover.validateMovementInstruction(movementInstruction));

    }

    @Test
    void should_return_y_1_when_execute_movement_instruction_given_x_0_y_0_direction_N_and_movement_instruction_M() throws Exception {
        //given
        String movementInstruction = "M";

        //when
        MarsRover marsRover = new MarsRover(0, 0, "N");
        marsRover.executeMovementInstruction(movementInstruction);

        //then
        assertEquals(1,marsRover.getLocationY());
        assertEquals(0,marsRover.getLocationX());
        assertEquals("N",marsRover.getCurrentDirection());

    }

    @Test
    void should_return_y_negative_1_when_execute_movement_instruction_given_x_0_y_0_direction_S_and_movement_instruction_M() throws Exception {
        //given
        String movementInstruction = "M";

        //when
        MarsRover marsRover = new MarsRover(0, 0, "S");
        marsRover.executeMovementInstruction(movementInstruction);

        //then
        assertEquals(-1,marsRover.getLocationY());
        assertEquals(0,marsRover.getLocationX());
        assertEquals("S",marsRover.getCurrentDirection());

    }

    @Test
    void should_return_x_1_when_execute_movement_instruction_given_x_0_y_0_direction_E_and_movement_instruction_M() throws Exception {
        //given
        String movementInstruction = "M";

        //when
        MarsRover marsRover = new MarsRover(0, 0, "E");
        marsRover.executeMovementInstruction(movementInstruction);

        //then
        assertEquals(0,marsRover.getLocationY());
        assertEquals(1,marsRover.getLocationX());
        assertEquals("E",marsRover.getCurrentDirection());

    }

    @Test
    void should_return_x_negative_1_when_execute_movement_instruction_given_x_0_y_0_direction_E_and_movement_instruction_M() throws Exception {
        //given
        String movementInstruction = "M";

        //when
        MarsRover marsRover = new MarsRover(0, 0, "W");
        marsRover.executeMovementInstruction(movementInstruction);

        //then
        assertEquals(-1,marsRover.getLocationX());
        assertEquals(0,marsRover.getLocationY());
        assertEquals("W",marsRover.getCurrentDirection());

    }

    @Test
    void should_return_direction_W_when_execute_movement_instruction_given_x_0_y_0_direction_N_and_movement_instruction_L() throws Exception {
        //given
        String movementInstruction = "L";

        //when
        MarsRover marsRover = new MarsRover(0, 0, "N");
        marsRover.executeMovementInstruction(movementInstruction);

        //then
        assertEquals(0,marsRover.getLocationY());
        assertEquals(0,marsRover.getLocationX());
        assertEquals("W",marsRover.getCurrentDirection());
    }

    @Test
    void should_return_direction_N_when_execute_movement_instruction_given_x_0_y_0_direction_E_and_movement_instruction_L() throws Exception {
        //given
        String movementInstruction = "L";

        //when
        MarsRover marsRover = new MarsRover(0, 0, "E");
        marsRover.executeMovementInstruction(movementInstruction);

        //then
        assertEquals(0,marsRover.getLocationY());
        assertEquals(0,marsRover.getLocationX());
        assertEquals("N",marsRover.getCurrentDirection());
    }

    @Test
    void should_return_direction_E_when_execute_movement_instruction_given_x_0_y_0_direction_S_and_movement_instruction_L() throws Exception {
        //given
        String movementInstruction = "L";

        //when
        MarsRover marsRover = new MarsRover(0, 0, "S");
        marsRover.executeMovementInstruction(movementInstruction);

        //then
        assertEquals(0,marsRover.getLocationY());
        assertEquals(0,marsRover.getLocationX());
        assertEquals("E",marsRover.getCurrentDirection());
    }

    @Test
    void should_return_direction_S_when_execute_movement_instruction_given_x_0_y_0_direction_W_and_movement_instruction_L() throws Exception {
        //given
        String movementInstruction = "L";

        //when
        MarsRover marsRover = new MarsRover(0, 0, "W");
        marsRover.executeMovementInstruction(movementInstruction);

        //then
        assertEquals(0,marsRover.getLocationY());
        assertEquals(0,marsRover.getLocationX());
        assertEquals("S",marsRover.getCurrentDirection());
    }

    @Test
    void should_return_direction_E_when_execute_movement_instruction_given_x_0_y_0_direction_N_and_movement_instruction_R() throws Exception {
        //given
        String movementInstruction = "R";

        //when
        MarsRover marsRover = new MarsRover(0, 0, "N");
        marsRover.executeMovementInstruction(movementInstruction);

        //then
        assertEquals(0,marsRover.getLocationY());
        assertEquals(0,marsRover.getLocationX());
        assertEquals("E",marsRover.getCurrentDirection());
    }

    @Test
    void should_return_direction_S_when_execute_movement_instruction_given_x_0_y_0_direction_E_and_movement_instruction_R() throws Exception {
        //given
        String movementInstruction = "R";

        //when
        MarsRover marsRover = new MarsRover(0, 0, "E");
        marsRover.executeMovementInstruction(movementInstruction);

        //then
        assertEquals(0,marsRover.getLocationY());
        assertEquals(0,marsRover.getLocationX());
        assertEquals("S",marsRover.getCurrentDirection());
    }

    @Test
    void should_return_direction_W_when_execute_movement_instruction_given_x_0_y_0_direction_S_and_movement_instruction_R() throws Exception {
        //given
        String movementInstruction = "R";

        //when
        MarsRover marsRover = new MarsRover(0, 0, "S");
        marsRover.executeMovementInstruction(movementInstruction);

        //then
        assertEquals(0,marsRover.getLocationY());
        assertEquals(0,marsRover.getLocationX());
        assertEquals("W",marsRover.getCurrentDirection());
    }

    @Test
    void should_return_direction_N_when_execute_movement_instruction_given_x_0_y_0_direction_W_and_movement_instruction_R() throws Exception {
        //given
        String movementInstruction = "R";

        //when
        MarsRover marsRover = new MarsRover(0, 0, "W");
        marsRover.executeMovementInstruction(movementInstruction);

        //then
        assertEquals(0,marsRover.getLocationY());
        assertEquals(0,marsRover.getLocationX());
        assertEquals("N",marsRover.getCurrentDirection());
    }

    @Test
    void should_return_exception_when_execute_movement_instruction_given_x_0_y_0_direction_W_and_movement_instruction_P() throws Exception {
        //given
        String movementInstruction = "P";

        //when
        MarsRover marsRover = new MarsRover(0, 0, "W");

        //then
        Assertions.assertThrows(Exception.class, () -> {
            marsRover.executeMovementInstruction(movementInstruction);
        });
    }
}