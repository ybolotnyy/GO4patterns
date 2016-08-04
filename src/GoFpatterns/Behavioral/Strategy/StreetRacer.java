package GoFpatterns.Behavioral.Strategy;

import GoFpatterns.Behavioral.Strategy.StrategyAlgorithms.GoByDrivingFast;

/**
 * Created by byn on 7/21/16.
 */
public class StreetRacer extends Vehicle {

    public StreetRacer() {
        setGoByAlgorithm(new GoByDrivingFast());
    }
}
