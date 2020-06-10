package com.codemonk.command.exercise;

/**
 * -----------------------------------------------------------------------------
 * - Author: Rakesh Niraula
 * - Date: Monday, 08-June-2020
 * - Copyright(c): Codemonk 2020. All rights reserved.
 * -----------------------------------------------------------------------------
 **/

public class Demo {
    public static void main(String[] args) {
        VideoEditor videoEditor = new VideoEditor();
        History history = new History();

        SetTextCommand setTextCommand = new SetTextCommand("new", videoEditor, history);
        setTextCommand.execute();
        System.out.println("TEXT: " + videoEditor);

        SetContrastCommand setContrastCommand = new SetContrastCommand(3.4F, videoEditor, history);
        setContrastCommand.execute();
        System.out.println("CONTRAST: " + videoEditor);

        UndoCommand undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println("UNDO: " + videoEditor);

        undoCommand.execute();
        System.out.println("UNDO: " + videoEditor);

        undoCommand.execute();
        System.out.println("UNDO: " + videoEditor);



    }
}
