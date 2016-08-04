package GoFpatterns.Behavioral.Strategy;

import GoFpatterns.Behavioral.Strategy.StrategyAlgorithms.GoByFlying;

/**
 * Created by byn on 7/21/16.
 */
public class Helicopter extends Vehicle {

    public Helicopter() {
        setGoByAlgorithm(new GoByFlying());
    }
}
