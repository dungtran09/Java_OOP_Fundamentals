
package com.dungtran.data;

public class Student {
    private String rollNumber;
    private String name;
    private int yourOfBirth;
    private double gpa;

    public Student(String rollNumber, String name, int yourOfBirth, double gpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.yourOfBirth = yourOfBirth;
        this.gpa = gpa;
    }
        
    public void setName(String name) {
        this.name = name;
    }

    public String getRollNumber() {
        return this.rollNumber;
    }

    public String getName() {
        return this.name;
    }

    public int getYourOfBirth() {
        return yourOfBirth;
    }

    public double getGpa() {
        return gpa;
    }

    @Override                                                                                                                                                                           
    public String toString() {                                                                                                                                                          
        return String.format("|%s|%-25s|%4d|%4.1f\n", rollNumber, name, yourOfBirth, gpa);                                                                                                       
    }                                                                                                                                                                                   
    
    public void showProfile() {                                                                                                                                                         
        System.out.printf("|%s|%-25s|%4d|%4.1f\n", rollNumber, name, yourOfBirth, gpa);                                                                                                      
    }
}
