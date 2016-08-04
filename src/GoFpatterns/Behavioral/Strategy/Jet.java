package GoFpatterns.Behavioral.Strategy;

import GoFpatterns.Behavioral.Strategy.StrategyAlgorithms.GoByFlying;

/**
 * Created by byn on 7/21/16.
 */
public class Jet extends Vehicle {

    public Jet() {
        setGoByAlgorithm(new GoByFlying());
    }
}
