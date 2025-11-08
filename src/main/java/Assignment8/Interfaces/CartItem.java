package Assignment8.Interfaces;

public interface CartItem {
    void accept(ShoppingCartVisitor visitor);
    String getName();
    double getPrice();
}
