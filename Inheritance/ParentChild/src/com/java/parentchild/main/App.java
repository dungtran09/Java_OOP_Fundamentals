package com.java.parentchild.main;

import com.java.parentchild.data.Child;
import com.java.parentchild.data.Parent;

public class App {
    public static void main(String[] args) {
        playWithParentChild(); 
    }

    public static void playWithParentChild() {
        Parent p = new Parent("Xe Oto", "5000 Bitcoin");
        p.showProfile();

        System.out.println("===================================================");

        Child c1 = new Child("Xe May", "1000 Bitcoin");
        c1.showProfile();

        System.out.println("===================================================");

        Parent c2 = new Child("Xe dap", "4000 Bitcoin");
        c2.showProfile();


    }
}
