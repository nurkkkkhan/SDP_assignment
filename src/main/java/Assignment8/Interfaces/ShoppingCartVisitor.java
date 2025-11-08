package Assignment8.Interfaces;

import Assignment8.CartItems.Book;
import Assignment8.CartItems.Electronics;


public interface ShoppingCartVisitor {
    void visit (Book book);
    void visit(Electronics electronics);
}
