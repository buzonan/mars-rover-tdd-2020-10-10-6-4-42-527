package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MarsRoverTest {
    @Test
    void should_return_true_when_validate_movement_instructions_given_movement_instruction_M() {
        //given
        String movementInstruction = "M";

        //when
        MarsRover marsRover = new MarsRover(0, 0, "N");

        //then
        assertTrue(marsRover.validateMovementInstruction(movementInstruction));

    }
    @Test
    void should_return_false_when_validate_movement_instructions_given_movement_instruction_B() {
        //given
        String movementInstruction = "B";

        //when
        MarsRover marsRover = new MarsRover(0, 0, "N");

        //then
        assertFalse(marsRover.validateMovementInstruction(movementInstruction));

    }

    @Test
    void should_return_y_1_when_execute_movement_instruction_given_x_0_y_0_direction_N_and_movement_instruction_M() {
        //given
        String movementInstruction = "M";

        //when
        MarsRover marsRover = new MarsRover(0, 0, "N");
        marsRover.executeMovementInstruction(movementInstruction);
        //then
        assertEquals(1,marsRover.getLocationY());

    }

    @Test
    void should_return_y_negative_1_when_execute_movement_instruction_given_x_0_y_0_direction_S_and_movement_instruction_M() {
        //given
        String movementInstruction = "M";

        //when
        MarsRover marsRover = new MarsRover(0, 0, "S");
        marsRover.executeMovementInstruction(movementInstruction);
        //then
        assertEquals(-1,marsRover.getLocationY());

    }

    @Test
    void should_return_x_1_when_execute_movement_instruction_given_x_0_y_0_direction_E_and_movement_instruction_M() {
        //given
        String movementInstruction = "M";

        //when
        MarsRover marsRover = new MarsRover(0, 0, "E");
        marsRover.executeMovementInstruction(movementInstruction);
        //then
        assertEquals(1,marsRover.getLocationX());

    }

    @Test
    void should_return_x_negative_1_when_execute_movement_instruction_given_x_0_y_0_direction_E_and_movement_instruction_M() {
        //given
        String movementInstruction = "M";

        //when
        MarsRover marsRover = new MarsRover(0, 0, "W");
        marsRover.executeMovementInstruction(movementInstruction);
        //then
        assertEquals(-1,marsRover.getLocationX());

    }

}