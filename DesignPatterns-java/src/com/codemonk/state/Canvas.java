package com.codemonk.state;

/**
 * -----------------------------------------------------------------------------
    - Author: Rakesh Niraula
    - Date: Tuesday, 19-May-2020
    - Copyright (c) 2020 Walker Lab. All rights reserved.
 * -----------------------------------------------------------------------------
 **/

public class Canvas {

    private Tool currentTool;

    public void mouseDown() {
//        if (currentTool == ToolType.SELECTION) {
//            System.out.println("Selection Icon");
//        } else if (currentTool == ToolType.BRUSH) {
//            System.out.println("Brush Icon");
//        } else if (currentTool == ToolType.ERASER) {
//            System.out.println("Eraser Icon");
//        }
        currentTool.mouseDown();
    }

    public void mouseUp() {
//        if (currentTool == ToolType.SELECTION) {
//            System.out.println("Dashed Rectangle");
//        } else if (currentTool == ToolType.BRUSH) {
//            System.out.println("Draw Line");
//        } else if (currentTool == ToolType.ERASER) {
//            System.out.println("Erase Something");
//        }
        currentTool.mouseUp();
    }

    public Tool getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
    }
}
