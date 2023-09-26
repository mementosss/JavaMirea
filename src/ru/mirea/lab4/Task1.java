package ru.mirea.lab4;

public class Task1 {
    interface DescriptionConvertible  {
        String getDescription();
    }

    public String getDescription() {
        return "Холодное время года";
    }
    public enum Seasons implements DescriptionConvertible {
        SPRING("Весна",15),
        SUMMER("Лето",30),
        AUTUMN("Осень",10),
        WINTER("Зима",-12);

        final int temp;
        final String name;

        Seasons(String name, int temp){
            this.temp = temp;
            this.name = name;
        }
        public void printSeasonInfo() {
            System.out.println("Название времени года: " + name);
            System.out.println("Средняя температура: " + temp);
            System.out.println("Описание: " + getDescription());
            System.out.print("\n");
        }
        @Override
        public String getDescription() {
            if (this == SUMMER) {
                return "Теплое время года";
            } else {
                return "Холодное время года";
            }
        }
        public static void favoriteSeason(Seasons seasons) {
            switch (seasons) {
                case SPRING -> System.out.println("Я люблю весну");
                case SUMMER -> System.out.println("Я люблю лето");
                case AUTUMN -> System.out.println("Я люблю осень");
                case WINTER -> System.out.println("Я люблю зиму");
                default -> System.out.println("Неизвестное время года");
            }
        }
        public static void main(String[] args) {
            Seasons.favoriteSeason(SUMMER);
            for (Seasons season : Seasons.values()) {
                season.printSeasonInfo();

            }
        }
    }
}
