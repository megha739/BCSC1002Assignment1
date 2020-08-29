/*  User: megha nigam
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private String firstNameOfStudent;
    private String middleNameOfStudent;
    private String lastNameOfStudent;
    private long studentUniversityRollNo;
    private int numberOfBooksIssued;
    private Book[] booksIssuedByStudent;

    public Student(String firstNameOfStudent, String middleNameOfStudent, String lastNameOfStudent, long studentUniversityRollNo, int numberOfBooksIssued) {
        this.firstNameOfStudent = firstNameOfStudent;
        this.middleNameOfStudent = middleNameOfStudent;
        this.lastNameOfStudent = lastNameOfStudent;
        this.studentUniversityRollNo = studentUniversityRollNo;
        this.numberOfBooksIssued = numberOfBooksIssued;
    }

    public Student() {
        this.booksIssuedByStudent = new Book[20];
    }

    public String getFirstNameOfStudent() {
        return firstNameOfStudent;
    }

    public String getMiddleNameOfStudent() {
        return middleNameOfStudent;
    }

    public String getLastNameOfStudent() {
        return lastNameOfStudent;
    }

    public long getStudentUniversityRollNo() {
        return studentUniversityRollNo;
    }

    public int getNumberOfBooksIssued() {
        return numberOfBooksIssued;
    }

    public Book[] getBooksIssuedByStudent() {
        return booksIssuedByStudent.clone();
    }

    public void setFirstNameOfStudent(String firstNameOfStudent) {
        this.firstNameOfStudent = firstNameOfStudent;
    }

    public void setMiddleNameOfStudent(String middleNameOfStudent) {
        this.middleNameOfStudent = middleNameOfStudent;
    }

    public void setLastNameOfStudent(String lastNameOfStudent) {
        this.lastNameOfStudent = lastNameOfStudent;
    }

    public void setStudentUniversityRollNo(long studentUniversityRollNo) {
        this.studentUniversityRollNo = studentUniversityRollNo;
    }

    public void setNumberOfBooksIssued(int numberOfBooksIssued) {
        this.numberOfBooksIssued = numberOfBooksIssued;
    }

    public void setBooksIssuedByStudent(Book[] booksIssuedByStudent) {
        this.booksIssuedByStudent = booksIssuedByStudent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstNameOfStudent='" + firstNameOfStudent + '\'' +
                ", middleNameOfStudent='" + middleNameOfStudent + '\'' +
                ", lastNameOfStudent='" + lastNameOfStudent + '\'' +
                ", studentUniversityRollNo=" + studentUniversityRollNo +
                ", numberOfBooksIssued=" + numberOfBooksIssued +
                ", booksIssuedByStudent=" + Arrays.toString(booksIssuedByStudent) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getStudentUniversityRollNo() == student.getStudentUniversityRollNo() &&
                getNumberOfBooksIssued() == student.getNumberOfBooksIssued() &&
                getFirstNameOfStudent().equals(student.getFirstNameOfStudent()) &&
                getMiddleNameOfStudent().equals(student.getMiddleNameOfStudent()) &&
                getLastNameOfStudent().equals(student.getLastNameOfStudent()) &&
                Arrays.equals(getBooksIssuedByStudent(), student.getBooksIssuedByStudent());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getFirstNameOfStudent(), getMiddleNameOfStudent(), getLastNameOfStudent(), getStudentUniversityRollNo(), getNumberOfBooksIssued());
        result = 31 * result + Arrays.hashCode(getBooksIssuedByStudent());
        return result;
    }
}