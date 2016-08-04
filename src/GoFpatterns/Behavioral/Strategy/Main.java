package GoFpatterns.Behavioral.Strategy;

public class Main {

    public static void main(String[] args) {

        Helicopter helicopter = new Helicopter();
        Jet jet = new Jet();
        StreetRacer streetRacer = new StreetRacer();

        helicopter.go();
        jet.go();
        streetRacer.go();
    }
}
