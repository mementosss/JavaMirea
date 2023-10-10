package ru.mirea.lab4.lab4_2;

public class Task2 {
    public enum Brand {
        APPLE,
        MSI,
    }
    public static void main(String[] args) {

        Processor processor = new Processor("Apple M2", 5.3);
        Memory memory = new Memory(16, "DDR5");
        Monitor monitor = new Monitor("APPLE Ultra", 24);
        Computer computer = new Computer(Brand.APPLE, processor, memory, monitor);

        Processor processor2 = new Processor("AMD Ryzen 5", 2.8);
        Memory memory2 = new Memory(8, "DDR4");
        Monitor monitor2 = new Monitor("MSI Slim", 21);
        Computer computer2 = new Computer(Brand.MSI, processor2, memory2, monitor2);

        System.out.println("Computer 1:");
        System.out.println(computer);

        System.out.println("\nComputer 2:");
        System.out.println(computer2);
    }
}





