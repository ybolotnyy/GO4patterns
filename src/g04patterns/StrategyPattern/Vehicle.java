package g04patterns.StrategyPattern;

/**
 * Created by byn on 7/21/16.
 */
public class Vehicle {
    private String className;

    public void go() {
        className = getClass().getName().substring(28);
        System.out.printf("I'm (%s) going now \n", className);
    }
}
