package com.afs.tdd.MarsRover.standard;

public enum Movement {
    MOVE("M"),
    LEFT("L"),
    RIGHT("R");

    private String action;

    Movement(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }
}
