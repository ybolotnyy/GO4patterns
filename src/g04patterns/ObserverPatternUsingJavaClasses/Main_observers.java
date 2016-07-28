package g04patterns.ObserverPatternUsingJavaClasses;

import g04patterns.ObserverPattern.Observers.LoggerObserver;
import g04patterns.ObserverPatternUsingJavaClasses.Observers.ArchiveObserver;
import g04patterns.ObserverPatternUsingJavaClasses.Observers.BossObserver;
import g04patterns.ObserverPatternUsingJavaClasses.Observers.CustomerObserver;

import java.util.Observer;

public class Main_observers {

    public static void main(String[] args)
    {
        Database database = new Database();

        Observer boss = new BossObserver();
        Observer archive = new ArchiveObserver();
        Observer customer = new CustomerObserver();

        database.addObserver(boss);
        database.addObserver(archive);
        database.addObserver(customer);

        database.editRecord("edit", "record1");
    }
}
