package VisitorPattern;
import VisitorPattern.Element;
import VisitorPattern.Visitor;
import VisitorPattern.Calculator;
import VisitorPattern.Book;
import VisitorPattern.Electronics;

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
                System.out.println("Enter price: $");
                double price = scanner.nextDouble();
                items.add(new Book(title, price));
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
                items.add(new Electronics(name,brand,category,price));
            }
                else{
                System.out.println("Retype book/electronics/0");
            }
        }
    }
}
