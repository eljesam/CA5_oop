package org.example;
import java.util.Scanner;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BookStore {
    public static void main(String[] args) {
        Books book = new Books();
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. View All Books");
            System.out.println("2. Get Book by ID");
            System.out.println("3. Delete Book by ID");
            System.out.println("4. Insert Book");
            System.out.println("5. Update Book By ID");
            System.out.println("6. Find Book By Filter");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    book.start();
                    break;
                case 2:
                    System.out.println("PLease enter the book ID: ");
                    int bookID = input.nextInt();
                    book.getBookByID(bookID);
                    break;
                case 3:
                    System.out.println("PLease enter the book ID: ");
                    int bookID2 = input.nextInt();
                    book.deleteBookByID(bookID2);

                    break;
                case 4:
                    System.out.println("Please enter the book ID: ");
                    int bookID3 = input.nextInt();
                    System.out.println("Please enter the book title: ");
                    String title = input.next();
                    System.out.println("Please enter the book author: ");
                    String author = input.next();
                    System.out.println("Please enter the book price: ");
                    float price = input.nextFloat();
                    book.insertBook(bookID3, title, author, price);
                    break;
                case 5:

                    break;

                case 6:

                    break;

            }
        } while (choice != 0);



    }

}