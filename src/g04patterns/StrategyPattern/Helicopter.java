package g04patterns.StrategyPattern;

import g04patterns.StrategyPattern.StrategyAlgorithms.GoByFlying;

/**
 * Created by byn on 7/21/16.
 */
public class Helicopter extends Vehicle {

    public Helicopter() {
        setGoByAlgorithm(new GoByFlying());
    }
}
