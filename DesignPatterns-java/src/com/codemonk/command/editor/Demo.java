package com.codemonk.command.editor;

/**
 * -----------------------------------------------------------------------------
 * - Author: Rakesh Niraula
 * - Date: Monday, 08-June-2020
 * - Copyright(c): Codemonk 2020. All rights reserved.
 * -----------------------------------------------------------------------------
 **/

public class Demo {
    public static void main(String[] args) {
        History history = new History();
        HTMLDocument htmlDocument = new HTMLDocument();

        htmlDocument.setContent("Hello World");

        BoldCommand boldCommand = new BoldCommand(htmlDocument, history);
        boldCommand.execute();
        System.out.println(htmlDocument.getContent());

        UndoCommand undoCommand = new UndoCommand(history);
        undoCommand.execute();

        System.out.println(htmlDocument.getContent());

    }
}
