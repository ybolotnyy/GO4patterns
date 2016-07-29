package GoFpatterns.StrategyPattern.StrategyAlgorithms;

/**
 * Created by byn on 7/21/16.
 */
public class GoByFlying implements GoByAlgorithmStrategy {

    @Override
    public void go() {
        System.out.printf("flying \n");
    }
}
