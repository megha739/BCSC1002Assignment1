 /*  User: megha nigam
  *  File Name : Library.java
  * */
 package definitions;

 public class Library {
     private Book[] booksCurrentlyAvailable;

     public Book[] getBooksCurrentlyAvailable() {
         return booksCurrentlyAvailable.clone();
     }

     public void setBooksCurrentlyAvailable(Book[] booksCurrentlyAvailable) {
         this.booksCurrentlyAvailable = booksCurrentlyAvailable;
     }
 }