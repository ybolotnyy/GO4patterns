package g04patterns.Observer.ObserverGoF.Interfaces;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
