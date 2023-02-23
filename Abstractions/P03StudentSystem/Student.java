package Abstractions.P03StudentSystem;

public class Student {
    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return this.name;
    }


    public String getCommentary() {
        if (grade < 3.50) {
            return Commentary.Low.toString();
        } else if (grade < 5.00) {
            return Commentary.Average.toString();
        } else {
            return Commentary.Excellent.toString();
        }
    }

    @Override
    public String toString() {
        return String.format("%s is %d years old. %s.", name, age, getCommentary());
    }
}
