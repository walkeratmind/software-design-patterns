package com.codemonk.template.exercise;

/**
 * -----------------------------------------------------------------------------
 * - Author: Rakesh Niraula
 * - Date: Monday, 08-June-2020
 * - Copyright(c): Codemonk 2020. All rights reserved.
 * -----------------------------------------------------------------------------
 **/

public class ChatWindow extends Window {
    @Override
    protected void preExecute() {
        System.out.println("Dialog befor window closing: sure to close window?");
    }

    @Override
    protected void postExecute() {
        System.out.println("Ok, window is closed.");

    }
}
