package VisitorPattern;

public class Calculator  implements Visitor{
    private double total = 0;

    public void visitBook(BookStore book){
        total += book.price;
    }

    public void visitElectronics(ElectronicsShop electronics){
        total += electronics.price;
    }

    public double getTotal() {
        return total;
    }
}
