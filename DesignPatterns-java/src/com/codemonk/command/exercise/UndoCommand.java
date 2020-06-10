package com.codemonk.command.exercise;

/**
 * -----------------------------------------------------------------------------
 * - Author: Rakesh Niraula
 * - Date: Monday, 08-June-2020
 * - Copyright(c): Codemonk 2020. All rights reserved.
 * -----------------------------------------------------------------------------
 **/

public class UndoCommand implements Command {
    private History history;

    public UndoCommand(History history) {

        this.history = history;
    }
    @Override
    public void execute() {
        if (history.size() > 1) {
            history.pop().undo();
        }
    }
}
