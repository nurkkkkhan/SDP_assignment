package VisitorPattern;

class ElectronicsSection implements Element{
    String name;
    String brand;
    String category;
    double price;

    public ElectronicsSection(String name, String brand, String category, double price){
        this.name=name;
        this.brand = brand;
        this.category = category;
        this.price=price;
    }

    public String getName(){
        return name;
    }
    public String getBrand(){
        return brand;
    }
    public String getCategory(){
        return category;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void accept(Visitor visitor){
        visitor.visitElectronics(this);
    }
}
