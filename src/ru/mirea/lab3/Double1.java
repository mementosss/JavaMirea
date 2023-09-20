package ru.mirea.lab3;

import java.lang.Double;

public class Double1 {
    public static void main(String[] args) {
        Double obj1 = Double.valueOf("211.22");
        String str = "16.66666666666666666666666666666";

        double pStr = Double.parseDouble(str); //возвращает новое значение double
        System.out.println(pStr);

        double pDouble = obj1;
        System.out.println(pDouble);

        float pFloat = obj1.floatValue();
        System.out.println(pFloat);

        int pInt = obj1.intValue();
        System.out.println(pInt);

        long pLong = obj1.longValue();
        System.out.println(pLong);

        short pShort = obj1.shortValue();
        System.out.println(pShort);

        byte pByte = obj1.byteValue();
        System.out.println(pByte);
        System.out.println(obj1);

        String d = Double.toString(3.14);
        System.out.println(d);
    }
}
