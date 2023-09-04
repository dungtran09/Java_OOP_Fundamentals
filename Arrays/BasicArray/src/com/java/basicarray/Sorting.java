package com.java.basicarray;

import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        
        // create array students
        Student[] listStudent = inputStudentList();
        printListStudent(listStudent);
        sortListStudent(listStudent);
        printListStudent(listStudent);
    }

    // create list student by sonsole
    public static Student[] inputStudentList() {
        Scanner sc = new Scanner(System.in);
        int numberOfStudent;

        // field info student
        String id;
        String name;
        int yob;
        double gpa;

        // initial number of student 
        while (true) {
            try {
                System.out.println("ADD STUDENT IN THE LIST");
                
                System.out.print("Enter number of student to add: ");
                numberOfStudent = Integer.parseInt(sc.nextLine());
                if (numberOfStudent > 0) {
                    break;
                } else {
                    System.out.println("The number of student must be great than zero!");
                }
            } catch (NumberFormatException e) {
                System.out.println("ERROR: The number of student is not valid. Please try again!");
            }    
        }
            
        // declare and initial list student 
        Student[] listStudent = new Student[numberOfStudent];

        for (int i = 0; i < listStudent.length; i++) {
            System.out.println("Enter info student " + (i+1) + "th: ");
            System.out.print("\tID: ");
            id = sc.nextLine().trim().toUpperCase();

            System.out.print("\tNAME: ");
            name = sc.nextLine().trim().toUpperCase();
            
            while (true) {
                try {
                    System.out.print("\tYOB: ");
                    yob = Integer.parseInt(sc.nextLine());
                    if (yob > 0) {
                        break;
                    } else {
                        System.out.println("\t'YOB' not nagative number!");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("\tERROR: The 'YOB' student is not valid. Please try again!");
                }
            }

            while (true) {
                try {
                    System.out.print("\tGPA: ");
                    gpa = Double.parseDouble(sc.nextLine());
                    if (gpa > 0) {
                        break;
                    } else {
                        System.out.println("\n'GPA' not nagative number!");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("\tERROR: The 'GPA' student is not valid. Please try again!");
                }
            }
            listStudent[i] = new Student(id, name, yob, gpa);
            System.out.println("Add Student " + (i + 1) + " sussefully!\n");
        }
        return listStudent;
    }
    
    // print list student
    public static void printListStudent(Student[] listStudent) {
        for (int i = 0; i < listStudent.length; i++) {
            listStudent[i].showProfile();
        }
    }
   
    // sort list student by 'gpa'
    public static void sortListStudent(Student[] listStudent) {
        System.out.println("Sort by 'GPA': ");
        for (int i = 0; i < listStudent.length; i++) {
            for (int j = i + 1; j < listStudent.length; j++) {
                if (listStudent[i].getGpa() < listStudent[j].getGpa()) {
                    Student temp = listStudent[i];
                    listStudent[i] = listStudent[j];
                    listStudent[j] = temp;
                }
            }
        }
    }

    // sorting array primitive
    public static void sortObjecPrimitiveArray() {
        Student[] listStudent = new Student[5];
        listStudent[0] = new Student("SE2547","Thanh Ha Nguyen", 2004, 7.5);
        listStudent[1] = new Student("SE2548","Vu Cat Tuong", 2005, 8.9);
        listStudent[2] = new Student("SE2549","Phan Quoc Thai", 2004, 9.5);
        listStudent[3] = new Student("SE2550","Nguyen Viet Long", 2003, 8.5);
        listStudent[4] = new Student("SE2551","Tran Xuan Dung", 1996, 6.5);
        System.out.println("Before sort: ");
        for (Student student : listStudent) {
            student.showProfile();
        }
        System.out.println("After sort: ");
        // sort
        for (int i = 0; i < listStudent.length; i++) {
            for (int j = i + 1; j < listStudent.length; j++) {
                if (listStudent[i].getGpa() < listStudent[j].getGpa()) {
                    Student temp = listStudent[i];
                    listStudent[i] = listStudent[j];
                    listStudent[j] = temp;
                }
            }
        }
        // print 
        for (Student student : listStudent) {
            student.showProfile(); 
        }
    }
}
