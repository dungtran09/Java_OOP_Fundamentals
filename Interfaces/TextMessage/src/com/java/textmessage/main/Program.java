package com.java.textmessage.main;

import java.util.ArrayList;

import com.java.textmessage.data.Ebook;
import com.java.textmessage.data.ReadAble;
import com.java.textmessage.data.TextMessage;

public class Program {
    public static void main(String[] args) {

        ArrayList<ReadAble> readingList = new ArrayList<>();

        readingList.add(new TextMessage("ope", "never been programming before..."));
        readingList.add(new TextMessage("ope", "gonna love it i think!"));
        readingList.add(new TextMessage("ope", "give me something more challenging! :)"));
        readingList.add(new TextMessage("ope", "you think i can do it?"));
        readingList.add(new TextMessage("ope", "up here we send several messages each day"));
         
        ArrayList<String> pages = new ArrayList<>();
        pages.add("A method call itself!");
        readingList.add(new Ebook("Introduction to Recursion", pages));

        for (ReadAble readAble : readingList) {
            System.out.println(readAble.read());
        }
    }
    
}
