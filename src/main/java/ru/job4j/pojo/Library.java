package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book first = new Book("Lord of the rings", 1500);
        Book second = new Book("Clean code", 500);
        Book third = new Book("Head First Java", 1000);
        Book fourth = new Book("Sherlock Holmes", 650);
        Book[] books = new Book[4];
        books[0] = first;
        books[1] = second;
        books[2] = third;
        books[3] = fourth;
        for (int i = 0; i < books.length; i++) {
            Book b = books[i];
            System.out.println("Название книги: " + b.getName()
                    + ". Количество страниц: " + b.getNumberOfPages());
        }
        Book.swap(books, 0, 3);
        System.out.println();
        for (int i = 0; i < books.length; i++) {
            Book b = books[i];
            System.out.println("Название книги: " + b.getName()
                    + ". Количество страниц: " + b.getNumberOfPages());
        }
        System.out.println();
        for (int i = 0; i < books.length; i++) {
            Book b = books[i];
            if (b.getName().equals("Clean code")) {
                System.out.println("Название книги: " + b.getName()
                        + ". Количество страниц: " + b.getNumberOfPages());
            }
        }
    }
}
