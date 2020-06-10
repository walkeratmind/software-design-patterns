package com.codemonk.strategy;

/**
 * -----------------------------------------------------------------------------
 * - Author: Rakesh Niraula
 * - Date: Friday, 05-June-2020
 * - Copyright(c): Codemonk 2020. All rights reserved.
 * -----------------------------------------------------------------------------
 **/

public class ImageStorage {

    public void store(String fileName, Compressor compressor, Filter filter) {
        // JPEG , PNG...
        compressor.compress(fileName);
        filter.apply(fileName);

    }
}
