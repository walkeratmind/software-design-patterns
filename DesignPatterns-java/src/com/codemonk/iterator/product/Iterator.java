package com.codemonk.iterator.product;

/**
 * -----------------------------------------------------------------------------
 * - Author: Rakesh Niraula
 * - Date: Friday, 05-June-2020
 * - Copyright(c): Codemonk 2020. All rights reserved.
 * -----------------------------------------------------------------------------
 **/

public interface Iterator<T> {
    void next();
    T current();
    boolean hasNext();
    boolean isDone();
}
