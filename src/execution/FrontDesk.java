/*  User: megha nigam
 *  File Name : FrontDesk.java
 * */
package execution;

import java.util.Arrays;
import java.util.Scanner;

import definitions.Book;
import definitions.Library;
import definitions.Student;

public class FrontDesk {
    private static final int ISSUE_A_BOOK = 1;
    private static final int RETURN_PREVIOUSLY_ISSUED_BOOKS = 2;
    private static final int SHOW_ALL_BOOKS_ISSUED = 3;
    private static final int EXIT = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentInput;
        Student studentDetails = new Student();
        System.out.println("PLEASE ENTER YOUR FIRST NAME:");
        String firstNameOfStudent = scanner.nextLine();
        System.out.println("PLEASE ENTER YOUR MIDDLE NAME:");
        String middleNameOfStudent = scanner.nextLine();
        System.out.println("PLEASE ENTER YOUR LAST NAME:");
        String lastNameOfStudent = scanner.nextLine();
        System.out.println("PLEASE ENTER YOUR ROLL NUMBER:");
        Long universityRollNumber = scanner.nextLong();
        scanner.nextLine();
        do {
            System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-");
            System.out.println("How may I help you today?");
            System.out.println("1. Issue a new book for me.");
            System.out.println("2. Return a previously issues book for me.");
            System.out.println("3. Show me all my issues books.");
            System.out.println("4. Exit.");
            System.out.println("ENTER YOUR CHOICE FROM: (1...4):");
            studentInput = scanner.nextInt();
            switch (studentInput) {
                case ISSUE_A_BOOK -> {
                    System.out.println("ENTER THE NAME OF BOOK, YOU WANT TO ISSUE:");
                    scanner.nextLine();
                    String nameOfBook = scanner.nextLine();
                    Library.doIssue(nameOfBook);
                }
                case RETURN_PREVIOUSLY_ISSUED_BOOKS -> {
                    System.out.println("ENTER THE NAME OF BOOK,YOU WANT TO RETURN:");
                    scanner.nextLine();
                    String bookName = scanner.nextLine();
                    Library.doReturn(bookName);
                }
                case SHOW_ALL_BOOKS_ISSUED -> {
                    System.out.println("ENTER THE NUMBER OF BOOKS ISSUED");
                    scanner.nextLine();
                    int numberOfBooksIssued;
                    scanner.nextLine();
                    Book[] booksIssuedByStudent = studentDetails.getBooksIssuedByStudent();
                    studentDetails.getBooksIssuedByStudent();
                    System.out.println("Books Issued By Student:" + " " + Arrays.toString(booksIssuedByStudent));
                }
                default -> System.out.println("please enter correct choices");
            }
        } while (studentInput != 4);
        scanner.close();
    }
}