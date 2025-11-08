package VisitorPattern;

public class Electronics implements Element{
    String name;
    String brand;
    String category;
    double price;

    public Electronics(String name,String brand,String category,double price){
        this.name=name;
        this.brand = brand;
        this.category = category;
        this.price=price;
    }

    public void accept(Visitor visitor){
        visitor.visit(this);
    }
}
