package com.company;

public class Book {
    private String name;
    private String autor;
    private int page;
    private int year;

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", autor='" + autor + '\'' +
                ", page=" + page +
                ", year=" + year+", ";
    }

    public Book(String name, String autor, int page, int year) {
        this.name = name;
        this.autor = autor;
        this.page = page;
        this.year = year;
    }
}
