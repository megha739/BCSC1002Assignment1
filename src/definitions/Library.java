 /*  User: megha nigam
  *  File Name : Library.java
  * */
 package definitions;

 import java.util.Arrays;

 public class Library {
     private Book[] booksCurrentlyAvailable;

     public Library() {
         this.booksCurrentlyAvailable = new Book[20];
         for (int i = 0; i < booksCurrentlyAvailable.length; i++) {
             this.booksCurrentlyAvailable[0] = new Book("Effective Java", "Joshua Bloch", "1452345467897");
             this.booksCurrentlyAvailable[1] = new Book("Let Us C", "Yashavant Kanetkar", "1234557726852");
             this.booksCurrentlyAvailable[2] = new Book("Database Management System", "Raghu Ramakrishnan,", "32098724450855");
             this.booksCurrentlyAvailable[3] = new Book("Cracking The Code", "Evan Pallett", "34587908989");
         }
     }

     public Book[] getBooksCurrentlyAvailable() {
         return booksCurrentlyAvailable;
     }

     public void setBooksCurrentlyAvailable(Book[] booksCurrentlyAvailable) {
         this.booksCurrentlyAvailable = booksCurrentlyAvailable;
     }

     @Override
     public String toString() {
         return "Library{" +
                 "booksCurrentlyAvailable=" + Arrays.toString(booksCurrentlyAvailable) +
                 '}';
     }

     @Override
     public boolean equals(Object o) {
         if (this == o) return true;
         if (o == null || getClass() != o.getClass()) return false;
         Library library = (Library) o;
         return Arrays.equals(getBooksCurrentlyAvailable(), library.getBooksCurrentlyAvailable());
     }

     @Override
     public int hashCode() {
         return Arrays.hashCode(getBooksCurrentlyAvailable());
     }

     /**
      * THIS METHOD HELPS  TO STORE THE BOOKS IN THE LIBRARY .
      */

     public void addBooks(String bookName) {
         System.out.println(bookName + ",is added Succefully.");
     }

     /**
      * THIS METHOD ALLOWS TO ISSUE A BOOK FROM THE LIBRARY
      */
     public void doIssue(String bookName) {
         System.out.println(bookName + ",is issued to you successfully.");
     }

     /**
      * THIS METHOD HELPS TO RETURN THE ISSUED BOOK
      */
     public void doReturn(String bookName) {
         System.out.println(bookName + ",is returned Successfully.");
     }
 }