 /*  User: megha nigam
  *  File Name : Library.java
  * */
 package definitions;

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
 }