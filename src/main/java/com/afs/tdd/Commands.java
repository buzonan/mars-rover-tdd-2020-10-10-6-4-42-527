package com.afs.tdd;

import java.util.ArrayList;
import java.util.List;

public class Commands {
    List<String> commands = new ArrayList<>();

    public Commands(List<String> commands) {
        this.commands = commands;
    }

    public List<String> getCommandList() {
        return commands;
    }
}
