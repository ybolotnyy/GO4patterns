package GoFpatterns.Observer.ObserverGoF;

import GoFpatterns.Observer.ObserverGoF.Interfaces.Observer;
import GoFpatterns.Observer.ObserverGoF.Interfaces.Subject;

import java.util.Vector;

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

    public void editRecord(String operation, String record) {
        this.operation = operation;
        this.record = record;
        notifyObservers();
    }
}
