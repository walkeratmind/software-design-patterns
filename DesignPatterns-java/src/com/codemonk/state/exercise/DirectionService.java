package com.codemonk.state.exercise;

/**
 * -----------------------------------------------------------------------------
 * - Author: Rakesh Niraula
 * - Date: Friday, 05-June-2020
 * - Copyright(c): Codemonk 2020. All rights reserved.
 * -----------------------------------------------------------------------------
 **/

public class DirectionService {
    private TravelState travelState;
    
    public DirectionService(TravelState travelState) {
        this.travelState = travelState;
    }

    public Object getEta() {
//        if (travelMode == TravelMode.DRIVING) {
//            System.out.println("Calculating ETA (driving)");
//            return 1;
//        }
//        else if (travelMode == TravelMode.BICYCLING) {
//            System.out.println("Calculating ETA (bicycling)");
//            return 2;
//        }
//        else if (travelMode == TravelMode.TRANSIT) {
//            System.out.println("Calculating ETA (transit)");
//            return 3;
//        }
//        else {
//            System.out.println("Calculating ETA (walking)");
//            return 4;
//        }
        return travelState.getEta();
    }

    public Object getDirection() {
//        if (travelMode == TravelMode.DRIVING) {
//            System.out.println("Calculating Direction (driving)");
//            return 1;
//        }
//        else if (travelMode == TravelMode.BICYCLING) {
//            System.out.println("Calculating Direction (bicycling)");
//            return 2;
//        }
//        else if (travelMode == TravelMode.TRANSIT) {
//            System.out.println("Calculating Direction (transit)");
//            return 3;
//        }
//        else {
//            System.out.println("Calculating Direction (walking)");
//            return 4;
//        }
        return travelState.getDirection();
    }

    public TravelState getTravelState() {
        return travelState;
    }

    public void setTravelState(TravelState travelState) {
        this.travelState = travelState;
    }
}

