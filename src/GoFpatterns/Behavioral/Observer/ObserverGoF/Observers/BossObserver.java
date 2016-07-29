package GoFpatterns.Behavioral.Observer.ObserverGoF.Observers;

import GoFpatterns.Behavioral.Observer.ObserverGoF.Interfaces.Observer;

public class BossObserver implements Observer{
    public void update(String operation, String record) {
        System.out.printf("Boss-observer says: record '%s' was '%s' \n",
                record,
                operation);
    }
}
