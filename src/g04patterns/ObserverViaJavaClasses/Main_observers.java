package g04patterns.ObserverViaJavaClasses;

import g04patterns.ObserverViaJavaClasses.Observers.ArchiveObserver;
import g04patterns.ObserverViaJavaClasses.Observers.BossObserver;
import g04patterns.ObserverViaJavaClasses.Observers.CustomerObserver;

import java.util.Observer;

public class Main_observers {

    public static void main(String[] args)
    {
        Database database = new Database();

        Observer boss = new BossObserver();
        Observer archive = new ArchiveObserver();
        Observer customer = new CustomerObserver();

        database.addObserver(boss);
        database.editRecord("edit", "record1");
        System.out.println();

        database.addObserver(customer);
        database.editRecord("add", "record2");
        System.out.println();

        database.addObserver(archive);
        database.editRecord("update", "record3");
    }
}
