package ru.mirea.lab7.task5;

public class StringManipulatorer implements StringManipulator {
    @Override
    public int podschetSimvolov(String s) {
        return s.length();
    }

    @Override
    public String nechetniyeSimvoly(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }

    @Override
    public String obratnayaStroka(String s) {
        StringBuilder reversed = new StringBuilder(s);
        return reversed.reverse().toString();
    }
}