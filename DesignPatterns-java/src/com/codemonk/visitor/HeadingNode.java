package com.codemonk.visitor;

/**
 * -----------------------------------------------------------------------------
 * - Author: Rakesh Niraula
 * - Date: Wednesday, 10-June-2020
 * - Copyright(c): Codemonk 2020. All rights reserved.
 * -----------------------------------------------------------------------------
 **/

public class HeadingNode implements HtmlNode {

    @Override
    public void execute(Operation operation) {
operation.apply(this);
    }
}
