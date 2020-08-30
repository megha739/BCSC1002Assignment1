/*  User: megha nigam
 *  File Name : FrontDesk.java
 * */
package execution;

import java.util.Scanner;

import definitions.Book;
import definitions.Library;
import definitions.Student;

public class FrontDesk {
    public static final int EXIT = 4;
    private static final int ISSUE_A_BOOK = 1;
    private static final int RETURN_PREVIOUSLY_ISSUED_BOOKS = 2;
    private static final int SHOW_ALL_BOOKS_ISSUED = 3;

    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        Book book = new Book();
        Library library = new Library();
        Student student = new Student();
        System.out.println(" enter your first name");
        String firstName = scannerObject.nextLine();
        System.out.println("ENTER YOUR MIDDLE NAME:");
        String middleName = scannerObject.nextLine();
        System.out.println("ENTER YOUR LAST NAME:");
        String lastName = scannerObject.nextLine();
        System.out.println("ENTER YOUR ROLL NUMBER:");
        Long rollNumber = scannerObject.nextLong();
        scannerObject.nextLine();
        System.out.println("-=-=--=-=-\"Welcome," + firstName + ",To The Front Desk\"-=-=--=-=-");
        System.out.println("How may I help you today?");
        System.out.println("1. Issue a new book for me.");
        System.out.println("2. Return a previously issues book for me.");
        System.out.println("3. Show me all my issues books.");
        System.out.println("4. Exit.");
        System.out.println("ENTER YOUR CHOICE FROM: [1,2,3,4]");
        int choice = scannerObject.nextInt();
        String bookName;
        int booksIssued;
        if (choice <= 4) {
            switch (choice) {
                case ISSUE_A_BOOK:
                    System.out.println("ENTER THE NAME OF BOOK, YOU WANT TO ISSUE:");
                    bookName = scannerObject.nextLine();
                    scannerObject.nextLine();
                    library.doIssue(bookName);
                    break;
                case RETURN_PREVIOUSLY_ISSUED_BOOKS:
                    System.out.println("ENTER THE NAME OF BOOK,YOU WANT TO RETURN:");
                    scannerObject.nextLine();
                    bookName = scannerObject.nextLine();
                    library.doReturn(bookName);
                    break;
                case SHOW_ALL_BOOKS_ISSUED:
                    System.out.println("ENTER THE NUMBER OF BOOKS ISSUED");
                    booksIssued = scannerObject.nextInt();
                    student.getBooksIssuedByStudent();
                    System.out.println(booksIssued);
                    break;
                case EXIT:
                    break;
            }
        } else {
            System.out.println("PLEASE CHOOSE THE CORRECT OPTION???");
        }
        scannerObject.close();
    }
}