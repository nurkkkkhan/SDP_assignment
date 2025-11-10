package VisitorPattern;

public class cart implements Visitor{
    @Override
    public void visitBook(BookStore book){
        System.out.println("Book: " + book.getName() + ", written by: " + book.getAuthor() + ", price: " + book.getPrice() +"$" );
    }
    @Override
    public void visitElectronics(ElectronicsShop electronics){
        System.out.println("Tech: "+electronics.getName()+ ", by: " + electronics.getBrand() + ",price: " +electronics.getPrice()+"$");
    }
}
