package VisitorPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        List<Element> items = new ArrayList<>();

        System.out.println("Add items or type 0 to finish");
        while(true) {
            System.out.println("Enter item type (book/electronics/0): ");

            String type = scanner.nextLine();


            if(type.equals("0")) break;

            if(type.equals("book")){
                System.out.println("Enter book title: ");
                String title = scanner.nextLine();
                System.out.println("Enter book author: ");
                String author = scanner.nextLine();
                System.out.println("Enter genre: ");
                String genre = scanner.nextLine();
                System.out.println("Enter price: $");
                double price = scanner.nextDouble();
                items.add(new BookStore(title,author,genre,price));
            }
                else if(type.equals("electronics")){
                System.out.println("Enter the name: ");
                String name = scanner.nextLine();
                System.out.println("Enter the brand: ");
                String brand = scanner.nextLine();
                System.out.println("Enter the category: ");
                String category = scanner.nextLine();
                System.out.println("Enter the price: $");
                double price = scanner.nextDouble();
                items.add(new ElectronicsShop(name,brand,category,price));
            }
                else{
                break;
            }
        }
        scanner.close();

        System.out.println("Your shopping cart");
        cart displayVisitor = new cart();
        for (Element item:items){
            item.accept(displayVisitor);
        }

        Calculator priceVisitor = new Calculator();
        for (Element item:items){
            item.accept(priceVisitor);
        }
        System.out.println("Total price: " + priceVisitor.getTotal());
    }
}

