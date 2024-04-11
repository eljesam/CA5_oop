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
                    System.out.println("Please enter the book ID to delete: ");
                    int deleteID = input.nextInt();
                    book.deleteBookById(deleteID);

                    break;
                case 4:
                    System.out.println("Enter the details of the book to insert:");
                    System.out.println("ID: ");
                    int id = input.nextInt();
                    System.out.println("Title:");
                    String title = input.nextLine();
                    title = input.nextLine();
                    System.out.println("Author:");
                    String author = input.nextLine();
                    System.out.println("Price:");
                    float price = input.nextFloat();
                    book.insertBook(id, title, author, price);
                    break;
                case 5:

                    break;

                case 6:

                    break;

            }
        } while (choice != 0);



    }

}