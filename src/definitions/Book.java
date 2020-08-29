/*  User: megha nigam
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;

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

    public String getNameOfBook() {
        return nameOfBook;
    }

    public String getNameOfAuthor() {
        return nameOfAuthor;
    }

    public String getIsbnNumberOfBook() {
        return isbnNumberOfBook;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public void setNameOfAuthor(String nameOfAuthor) {
        this.nameOfAuthor = nameOfAuthor;
    }

    public void setIsbnNumberOfBook(String isbnNumberOfBooks) {
        this.isbnNumberOfBook = isbnNumberOfBooks;
    }

    public void doIssue() {
        System.out.println(nameOfBook + "Successfully issued to you");
    }

    public void doReturn() {
        System.out.println("THANK YOU FOR RETURNING THE BOOK.");
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameOfBook='" + nameOfBook + '\'' +
                ", nameOfAuthor='" + nameOfAuthor + '\'' +
                ", isbnNumberOfBook='" + isbnNumberOfBook + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return getNameOfBook().equals(book.getNameOfBook()) &&
                getNameOfAuthor().equals(book.getNameOfAuthor()) &&
                getIsbnNumberOfBook().equals(book.getIsbnNumberOfBook());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNameOfBook(), getNameOfAuthor(), getIsbnNumberOfBook());
    }
}