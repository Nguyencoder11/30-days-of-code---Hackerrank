// Day 13: Abstract Classes

import java.util.*;

// Declare an abstract class named Book
abstract class Book {
    String title;
    String author;

    // Constructor
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Method display()
    abstract void display();
}

// Declare your class here. Do not use the 'public' access modifier.
// Declare the price instance variable
class MyBook extends Book {
    int price;

    /**
     * Class Constructor
     * 
     * @param title  - The book's title.
     * @param author - The book's author.
     * @param price  - The book's price.
     **/
    // Write your constructor here
    MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }

    /**
     * Method Name: display
     * 
     * Print the title, author, and price in the specified format.
     **/
    // Write your method here
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}
// End class

public class Day13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}