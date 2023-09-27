package ru.mirea.TFL;

import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Into_ReversePN {
    public static String infixToRPN(String expression) {
        StringBuilder result = new StringBuilder();
        Stack<Character> operatorStack = new Stack<>();
        // Используем StringTokenizer для разделения выражения на токены (числа и операторы)
        StringTokenizer tokenizer = new StringTokenizer(expression, "()+-*/^", true);
        while (tokenizer.hasMoreTokens()) { // проверяем на наличие следующего токена
            // Получаем следующий токен
            String token = tokenizer.nextToken().trim();
            if (token.isEmpty()) { // если токены закончились
                continue; // выходим из цикла
            }
            char firstChar = token.charAt(0); // возвращает значение char по указанному индексу 0
            if (Character.isDigit(firstChar) || (token.length() > 1 && firstChar == '-' && Character.isDigit(token.charAt(1)))) { // Если токен - число
                result.append(token).append(" "); // добавляем его в результат
            } else if (firstChar == '(') { // Если токен - открывающая скобка
                operatorStack.push('('); // помещаем ее в стек
            } else if (firstChar == ')') { // Если токен - закрывающая скобка выталкиваем операторы из стека в результат
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
                while (!operatorStack.isEmpty() && precedence(firstChar) <= precedence(operatorStack.peek())) { // пока стэк операторов не пуст и пока не встречаем оператор с большим приоритетом
                    result.append(operatorStack.pop()).append(" "); //добавить извлеченный оператор из стека и добавить его в сторку
                }
                operatorStack.push(firstChar); // Помещаем текущий оператор в стек
            }
        }
        while (!operatorStack.isEmpty()) { // пока стэк операторов не пуст
            result.append(operatorStack.pop()).append(" "); //добавить извлеченный оператор из стека и добавить его в сторку
        }
        return result.toString().trim(); // удвляем лишние пробелы
    }

    private static int precedence(char operator) {
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
        String rpnExpression = infixToRPN(infixExpression); // Вызываем функцию преобразования в обратную польскую запись
        System.out.println("RPN: " + rpnExpression);
        scanner.close();
    }
}