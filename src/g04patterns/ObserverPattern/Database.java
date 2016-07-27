package g04patterns.ObserverPattern;

import java.util.Vector;

/**
 * Created by BYN on 7/26/16.
 */
public class Database implements Subject
{
    private Vector<Observer> observers;
    String operation;
    String record;

    public Database()
    {
        observers = new Vector<Observer>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }


    public void notifyObservers() {
        for (int loopIndex = 0; loopIndex < observers.size(); loopIndex++){
            Observer observer = (Observer)observers.get(loopIndex);
            observer.update(operation, record);
        }
    }
}
