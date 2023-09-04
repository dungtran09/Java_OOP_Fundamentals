package com.java.textmessage.data;

public class TextMessage implements ReadAble {
    private String sender;
    private String content;

    public TextMessage(String sender, String content) {
        this.sender = sender;
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public String getContent() {
        return content;
    }   

    public String read() {
        return this.content;
    }
}
