package GoFpatterns.StrategyPattern;

import GoFpatterns.StrategyPattern.StrategyAlgorithms.GoByDrivingFast;

/**
 * Created by byn on 7/21/16.
 */
public class StreetRacer extends Vehicle {

    public StreetRacer() {
        setGoByAlgorithm(new GoByDrivingFast());
    }
}
