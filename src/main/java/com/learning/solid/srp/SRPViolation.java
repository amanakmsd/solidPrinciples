package com.learning.solid.srp;



public class SRPViolation {
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

        public void saveToFile() {
            System.out.println(this.name + " " + this.author);
        }
    }

    public static void main(String[] args) {
        Book book = new Book("Alexe Xu", "System design interview");
        book.saveToFile();
    }

}
