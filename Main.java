import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.*;
public class Main {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        //ask inout for no. of books
        //take input for title,author and isbn
        System.out.println("Enter the no. of books: ");
        int numberOfBooks = sc.nextInt();
        sc.nextLine();
        Book[] book = new Book[numberOfBooks];

        for(int i=0; i<numberOfBooks; i++){
            System.out.println("\nEnter details for Book " + (i + 1) + ":");
            System.out.print("Enter the title: ");
            String title = sc.nextLine();
            System.out.print("Enter the name of author: ");
            String author = sc.nextLine();
            System.out.print("Enter ISBN: ");
            String isbn = sc.nextLine();

            book[i] = new Book(title,author,isbn);

        }
        System.out.println("\nLibrary Books:");
        for (int i = 0; i < book.length; i++) {
            System.out.println("\nBook " + (i + 1) + ":");
            book[i].displayBookInfo();
        }


        sc.close();
    }
}
