package Assignment8.CartItems;

import Assignment8.Interfaces.CartItem;
import Assignment8.Interfaces.ShoppingCartVisitor;

public class Electronics implements CartItem {
    private String name;
    private String brand;
    private double price;

    public Electronics(String name,String brand,double price){
        this.name=name;
        this.brand=brand;
        this.price=price;
    }
    @Override
    public void accept(ShoppingCartVisitor visitor){
        visitor.visit(this);
    }
    @Override
    public String getName(){
        return name;
    }
    @Override
    public double getPrice(){
        return price;
    }
    public String getBrand(){
        return brand;
    }

}
