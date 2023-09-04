package com.java.parentchildv2.main;

import com.java.parentchildv2.data.Child;
import com.java.parentchildv2.data.Parent;

public class App {
    public static void main(String[] args) {
        playWithParentChild(); 
    }

    public static void playWithParentChild() {
        Parent p = new Parent("Xe Oto", "5000 Bitcoin");
        p.showProfile();
    
        System.out.println("===========================================================================================");

        Child c1 = new Child("Xe May", "1000 Bitcoin", "$500USA");
        c1.showProfile();
        c1.sayWithMySelf();
        
        System.out.println("===========================================================================================");

        Parent c2 = new Child("Xe Dap", "4000 Bitcoin", "$1000USA");
        c2.showProfile();

        System.out.println("===========================================================================================");
        
        Child temp = (Child) c2;
        temp.showProfile();
        temp.sayWithMySelf();

        System.out.println("===========================================================================================");

        ((Child)c2).sayWithMySelf();
    }
}
