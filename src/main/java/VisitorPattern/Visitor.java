package VisitorPattern;

public interface Visitor {
    void visitBook(BookSection book);
    void visitElectronics(ElectronicsSection electronics);
}
