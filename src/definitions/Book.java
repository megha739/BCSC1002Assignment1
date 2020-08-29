/*  User: megha nigam
 *  File Name : Book.java
 * */
package definitions;

public class Book {
    private String nameOfBook;
    private String nameOfAuthor;
    // ISBN number of book Should be of 13 Digit .
    private String isbnNumberOfBook;

    public Book() {
        this.nameOfBook = "Design Patterns";
        this.nameOfAuthor = "Erich Gamma";
        this.isbnNumberOfBook = "1234567890112";
    }

    public Book(String nameOfBook, String nameOfAuthor, String isbnNumberOfBook) {
        this.nameOfBook = nameOfBook;
        this.nameOfAuthor = nameOfAuthor;
        this.isbnNumberOfBook = isbnNumberOfBook;
    }
}