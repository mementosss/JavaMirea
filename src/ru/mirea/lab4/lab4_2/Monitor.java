package ru.mirea.lab4.lab4_2;

public class Monitor {
    @Override
    public String toString() {
        return model +" - " + size + " inches";
    }
    private final String model;
    private final int size;
    public Monitor(String model, int size) {
        this.model = model;
        this.size = size;
    }
}
