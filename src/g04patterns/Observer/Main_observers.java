package g04patterns.Observer;

import g04patterns.Observer.Interfaces.Observer;
import g04patterns.Observer.Observers.ArchiveObserver;
import g04patterns.Observer.Observers.BossObserver;
import g04patterns.Observer.Observers.LoggerObserver;

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
