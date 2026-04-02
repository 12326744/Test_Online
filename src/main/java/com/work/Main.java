package com.work;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        library.addBook(new Book(1, "Java Basics", "James Gosling"));
        library.addBook(new Book(2, "DSA", "Mark Allen"));
        library.addBook(new Book(3, "OOP Concepts", "Bjarne Stroustrup"));

        System.out.println("\nAll Books:");

        library.displayBooks();

        StudentMember m1 = new StudentMember(101, "Krishna");

        System.out.println("\nIssuing Book:");
        library.issueBook(m1.getMemberId(), 1);

        library.displayBooks();

        System.out.println("\nReturning Book:");
        library.returnBook(m1.getMemberId(), 1);

        System.out.println("\nSearch by Title:");
        library.searchBook("Java Basics");

        System.out.println("\nSearch by Author:");
        library.searchBookByAuthor("Mark Allen");
    }
}