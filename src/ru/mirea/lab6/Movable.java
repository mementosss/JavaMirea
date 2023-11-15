package ru.mirea.lab6;

public interface Movable {
    void moveUp();
    void moveDown();
    void moveRight();
    void moveLeft();
    default void moveCenter(){
        System.out.println("Object is at the middle");
    }
}