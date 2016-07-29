package GoFpatterns.StrategyPattern.StrategyAlgorithms;

/**
 * Created by byn on 7/21/16.
 */
public class GoByDriving implements GoByAlgorithmStrategy {

    @Override
    public void go() {
        System.out.printf("driving \n");
    }
}
