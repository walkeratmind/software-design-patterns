package com.codemonk.state.stopwatch;

/**
 * -----------------------------------------------------------------------------
 * - Created by Rakesh Niraula
 * - Date:  Wednesday, 20-May-2020
 * - Copyright (c) 2020 Walker Lab. All rights reserved.
 * -----------------------------------------------------------------------------
 **/

public class Stopwatch {
    StopwatchState currentState = new StoppedState(this);

    public Stopwatch() {}

    public Stopwatch(StopwatchState stopwatchState) {
        this.currentState = stopwatchState;
    }

    public void click() {
        currentState.click();
    }
    public StopwatchState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(StopwatchState currentState) {
        this.currentState = currentState;
    }


}
