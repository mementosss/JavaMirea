package ru.mirea.TFL;

import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Into_ReversePN {
    public static String infixToRPN(String expression) {

        StringBuilder result = new StringBuilder();

        Stack<Character> operatorStack = new Stack<>();// Создаем стек для операторов
        // Используем StringTokenizer для разделения выражения на токены (числа и операторы)
        StringTokenizer tokenizer = new StringTokenizer(expression, "()+-*/^", true);
        while (tokenizer.hasMoreTokens()) { // проверяем на наличие следующего токена
            // Получаем следующий токен
            String token = tokenizer.nextToken().trim();
            if (token.isEmpty()) { // если токены закончились, выходим из цикла
                continue;
            }

            // Получаем первый символ токена
            char firstChar = token.charAt(0); // возвращает значение char по указанному индексу 0

            // Если токен - число, добавляем его в результат
            if (Character.isDigit(firstChar) || (token.length() > 1 && firstChar == '-' && Character.isDigit(token.charAt(1)))) {
                result.append(token).append(" ");
            } else if (firstChar == '(') {
            // Если токен - открывающая скобка, помещаем ее в стек
                operatorStack.push('(');
            } else if (firstChar == ')') {
            // Если токен - закрывающая скобка, выталкиваем операторы из стека в результат,
            // пока не встретим открывающую скобку
                while (!operatorStack.isEmpty() && operatorStack.peek() != '(') { // peek (возврат верхнего элемента без его удаления)
                    result.append(operatorStack.pop()).append(" "); // pop (удаление и возврат верхнего элемента стека)
                }
            // Удаляем открывающую скобку из стека
                if (!operatorStack.isEmpty() && operatorStack.peek() == '(') {
                    operatorStack.pop();
                }
            } else {
            // Если токен - оператор, выталкиваем операторы из стека в результат, пока
            // не встретим оператор с меньшим приоритетом или открывающую скобку
                while (!operatorStack.isEmpty() && precedence(firstChar) <= precedence(operatorStack.peek())) {
                    result.append(operatorStack.pop()).append(" ");
                }
            // Помещаем текущий оператор в стек
                operatorStack.push(firstChar);
            }
        }
        // Выталкиваем оставшиеся операторы из стека в результат
        while (!operatorStack.isEmpty()) {
            result.append(operatorStack.pop()).append(" "); //добавить извлеченный оператор из стека и добавить его в сторку
        }
        return result.toString().trim();// Возвращаем обратную польскую запись как строку, отрезая лишние пробелы
    }

    private static int precedence(char operator) { // Функция для определения приоритета оператора
        return switch (operator) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            case '^' -> 3;
            default -> -1;
        };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write your expression: ");
        String infixExpression = scanner.nextLine();

        // Вызываем функцию преобразования в обратную польскую запись
        String rpnExpression = infixToRPN(infixExpression);
        System.out.println("RPN: " + rpnExpression);
        scanner.close();
    }
}