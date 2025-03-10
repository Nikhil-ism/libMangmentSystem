import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.*;
import java.io.*;

public class Main {

    public static final String FILE_NAME = "library.txt";
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        //ask inout for no. of books
        //take input for title,author and isbn
        System.out.println("Enter the no. of books: ");
        int numberOfBooks = sc.nextInt();
        sc.nextLine();
        Book[] books = new Book[numberOfBooks];

        for(int i=0; i<numberOfBooks; i++){
            System.out.println("\nEnter details for Book " + (i + 1) + ":");
            System.out.print("Enter the title: ");
            String title = sc.nextLine();
            System.out.print("Enter the name of author: ");
            String author = sc.nextLine();
            System.out.print("Enter ISBN: ");
            String isbn = sc.nextLine();

            books[i] = new Book(title,author,isbn);

        }
        saveBooksToFile(books);
        readBooksFromFile();
        System.out.println("\nLibrary Books:");
        for (int i = 0; i < books.length; i++) {
            System.out.println("\nBook " + (i + 1) + ":");
            books[i].displayBookInfo();
        }


        sc.close();
    }

    public static void saveBooksToFile(Book[] books){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))){
            for(Book book : books){
                writer.write(book.getTitle() + "," + book.getAuthor() + "," + book.getIsbn());
                writer.newLine();
            }
            System.out.println("Books saved to " + FILE_NAME);
        }catch(IOException e){
            System.out.println("Error occurred while saving the file");
        }
    }



    public static void readBooksFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            System.out.println("books stored in file");
            while ((line = reader.readLine()) != null) {
                String[] bookDetails = line.split(",");
                if (bookDetails.length == 3) {
                    System.out.println("Title: " + bookDetails[0]);
                    System.out.println("Author: " + bookDetails[1]);
                    System.out.println("ISBN: " + bookDetails[2]);
                    System.out.println("----------------------");
                } else {
                    System.out.println("Invalid data format: " + line);
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the books.");
        }
    }
}
