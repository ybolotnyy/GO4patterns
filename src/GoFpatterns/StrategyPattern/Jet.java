package GoFpatterns.StrategyPattern;

import GoFpatterns.StrategyPattern.StrategyAlgorithms.GoByFlying;

/**
 * Created by byn on 7/21/16.
 */
public class Jet extends Vehicle {

    public Jet() {
        setGoByAlgorithm(new GoByFlying());
    }
}
