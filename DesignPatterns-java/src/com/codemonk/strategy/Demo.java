package com.codemonk.strategy;

/**
 * -----------------------------------------------------------------------------
 * - Author: Rakesh Niraula
 * - Date: Friday, 05-June-2020
 * - Copyright(c): Codemonk 2020. All rights reserved.
 * -----------------------------------------------------------------------------
 **/

public class Demo {
    public static void show() {
        var imageStorage = new ImageStorage();
        imageStorage.store("image name.png", new JpegCompressor(), new BlackAndWhiteFilter());
        imageStorage.store("image name.png", new PngCompressor(), new BlackAndWhiteFilter());
    }
    public static void main(String[] args) {
        show();
    }
}
