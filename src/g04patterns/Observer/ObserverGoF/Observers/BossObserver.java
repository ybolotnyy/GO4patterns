package g04patterns.Observer.ObserverGoF.Observers;

import g04patterns.Observer.ObserverGoF.Interfaces.Observer;

public class BossObserver implements Observer{
    public void update(String operation, String record) {
        System.out.printf("Boss-observer says: record '%s' was '%s' \n",
                record,
                operation);
    }
}
