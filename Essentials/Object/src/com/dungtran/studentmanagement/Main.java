package com.dungtran.studentmanagement;

import com.dungtran.data.Student;

public class Main {
    public static void main(String[] args) {
        checkObject();
    }

    public static void checkObject() {
        Student s1 = new Student("SE12547", "Khanh Vy", 2005, 8.5);
        Student s2 = new Student("SE12558", "Thanh Ha", 2005, 9.4);
        Student s3 = new Student("SE12549", "Long Nguyen", 2005, 8.2);
         
        s1.showProfile();
        s1.setName("Ha Tran");
        s1.showProfile();
        
    }
}
