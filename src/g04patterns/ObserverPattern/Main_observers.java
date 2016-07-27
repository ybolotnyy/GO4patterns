package g04patterns.ObserverPattern;

import g04patterns.FactoryPatternGoFway.ConcreteFactory;
import g04patterns.FactoryPatternGoFway.Connection;
import g04patterns.ObserverPattern.Interfaces.Observer;
import g04patterns.ObserverPattern.Observers.ArchiveObserver;
import g04patterns.ObserverPattern.Observers.BossObserver;
import g04patterns.ObserverPattern.Observers.LoggerObserver;

/**
 * Created by byn on 7/21/16.
 */
public class Main_observers {

    public static void main(String[] args)
    {
        Database database = new Database();

        Observer boss = new BossObserver();
        Observer archive = new ArchiveObserver();
        Observer logger = new LoggerObserver();

        database.registerObserver(boss);
        database.registerObserver(archive);
        database.registerObserver(logger);

        database.editRecord("add", "XYZ");
    }
}
