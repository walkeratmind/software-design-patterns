package com.codemonk.memento;

/**
 * -----------------------------------------------------------------------------
 * - Created by Rakesh Niraula
 * - Date:  Monday, 18-May-2020
 * - Copyright (c) 2020 Walker Lab. All rights reserved.
 * -----------------------------------------------------------------------------
 **/

public class EditorState {
    private final String content;

    public EditorState(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
