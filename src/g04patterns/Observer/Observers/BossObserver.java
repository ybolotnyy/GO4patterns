package g04patterns.Observer.Observers;

import g04patterns.Observer.Interfaces.Observer;

public class BossObserver implements Observer{
    public void update(String operation, String record) {
        System.out.printf("Boss-observer says: record '%s' was '%s' \n",
                record,
                operation);
    }
}
