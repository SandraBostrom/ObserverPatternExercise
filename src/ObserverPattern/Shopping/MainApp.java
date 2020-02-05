package ObserverPattern.Shopping;

public class MainApp {

    public static void main(String[] args) {
        FashionProduct product = new FashionProduct();
        ShoppingObserver shoppingObserver = new ShoppingObserver(product);

        product.setName("Mössa");
        product.setDescription("Stickad mössa i ull");
        product.setPrice(80);
    }
}
