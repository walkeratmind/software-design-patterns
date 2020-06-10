package com.codemonk.memento.document;

/**
 * -----------------------------------------------------------------------------
 * - Author: Rakesh Niraula
 * - Date: Friday, 05-June-2020
 * - Copyright(c): Codemonk 2020. All rights reserved.
 * -----------------------------------------------------------------------------
 **/

public class Main {
    public static void main(String[] args) {
        var document = new Document();
        var history = new History();

        document.setContent("This is first content.");
        document.setFontName("firstFont");
        document.setFontSize(12);
        history.push(document.createState());

        document.setContent("This is second content.");
        document.setFontName("secondFont");
        document.setFontSize(14);
        history.push(document.createState());

        document.setContent("This is third content.");
        document.setFontName("thirdFont");
        document.setFontSize(16);
        history.push(document.createState());

        document.setFontSize(20);
        history.push(document.createState());

        document.restore(history.pop());
        document.restore(history.pop());

        System.out.println(document);
    }
}
