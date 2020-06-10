package com.codemonk.iterator;

/**
 * -----------------------------------------------------------------------------
 * - Author: Rakesh Niraula
 * - Date: Friday, 05-June-2020
 * - Copyright(c): Codemonk 2020. All rights reserved.
 * -----------------------------------------------------------------------------
 **/

public class Demo {

    public static void show() {
        var history = new BrowseHistory();
        history.push("medium.com");
        history.push("facebook.com");
        history.push("stackoverflow.com");
        history.push("reddit.com");

        Iterator iterator = history.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.currentItem());
            iterator.next();
        }
    }
    public static void main(String[] args) {
        show();
    }
}
