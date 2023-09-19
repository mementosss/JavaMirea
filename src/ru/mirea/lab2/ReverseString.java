package ru.mirea.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        String[] array;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write arrays elements: ");
        String input = scanner.nextLine();
        scanner.close();
        array = input.split("\\s+"); //регулярное выражения для замены двойных или более пробелов (правильный подсёт слов)
        System.out.println(Arrays.toString(array));

        int length = array.length;
        String reverse; //переменная для обмена элементов

        for (int i = 0; i < length / 2; i++) { //работаем с половиной массива
            reverse = array[length - i - 1]; //притивоположный элемент
            array[length - i - 1] = array[i]; //обмен элементов местами
            array[i] = reverse; //значение переменной присваивается i-му элементу массива
        }
        System.out.println(Arrays.toString(array));
    }
}
