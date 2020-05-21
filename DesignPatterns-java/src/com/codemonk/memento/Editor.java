package com.codemonk.memento;

/**
 * -----------------------------------------------------------------------------
 * - Created by Rakesh Niraula
 * - Date:  Monday, 18-May-2020
 * - Copyright (c) 2020 Walker Lab. All rights reserved.
 * -----------------------------------------------------------------------------
 **/

public class Editor {
    private String content;

    public EditorState createState() {
        return new EditorState(content);
    }

    public void restore(EditorState editorState) {
        content = editorState.getContent();
    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
