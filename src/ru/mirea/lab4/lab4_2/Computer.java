package ru.mirea.lab4.lab4_2;

public class Computer {
    private final Task2.Brand brand;
    private final Processor processor;
    private final Memory memory;
    private final Monitor monitor;
    public Computer(Task2.Brand brand, Processor processor, Memory memory, Monitor monitor) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }
    @Override
    public String toString() {
        return "Brand: " + brand +
                "\nProcessor: " + processor +
                "\nMemory: " + memory +
                "\nMonitor: " + monitor;
    }
}