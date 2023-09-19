package ru.mirea.lab3;

import java.util.Arrays;
import java.util.Random;

public class MathxRandom {
    public static void main(String[] args) {
        int size = 5;
        double[] array1 = new double[size];
        double[] array2 = new double[size];

        for (int i = 0; i < size; i++) {
            array1[i] = Math.random();
        }

        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            array2[i] = rand.nextDouble();
        }

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println("Sorted arrays");
        Arrays.sort(array1);
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }
}
