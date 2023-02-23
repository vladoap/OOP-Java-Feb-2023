package Abstractions.P03StudentSystem;

import java.util.ArrayList;
import java.util.List;

public class StudentSystem {
    private List<Student> repo;

    public StudentSystem() {
        repo = new ArrayList<>();
    }

    public void addStudent(String[] input) {
        String name = input[1];
        int age = Integer.parseInt(input[2]);
        double grade = Double.parseDouble(input[3]);
        Student currentStudent = getStudentByName(name);
        if (currentStudent == null) {
            repo.add(new Student(name, age, grade));
        }

    }

    public void printStudent(String[] input) {
        String name = input[1];
        Student currentStudent = getStudentByName(name);
        if (currentStudent != null) {
            System.out.println(currentStudent);
        }


    }

    private Student getStudentByName(String name) {
        return repo.stream().filter(st -> st.getName().equals(name)).findFirst().orElse(null);
    }
}
