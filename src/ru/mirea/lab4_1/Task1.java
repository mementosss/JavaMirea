package ru.mirea.lab4_1;

public class Task1 {
    abstract static class Shape {
        public abstract double getArea();
        public abstract double getPerimeter();
        public abstract String getType();
        @Override
        public String toString() {
            return "Type: " + getType() +
                    "\nArea: " + getArea() +
                    "\nPerimeter: " + getPerimeter();
        }
    }
static class Circle extends Shape {
        private final double radius;
        public Circle(double radius) {
            this.radius = radius;
        }
        @Override
        public double getArea() {
            return Math.PI * radius * radius;
        }
        @Override
        public double getPerimeter() {
            return 2 * Math.PI * radius;
        }
        @Override
        public String getType() {
            return "Circle";
        }
    }

static class Rectangle extends Shape {
        private final double width;
        private final double height;
        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }
        @Override
        public double getArea() {
            return width * height;
        }
        @Override
        public double getPerimeter() {
            return 2 * (width + height);
        }
        @Override
        public String getType() {
            return "Rectangle";
        }
    }

static class Square extends Rectangle {
        public Square(double side) {
            super(side, side);
        }
        @Override
        public String getType() {
            return "Square";
        }
    }

    public static class ShapeTester {
        public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape square = new Square(3);

            System.out.println(circle);
            System.out.println();
            System.out.println(rectangle);
            System.out.println();
            System.out.println(square);
        }
    }
}
