package com.codemonk.visitor;

/**
 * -----------------------------------------------------------------------------
 * - Author: Rakesh Niraula
 * - Date: Wednesday, 10-June-2020
 * - Copyright(c): Codemonk 2020. All rights reserved.
 * -----------------------------------------------------------------------------
 **/

public class HighlightOperation implements Operation {
    @Override
    public void apply(HeadingNode headingNode) {
        System.out.println("highlight-heading");
    }

    @Override
    public void apply(AnchorNode anchorNode) {
        System.out.println("highlight-anchor");

    }
}
