package VisitorPattern;

public interface Visitor {
    void visitBook(BookStore book);
    void visitElectronics(ElectronicsShop electronics);
}
