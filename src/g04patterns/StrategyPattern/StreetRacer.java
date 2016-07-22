package g04patterns.StrategyPattern;

import g04patterns.StrategyPattern.StrategyAlgorithms.GoByDrivingFast;

/**
 * Created by byn on 7/21/16.
 */
public class StreetRacer extends Vehicle {

    public StreetRacer() {
        setGoByAlgorithm(new GoByDrivingFast());
    }
}
