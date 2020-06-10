package com.codemonk.command.editor;

/**
 * -----------------------------------------------------------------------------
 * - Author: Rakesh Niraula
 * - Date: Monday, 08-June-2020
 * - Copyright(c): Codemonk 2020. All rights reserved.
 * -----------------------------------------------------------------------------
 **/

public class HTMLDocument {
    private String content;

    public void makeBold() {
        content = "<b>" + content + "</b>";
    }

    public void wrapContent(String content, String tag) {
        content = "<" + tag  + ">" + content + "</" + tag + ">";
    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
