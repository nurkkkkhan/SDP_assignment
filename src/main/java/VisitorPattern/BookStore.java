package VisitorPattern;

class BookStore implements Element{
    String name;
    String author;
    String genre;
    double price;

    public BookStore(String name,String author,String genre, double price){
        this.name=name;
        this.price=price;
        this.author = author;
        this.genre=genre;
    }
    public String getName(){
        return name;
    }
    public String getAuthor(){
        return author;
    }
    public String getGenre(){
        return genre;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitBook(this);
    }
}
