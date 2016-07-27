package g04patterns.ObserverPattern.Observers;

import g04patterns.ObserverPattern.Interfaces.Observer;

public class BossObserver implements Observer{
    public void update(String operation, String record) {
        System.out.printf("Boss-observer says: record '%s' was '%s' \n",
                record,
                operation);
    }
}
