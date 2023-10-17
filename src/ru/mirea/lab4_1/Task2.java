package ru.mirea.lab4_1;

public class Task2 {
    private final String name;

    public Task2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

class SchoolStudent extends Task2 {
    private final int grade;

    public SchoolStudent(String name, int grade) {
        super(name);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }
}

class UniversityStudent extends Task2 {
    private final String university;

    public UniversityStudent(String name, String university) {
        super(name);
        this.university = university;
    }

    public String getCollege() {
        return university;
    }
}

class Main {
    public static void main(String[] args) {
        Task2[] students = new Task2[4];
        students[0] = new SchoolStudent("Ivan", 9);
        students[1] = new SchoolStudent("Dmitriy", 11);
        students[2] = new UniversityStudent("Alex", "MIREA");
        students[3] = new UniversityStudent("Anna", "MGU");

        System.out.println("University Students:");
        for (Task2 Task2 : students) {
            if (Task2 instanceof UniversityStudent collegeStudent) {
                System.out.println("Name: " + collegeStudent.getName() + ", University: " + collegeStudent.getCollege());
            }
        }

        System.out.println("\nSchool Students:");
        for (Task2 Task2 : students) {
            if (Task2 instanceof SchoolStudent schoolStudent) {
                System.out.println("Name: " + schoolStudent.getName() + ", Class: " + schoolStudent.getGrade());
            }
        }
    }
}