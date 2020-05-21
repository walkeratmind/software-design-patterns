package com.codemonk.state.stopwatch;

/**
 * -----------------------------------------------------------------------------
 * - Created by Rakesh Niraula
 * - Date:  Wednesday, 20-May-2020
 * - Copyright (c) 2020 Walker Lab. All rights reserved.
 * -----------------------------------------------------------------------------
 **/

public class StoppedState implements StopwatchState {
    private Stopwatch stopwatch;

    public StoppedState(Stopwatch stopwatch) {
        this.stopwatch = stopwatch;
    }

    @Override
    public void click() {
        stopwatch.setCurrentState(new RunningState(stopwatch));
        System.out.println("Running...");
    }
}
