package com.codemonk.memento.document;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * -----------------------------------------------------------------------------
 * - Author: Rakesh Niraula
 * - Date: Friday, 05-June-2020
 * - Copyright(c): Codemonk 2020. All rights reserved.
 * -----------------------------------------------------------------------------
 **/

public class History {
    private Deque<DocumentMemento> states = new ArrayDeque<>();

    public void push(DocumentMemento documentMemento) {states.add(documentMemento);}

    public DocumentMemento pop() {
        return states.pop();
    }

}
