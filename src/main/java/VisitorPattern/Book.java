package VisitorPattern;

class Book implements Element{
    String name;
    double price;

    public Book(String name,double price){
        this.name=name;
        this.price=price;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
