package com.java.wrapperclass.main;

public class Main {
    public static void main(String[] args) {
        // playWithInteger();        
        playWithIntegetPoiters();
    }

    public static void playWithInteger() {
        int n = 2003;
        Integer n2 = new Integer("2003");
        Integer n3 = 2003;
        System.out.println(n);
        System.out.println(n2.intValue());
        System.out.println(n3.toString());
        System.out.println(n3);
         
        int n4 = new Integer(2005);
        System.out.println(n4);
    }

    public static void playWithIntegetPoiters() {
        Integer n1 = 2020;
        Integer n2 = 2010;
       
        boolean rs = n1.equals(n2);
        boolean rs1 = n1 == n2;
        int rs2 = n1.compareTo(n2);
        System.out.println(rs);
        System.out.println(rs1);
        System.out.println(rs2);
    }
}
