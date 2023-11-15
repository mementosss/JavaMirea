package ru.mirea.TFL;

import java.util.Scanner;
import java.util.Stack;

public class From_ReversePN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение в обратной польской записи (числа и операции через пробел):");
        String input = scanner.nextLine().trim(); // Удаляем лишние пробелы
        String[] tokens = input.split("\\s+"); // Разделяем по одному или более пробелу

        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (token.matches("-?\\d+")) { // Проверяем, является ли токен целым числом
                stack.push(Integer.parseInt(token));
            } else {
                int num2 = stack.pop();
                int num1 = stack.pop();
                int result = performOperation(num1, num2, token);
                stack.push(result);
            }
        }

        if (!stack.isEmpty()) {
            System.out.println("Результат: " + stack.pop());
        } else {
            System.out.println("Ошибка: неверное выражение.");
        }
    }

    public static int performOperation(int num1, int num2, String operation) {
        switch (operation) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    System.out.println("Ошибка: деление на ноль.");
                    System.exit(1);
                }
            default:
                System.out.println("Ошибка: недопустимая операция.");
                System.exit(1);
        }
        return 0;
    }
}