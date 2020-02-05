package ObserverPattern.Shopping;


public interface Subject {

    public void addObserver(ObserverShopping i);
    public void removeObserver(ObserverShopping i);
    public void notifyAllObservers();
}
