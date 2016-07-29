package GoFpatterns.StrategyPattern;

import GoFpatterns.StrategyPattern.StrategyAlgorithms.GoByAlgorithmStrategy;

/**
 * Created by byn on 7/21/16.
 */
abstract class Vehicle {
    GoByAlgorithmStrategy algorithm;
    private String className;

    public void setGoByAlgorithm(GoByAlgorithmStrategy goByAlgorithm) {
        algorithm = goByAlgorithm;
    }

    public void go() {
        className = getClass().getName().substring(28);

        System.out.printf("I'm (%s) ", className);
        algorithm.go();
    }
}
