package com.codemonk.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * -----------------------------------------------------------------------------
 * - Created by Rakesh Niraula
 * - Date:  Monday, 18-May-2020
 * - Copyright (c) 2020 Walker Lab. All rights reserved.
 * -----------------------------------------------------------------------------
 **/

public class History {
    private List<EditorState> states = new ArrayList<>();

    public void push(EditorState editorState) {
        states.add(editorState);
    }

    public EditorState pop() {
        var lastIndex = states.size() - 1;
        var lastState = states.get(lastIndex);

        states.remove(lastState);

        return lastState;
    }
}
