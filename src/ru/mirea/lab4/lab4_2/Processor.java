package ru.mirea.lab4.lab4_2;

public class Processor {
    @Override
    public String toString() {
        return model + " - " + speed + " GHz";
    }
    private final String model;
    private final double speed;
    public Processor(String model, double speed) {
        this.model = model;
        this.speed = speed;
    }
}
