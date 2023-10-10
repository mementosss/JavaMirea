package ru.mirea.lab4.lab4_2;

public class Memory {
    @Override
    public String toString() {
        return capacity + "Gb" +  " - " + type;
    }
    private final int capacity;
    private final String type;
    public Memory(int capacity, String type) {
        this.capacity = capacity;
        this.type = type;
    }
}
