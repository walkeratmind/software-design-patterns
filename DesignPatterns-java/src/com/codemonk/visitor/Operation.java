package com.codemonk.visitor;

/**
 * -----------------------------------------------------------------------------
 * - Author: Rakesh Niraula
 * - Date: Wednesday, 10-June-2020
 * - Copyright(c): Codemonk 2020. All rights reserved.
 * -----------------------------------------------------------------------------
 **/

public interface Operation {
    void apply(HeadingNode headingNode);
    void apply(AnchorNode anchorNode);
}
