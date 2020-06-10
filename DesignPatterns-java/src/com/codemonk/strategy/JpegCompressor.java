package com.codemonk.strategy;

/**
 * -----------------------------------------------------------------------------
 * - Author: Rakesh Niraula
 * - Date: Friday, 05-June-2020
 * - Copyright(c): Codemonk 2020. All rights reserved.
 * -----------------------------------------------------------------------------
 **/

public class JpegCompressor implements Compressor {

    @Override
    public void compress(String fileName) {
        System.out.println("compressor: JPEG");
    }
}
