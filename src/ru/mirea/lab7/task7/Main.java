package ru.mirea.lab7.task7;

public class Main {
    public static void main(String[] args) {
        Magazine[] magazine = new Magazine[3];
        magazine[0] = new Magazine("National Geographic");
        magazine[1] = new Magazine("Cosmopolitan");
        magazine[2] = new Magazine("Esquire");

        Printable[] printable = new Printable[4];
        printable[0] = magazine[0];
        printable[1] = magazine[1];
        printable[2] = magazine[2];

        Magazine.printMagazines(printable);
    }
}