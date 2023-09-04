package com.java.studentmanagement.core;

import java.util.Scanner;

public class Self {
    private int count = 0;
    private Student[] list = new Student[100];
    private Scanner sc;
    private Keybroad kb;

    public Self() {
        this.kb = new Keybroad();
        this.sc = new Scanner(System.in);
    }               
    public void run() {
        int choise;
        int options[] = {1, 2, 3, 4, 5, 6 ,7};
        int EXIT = options[options.length -1];
        String menuItems[] = {"Create", "Print", "Sort", "Search", "Remove", "Update", "Quit"};

        String promptMsg = "Enter a number in ranger 1 to 7: ";
        String errorMsg = "ERROR: Format number or ranger number not valid. Try again!";
        
        displayMenu(options, menuItems);
        choise = kb.readInteger(promptMsg, errorMsg, 1, 7);
        while (choise != EXIT) {
            if (choise == options[0]) {
                create(); 
            } else if (choise == options[1]) {
                print();
            } else if (choise == options[2]) {
                sort();
            } else if (choise == options[3]) {
                search();
            } else if (choise == options[4]) {
                remove();
            } else if (choise == options[5]) {
                update();
            }
            displayMenu(options, menuItems);
            choise = kb.readInteger(promptMsg, errorMsg);
        }
        System.out.println("Goog Bye! See you.");
    }


    public void create() {
        // field info student
        String id;
        String name;
        int yob;
        double gpa;
        
        String promptMsg = "Enter a number of student to add: ";
        String errorMsg = "ERROR: Format number is not valid. Try again!";
        
        int number = kb.readInteger(promptMsg, errorMsg);
        // initial number of student 
        int temp = number;
        for (int i = 1; i <= number; i++) {
            System.out.println("Enter info student (Entered: " + (i) + "/" + temp + ")" +  " - Total: (" + count + "/" + list.length + ")");
            System.out.print(" ID: ");
            id = sc.nextLine().trim().toUpperCase();
            System.out.print(" NAME: ");
            name = sc.nextLine().trim().toUpperCase();
            
            promptMsg = " YOB: ";
            yob = kb.readInteger(promptMsg, errorMsg);

            promptMsg = " GPA: ";
            errorMsg = "ERROR: Format number or ranger number not valid (ranger from 1 to 10). Try again!";
            gpa =  kb.readDouble(promptMsg, errorMsg, 1, 10);

            list[count] = new Student(id, name, yob, gpa);
            System.out.println("Add student SUCCESSFULLY!\n");
            ++count;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("THERE IS NO STUDENT IN THE LIST.\n");
        } else {
            System.out.println("List student: ");
            System.out.println("+------------+----------------------+-------+-------+");
            System.out.println("| ID         | NAME                 | YOB   | GPA   |");
            System.out.println("+------------+----------------------+-------+-------+");
            for (int i = 0; i < count; i++) {
                list[i].showProfile();
            }
            System.out.println("+------------+----------------------+-------+-------+");
            System.out.println("Number of student: " + count);
        }
    }

    public void sort() {
        if (isEmpty()) {
            System.out.println("THERE IS NO STUDENT IN THE LIST.\n");
        } else {
            // sort
            System.out.println("'GPA' sort by decrement order: ");
            for (int i = 0; i < count; i++) {
                for (int j = i + 1; j < count - 1; j++) {
                    if (list[i].getGpa() < list[j].getGpa()) {
                        Student temp = list[i];
                        list[i] = list[j];
                        list[j] = temp;
                    }
                }
            }
            print();
        }
    }
    
    public void search() {
        if (isEmpty()) {
            System.out.println("THERE IS NO STUDENT IN THE LIST.\n");
        } else {
            Student result;
            String id;
            System.out.print("Enter 'ID' student to search: ");
            id = sc.nextLine().trim();
            result = getAStudent(id); 
            if (result != null) {
                System.out.println("RESULT: ");
                System.out.println("+------------+----------------------+-------+-------+");
                System.out.println("| ID         | NAME                 | YOB   | GPA   |");
                System.out.println("+------------+----------------------+-------+-------+");
                result.showProfile();
                System.out.println("+------------+----------------------+-------+-------+");
            } else {
                System.out.println("(" + id + ")" + " NOT-EXISTENT IN THE LIST!");
            }
        }
    }

    public Student getAStudent(String id) {
        if (isEmpty()) {
            System.out.println("THERE IS NO STUDENT IN THE LIST.\n");
            return null;
        } else {
            for (int i = 0; i < count; i++) {
                if (list[i].getId().equalsIgnoreCase(id)) {
                   return list[i];
                }
            }
            return null;
        }
    }

    boolean isEmpty() {
        if (count == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void remove() {
        if (isEmpty()) {
            System.out.println("THERE IS NO STUDENT IN THE LIST.\n");
        } else {
            String id;
            Student temp = null;
            System.out.print("Enter 'ID' student to delete: ");
            id = sc.nextLine().trim();
            
            for (int i = 0; i < count; i++) {
                if (list[i].getId().equalsIgnoreCase(id)) {
                    temp = list[i];
                    list[i] = list[i+1];
                    --count;
                }
            }

            if (temp == null) {
                System.out.println("(" + id + ")" + " NOT-EXISTENT IN THE LIST!");
            } else {
                System.out.println("Remove student SUCCESSFULLY.");
                System.out.println("+------------+----------------------+-------+-------+");
                System.out.println("| ID         | NAME                 | YOB   | GPA   |");
                System.out.println("+------------+----------------------+-------+-------+");
                temp.showProfile();
                System.out.println("+------------+----------------------+-------+-------+");
            }
        }
    }

    public void update() {
        if (isEmpty()) {
            System.out.println("THERE IS NO STUDENT IN THE LIST.\n");
        } else {
            Student result = null;
            String id;
            System.out.print("Enter 'ID' student to search: ");
            id = sc.nextLine().trim();
            
            result = getAStudent(id);

            if (result != null) {
                System.out.println("RESULT: ");
                System.out.println("+------------+----------------------+-------+-------+");
                System.out.println("| ID         | NAME                 | YOB   | GPA   |");
                System.out.println("+------------+----------------------+-------+-------+");
                result.showProfile();
                System.out.println("+------------+----------------------+-------+-------+");
                String name;
                System.out.print("Enter name student to change: " );
                name = sc.nextLine().trim().toUpperCase();
                result.setName(name);
                System.out.println("Rename (" + name + ") SUCCESSFULLY." );
                System.out.println("+------------+----------------------+-------+-------+");
                System.out.println("| ID         | NAME                 | YOB   | GPA   |");
                System.out.println("+------------+----------------------+-------+-------+");
                result.showProfile();
                System.out.println("+------------+----------------------+-------+-------+");
            } else {
                System.out.println("(" + id + ")" + " NOT-EXISTENT IN THE LIST!");
            }
        }

    }

    private void displayMenu(int opts[], String menuItems[]) {
        System.out.println("M E N U");
        System.out.println("==================");
        for (int i = 0; i < opts.length; i++) {
            System.out.printf("%d. %s\n", opts[i], menuItems[i]);
        }
        System.out.println("==================");
        System.out.println("What acction do you choise?");
    }
}

