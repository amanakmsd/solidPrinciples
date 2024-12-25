package com.learning.solid.srp;

public class SRP {
    public static class Book {
        private String author;
        private String name;

        public Book(String name, String author) {
            this.name = name;
            this.author = author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAuthor() {
            return author;
        }

        public String getName() {
            return name;
        }
    }

    public static class BookSaver {
        public void saveToFile(Book book) {
            System.out.println(book.getAuthor() + " " + book.getName());
        }
    }

    public static void main(String[] args) {
        Book book = new Book("Alexe Xu", "System design interview");
        BookSaver bookSaver = new BookSaver();
        bookSaver.saveToFile(book);
    }

}
