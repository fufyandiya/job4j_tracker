package ru.job4j.pojo;

public class Book {
    private String name;
    private int numberOfPages;

    public Book(String name, int numberOfPages) {
        this.name = name;
        this.numberOfPages = numberOfPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public static Book[] swap(Book[] bookOne, int source, int dest) {
        Book temp = bookOne[source];
        bookOne[source] = bookOne[dest];
        bookOne[dest] = temp;
        return bookOne;
    }
}
