package GoFpatterns.Observer.ObserverGoF.Observers;

import GoFpatterns.Observer.ObserverGoF.Interfaces.Observer;

public class ArchiveObserver implements Observer{
    public void update(String operation, String record) {
        System.out.printf("archive-observer says: record '%s' was '%s' \n",
                record,
                operation);
    }
}
