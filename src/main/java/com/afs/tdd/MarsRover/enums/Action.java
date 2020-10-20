package com.afs.tdd.MarsRover.enums;

public enum Action {
    MOVE("M"),
    LEFT("L"),
    RIGHT("R");

    private String action;

    Action(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }
}
