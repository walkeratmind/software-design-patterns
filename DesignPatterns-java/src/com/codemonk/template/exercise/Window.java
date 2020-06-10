package com.codemonk.template.exercise;

/**
 * -----------------------------------------------------------------------------
 * - Author: Rakesh Niraula
 * - Date: Monday, 08-June-2020
 * - Copyright(c): Codemonk 2020. All rights reserved.
 * -----------------------------------------------------------------------------
 **/

public abstract class Window {
    public void close() {
        //TODO: custom windows may need to execute some code before the window
        // is closed.

        preExecute();
        System.out.println("Removing the window from the screen");

        postExecute();
        //TODO: custom windows may need to execute some code after the window
        // is closed.
    }

    protected abstract void preExecute();
    protected abstract void postExecute();
}
