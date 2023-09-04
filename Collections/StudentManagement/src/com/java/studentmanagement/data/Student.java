package com.java.studentmanagement.data;

public class Student {
    private String id;
    private String name;
    private int yob;
    private double gpa;

    public Student (String id, String name, int yob, double gpa) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getYob() {
        return yob;
    }

    public double getGpa() {
        return gpa;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void showProfile() {
        System.out.printf("| %-10s| %-20s| %-5d| %-5.2f|\n", id, name, yob, gpa);
    }
}
