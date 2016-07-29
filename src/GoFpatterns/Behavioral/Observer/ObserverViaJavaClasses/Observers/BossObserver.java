package GoFpatterns.Behavioral.Observer.ObserverViaJavaClasses.Observers;

import GoFpatterns.Behavioral.Observer.ObserverViaJavaClasses.Database;

import java.util.Observable;
import java.util.Observer;

public class BossObserver implements Observer
{
    public void update(Observable o, Object arg) {
       System.out.printf("Boss observes that the record '%s' was %s'ed \n",
               ((Database)o).getRecord(),
               ((Database)o).getOperation());
    }
}
