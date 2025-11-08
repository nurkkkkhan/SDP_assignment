package Assignment8.CartItems;

import Assignment8.Interfaces.CartItem;
import Assignment8.Interfaces.ShoppingCartVisitor;


public class Book implements CartItem {
    private String name;
    private String genre;
    private double price;


    public Book(String name,String genre,double price){
        this.name=name;
        this.genre=genre;
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
    public String getGenre(){
        return genre;
    }
}
