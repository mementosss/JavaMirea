package ru.mirea.lab8.task10;

public class ReverseNumber {
    public static int reverse(int n, int a) {
        // функция "reverse" рекурсивно делит число "n" на 10 и добавляет последнюю цифру в начало числа "a"
        // Рекурсия продолжается до тех пор, пока число "n" не станет равным 0, а затем возвращается обращенное число "a"
        if (n == 0) {
            return a;
        } else {
            return reverse((n / 10), (10 * a + n % 10));
        }
    }
}