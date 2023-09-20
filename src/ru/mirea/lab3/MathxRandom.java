package ru.mirea.lab3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MathxRandom {
    Random rand = new Random();
    Scanner sc = new Scanner(System.in);
    public void task1(){
        int size = 5;
        double[] array1 = new double[size];
        double[] array2 = new double[size];

        for (int i = 0; i < size; i++) {
            array1[i] = Math.random();
        }


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

    public void task2() {
        int n;
        do {
            System.out.println("Write array size: ");
            n = sc.nextInt();
        } while (n <= 0);

        int[] array1 = new int[n];
        for (int i = 0; i < n; i++) {
            array1[i] = rand.nextInt(n + 1); // случайнное число от 0 до n вкл.
        }

        int k = 0;
        for(int i = 0; i < n; i++) {
            if ((array1[i] % 2 == 0) ) { //если элемент четный
                array1[k] = array1[i]; //значение этого элемента копируется в array1[k] и индекс k увеличивается на 1
                k++;
            }
        }

        int[] array2 = Arrays.copyOf(array1, k); //создание копии массива с длиной чётных элементов
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }
}
