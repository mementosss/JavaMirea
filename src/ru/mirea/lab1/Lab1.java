package ru.mirea.lab1;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.math.BigInteger;

public class Lab1 {
    Scanner scanner = new Scanner(System.in);

    public void task3() {
        int[] myArray = new int[]{1, 2, 4, 5, 6, 3, 8};
        int sum = 0;
        for (int i = 0; i < 7; i++) {
            sum += myArray[i];
        }

        double ave = (double) sum / 7; //
        System.out.println("\nSum: " + sum);
        System.out.println("Average: " + ave);
    }
    public void task4() {
        System.out.print("Array size: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        System.out.print("Write elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int sum = 0;
        int min = numbers[0]; // Первый элемент массива
        int max = numbers[0];

        int i = 0;
        do {
            sum += numbers[i];
            i++;
        } while (i < size);


        i = 1;
        while (i < size) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
            i++;
        }

        System.out.println("Elements Sum: " + sum);
        System.out.println("Min element: " + min);
        System.out.println("Max element: " + max);
        scanner.close();
    }
    public void task5(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + (i) + ": " + args[i]);
        }
    }
    public void task6() {
        DecimalFormat dF = new DecimalFormat( "#.####" ); //класс для форматирования любого числа в Java
        for (int i = 1; i <= 10; i++) {
            double harmonicNumber = 1.0 / i;
            System.out.println(dF.format(harmonicNumber));
        }
    }

    public void task7() {                       // для факториала (время и кол-во цифр в числах 100 000/500 000) / BigInteger
        int num = scanner.nextInt();
        BigInteger factorial = BigInteger.ONE; // создает объект factorial типа BigInteger и присваивает ему значение 1
        for (int i = 1; i <= num; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i)); // методом multiply умножаем значение factorial на текущее значение итерации
        }
        System.out.println(num + "! = " + factorial);
        int digitCount = countDigits(factorial);
        System.out.println("Numbers of digit: " + digitCount);
    }

    public int countDigits(BigInteger number) { //метод для подсчтёта цифр в факториале числа
        String numString = number.toString();   //для преобразования объекта в его строковое представление
        return numString.length();              //для подсчета количества символов в строке
    }
}




