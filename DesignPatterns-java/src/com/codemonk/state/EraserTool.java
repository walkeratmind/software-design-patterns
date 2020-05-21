package com.codemonk.state;

/**
 * -----------------------------------------------------------------------------
 * - Created by Rakesh Niraula
 * - Date:  Wednesday, 20-May-2020
 * - Copyright (c) 2020 Walker Lab. All rights reserved.
 * -----------------------------------------------------------------------------
 **/

public class EraserTool implements Tool {
    @Override
    public void mouseDown() {
        System.out.println("Eraser Icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Erase something");

    }
}
