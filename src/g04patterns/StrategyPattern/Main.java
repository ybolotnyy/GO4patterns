package g04patterns.StrategyPattern;

public class Main {

    public static void main(String[] args) {

        new Helicopter().go();
        new Jet().go();
        new StreetRacer().go();
        new Vehicle().go();
    }
}
