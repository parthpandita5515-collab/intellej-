package com.Books;

public class Library {
    public static void main(String[] args) {
        Book Book =new Book();
       Book.setName("The Alchemist");
       Book.setAuthor("Paulo Coelho");
        System.out.println(Book.getName());
        System.out.println(Book.getAuthor());

    }
}
