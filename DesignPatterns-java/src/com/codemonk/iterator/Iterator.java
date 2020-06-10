package com.codemonk.iterator;

/**
 * -----------------------------------------------------------------------------
 * - Author: Rakesh Niraula
 * - Date: Friday, 05-June-2020
 * - Copyright(c): Codemonk 2020. All rights reserved.
 * -----------------------------------------------------------------------------
 **/

public interface Iterator<T> {
//  void first();
  void next();
  boolean isDone();
  boolean hasNext();
  T currentItem();
}
