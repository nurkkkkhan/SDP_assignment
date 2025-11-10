package VisitorPattern;

public class Calculator  implements Visitor{
    private double total = 0;

    public void visitBook(BookSection book){
        total += book.price;
    }

    public void visitElectronics(ElectronicsSection electronics){
        total += electronics.price;
    }

    public double getTotal() {
        return total;
    }
}
