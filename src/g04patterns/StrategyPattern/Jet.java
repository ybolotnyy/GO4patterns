package g04patterns.StrategyPattern;

import g04patterns.StrategyPattern.StrategyAlgorithms.GoByDriving;
import g04patterns.StrategyPattern.StrategyAlgorithms.GoByFlying;

/**
 * Created by byn on 7/21/16.
 */
public class Jet extends Vehicle {

    public Jet() {
        setGoByAlgorithm(new GoByFlying());
    }
}
