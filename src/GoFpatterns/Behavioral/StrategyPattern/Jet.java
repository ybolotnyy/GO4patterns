package GoFpatterns.Behavioral.StrategyPattern;

import GoFpatterns.Behavioral.StrategyPattern.StrategyAlgorithms.GoByFlying;

/**
 * Created by byn on 7/21/16.
 */
public class Jet extends Vehicle {

    public Jet() {
        setGoByAlgorithm(new GoByFlying());
    }
}
