package ru.mirea.lab6;

public class TestMovable {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(1, 2, 3, 4);
        MovableCircle circle = new MovableCircle(3, 4, 1, 2, 5);
        MovableRectangle rectangle = new MovableRectangle(1, 2, 3, 4, 5, 6);

        System.out.println("First pos:");
        System.out.println(point);
        System.out.println(circle);

        point.moveUp();
        circle.moveDown();
        point.moveLeft();
        circle.moveRight();
        rectangle.moveUp();
        rectangle.moveRight();

        System.out.println("\nPos after movements:");
        System.out.println(point);
        System.out.println(circle);
        boolean sameSpeed = rectangle.sameSpeed();
        System.out.println(rectangle);
        rectangle.moveCenter();
    }
}