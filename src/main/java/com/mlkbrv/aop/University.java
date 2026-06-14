package com.mlkbrv.aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<Student>();

    public void addStudent() {
        Student st1 = new Student("Emil Akbarov",2,9.8);
        Student st2 = new Student("Huseyn Ibrahimov",2,5.8);
        Student st3 = new Student("Najaf Guliyev",2,7.0);
        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println(students.get(3));
        System.out.println("Information of students");
        System.out.println(students);
        return students;
    }
}
