package ObserverPattern.Shopping;

public class ShoppingObserver implements ObserverShopping {

    private String name;
    private String description;
    private double price;
    private Subject subject;

    public ShoppingObserver(Subject subject) {
        this.subject = subject;
        this.subject.addObserver(this);
    }

    @Override
    public void update(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;

        showData();
    }
    private void showData(){
        System.out.println("Name: " + this.name + " Description: " + this.description + " Price: " + this.price + " kr");

    }
}
