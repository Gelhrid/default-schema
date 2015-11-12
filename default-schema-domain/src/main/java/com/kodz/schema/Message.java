package com.kodz.schema;

/**
 * Created by michal.kodz on 04-11-2015.
 */
public class Message{
    String name;
    String text;

    public String getText() {
        return text;
    }

    public String getName() {
        return name;
    }

    public Message(String name, String text) {

        this.name = name;
        this.text = text;
    }
}
