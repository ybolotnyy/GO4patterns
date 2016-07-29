package GoFpatterns.Behavioral.Observer.ObserverGoF;

import GoFpatterns.Behavioral.Observer.ObserverGoF.Interfaces.Observer;
import GoFpatterns.Behavioral.Observer.ObserverGoF.Observers.ArchiveObserver;
import GoFpatterns.Behavioral.Observer.ObserverGoF.Observers.BossObserver;
import GoFpatterns.Behavioral.Observer.ObserverGoF.Observers.LoggerObserver;

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
