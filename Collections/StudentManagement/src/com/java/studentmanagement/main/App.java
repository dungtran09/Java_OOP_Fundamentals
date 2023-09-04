package com.java.studentmanagement.main;

import java.util.ArrayList;
import java.util.List;

import com.java.studentmanagement.data.Student;

public class App {
    public static void main(String[] args) {
        studentList();
    }

    public static void studentList() {
        List<Student> listStudent = new ArrayList<>();
        listStudent.add(new Student("SE1251", "Hoang Thanh Quoc", 2001, 8.4));
        listStudent.add(new Student("SE1252", "Trung Nuyen", 2001, 9.4));
        listStudent.add(new Student("SE1253", "Hoang Thanh Quoc", 2001, 5.4));
        listStudent.add(new Student("SE1254", "Khanh Vy", 2001, 6.8));
        listStudent.add(new Student("SE1255", "Duc Anh", 2001, 8.8));
        
        System.out.println("LIST STUDENT: ");
        System.out.println("+-----------+---------------------+------+------+");
        System.out.println("| ID        | NAME                | YOB  | GPA  |");
        System.out.println("+-----------+---------------------+------+------+");
        for (Student student : listStudent) {
            student.showProfile();
        }
        System.out.println("+-----------+---------------------+------+------+");
    }
}
