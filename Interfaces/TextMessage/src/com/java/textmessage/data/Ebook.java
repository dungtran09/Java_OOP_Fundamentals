package com.java.textmessage.data;

import java.util.ArrayList;

public class Ebook implements ReadAble {
    private String name;
    private ArrayList<String> pages;
    private int pageNumber;

    public Ebook(String name, ArrayList<String> pages) {
        this.name = name;
        this.pages = pages;
        this.pageNumber = 0;
    }

    public String getName() {
        return name;
    }

    public int pages() {
        return this.pages.size();
    }
    
    public String read() {
        String page = this.pages.get(this.pageNumber);
        nexpage();
        return page;
    }

    private void nexpage() {
        this.pageNumber = this.pageNumber + 1;
        if (pageNumber % pages.size() == 0) {
            this.pageNumber = 0;
        }
    }
}
