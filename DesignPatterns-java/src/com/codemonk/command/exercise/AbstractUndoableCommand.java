package com.codemonk.command.exercise;

/**
 * -----------------------------------------------------------------------------
 * - Author: Rakesh Niraula
 * - Date: Monday, 08-June-2020
 * - Copyright(c): Codemonk 2020. All rights reserved.
 * -----------------------------------------------------------------------------
 **/

public abstract class AbstractUndoableCommand implements UndoableCommand {

    protected VideoEditor videoEditor;
    protected History history;

    public AbstractUndoableCommand(VideoEditor videoEditor, History history) {

        this.videoEditor = videoEditor;
        this.history = history;
    }
    @Override
    public void execute() {
        // template pattern
        doExecute();
        history.push(this);
    }

    protected abstract void doExecute();
}
