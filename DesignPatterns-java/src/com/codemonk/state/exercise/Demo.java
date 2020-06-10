package com.codemonk.state.exercise;

/**
 * -----------------------------------------------------------------------------
 * - Author: Rakesh Niraula
 * - Date: Friday, 05-June-2020
 * - Copyright(c): Codemonk 2020. All rights reserved.
 * -----------------------------------------------------------------------------
 **/

public class Demo {
    public static void show() {
        var service = new DirectionService(new Driving());
        service.getDirection();
        service.getEta();
    }
    public static void main(String[] args) {
        show();

    }
}
