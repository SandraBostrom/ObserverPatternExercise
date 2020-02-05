package ObserverPattern.Shopping;

import ObserverPattern.Observer;

import java.util.ArrayList;
import java.util.List;

public class FashionProduct implements Subject {

    private String name;
    private String description;
    private double price;
    private List<ObserverShopping> observerList;


    public FashionProduct() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public void addObserver(ObserverShopping o) {
        this.observerList.add(o);
    }

    @Override
    public void removeObserver(ObserverShopping i) {
        this.observerList.remove(i);
    }

    @Override
    public void notifyAllObservers() {
        for (ObserverShopping o : this.observerList)
            o.update(name, description, price);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyAllObservers();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
        notifyAllObservers();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        notifyAllObservers();
    }
}
