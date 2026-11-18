
package com.library;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagement {

    static ArrayList<String> books = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter book name: ");
                    String book = sc.nextLine();
                    books.add(book);
                    System.out.println("Book added successfully!");
                    break;

                case 2:
                    System.out.println("Available Books:");
                    for (String b : books) {
                        System.out.println(b);
                    }
                    if (books.isEmpty()) {
                        System.out.println("No books available.");
                    }
                    break;

                case 3:
                    System.out.print("Enter book name to search: ");
                    String search = sc.nextLine();

                    if (books.contains(search)) {
                        System.out.println("Book found!");
                    } else {
                        System.out.println("Book not found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter book name to issue: ");
                    String issue = sc.nextLine();

                    if (books.remove(issue)) {
                        System.out.println("Book issued successfully!");
                    } else {
                        System.out.println("Book not available!");
                    }
                    break;

                case 5:
                    System.out.print("Enter book name to return: ");
                    String returned = sc.nextLine();
                    books.add(returned);
                    System.out.println("Book returned successfully!");
                    break;

                case 6:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}
