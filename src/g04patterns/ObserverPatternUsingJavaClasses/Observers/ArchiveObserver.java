package g04patterns.ObserverPatternUsingJavaClasses.Observers;

import g04patterns.ObserverPatternUsingJavaClasses.Database;

import java.util.Observable;
import java.util.Observer;

public class ArchiveObserver implements Observer
{
    public void update(Observable o, Object arg) {
       System.out.printf("Archive observes that the record '%s' was %s'ed \n",
               ((Database)o).getRecord(),
               ((Database)o).getOperation());
    }
}
