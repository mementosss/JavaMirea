package ru.mirea.lab2;

import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("James", "jjames@gmail.com", 'M');
        System.out.println(author);

        author.setName("John");
        author.setEmail("johnsmith@example.com"); // Изменение email автора
        author.setGender('W');

        System.out.println("Name: " + author.getName());
        System.out.println("Email: " + author.getEmail());
        System.out.println("Gender: " + author.getGender());

    }
}

//        System.out.println("Updated Name: " + author.getName()); //для обновления значений
//        System.out.println("Updated Gender: " + author.getGender());
//        System.out.println("Updated Email: " + author.getEmail());

