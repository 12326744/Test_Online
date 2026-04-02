package com.work;

import java.util.*;

class Library {
    private ArrayList<Book> books = new ArrayList<>();

    private HashMap<Integer, List<Book>> issuedBooks = new HashMap<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully!");

    }

    public void displayBooks() {
        for (Book b : books) {
            b.display();
        }
    }

    public void issueBook(int memberId, int bookId) {
        for (Book b : books) {
            if (b.getBookId() == bookId && b.isAvailable()) {
                b.setAvailable(false);

                issuedBooks.putIfAbsent(memberId, new ArrayList<>());
                issuedBooks.get(memberId).add(b);

                System.out.println("Book issued successfully!");
                return;
            }
        }
        System.out.println("Book not available!");
    }

    public void returnBook(int memberId, int bookId) {
        if (issuedBooks.containsKey(memberId)) {
            List<Book> list = issuedBooks.get(memberId);

            for (Book b : list) {
                if (b.getBookId() == bookId) {
                    b.setAvailable(true);
                    list.remove(b);
                    System.out.println("Book returned successfully!");
                    return;
                }
            }
        }
        System.out.println("Invalid return!");
    }

    public void searchBook(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                b.display();
            }
        }
    }

    public void searchBookByAuthor(String author) {
        for (Book b : books) {
            if (b.getAuthor().equalsIgnoreCase(author)) {
                b.display();
            }
        }
    }
}