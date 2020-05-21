package com.codemonk.state.stopwatch;

/**
 * -----------------------------------------------------------------------------
 * - Created by Rakesh Niraula
 * - Date:  Wednesday, 20-May-2020
 * - Copyright (c) 2020 Walker Lab. All rights reserved.
 * -----------------------------------------------------------------------------
 **/

public class RunningState implements StopwatchState {
    private Stopwatch stopwatch;

    public RunningState(Stopwatch stopwatch) {
        this.stopwatch = stopwatch;
    }
    @Override
    public void click() {
        stopwatch.setCurrentState(new StoppedState(stopwatch));
        System.out.println("Stopped.");
    }
}
