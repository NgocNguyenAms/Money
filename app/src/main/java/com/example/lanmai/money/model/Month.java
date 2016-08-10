package com.example.lanmai.money.model;

/**
 * Created by Lan Mai on 8/10/2016.
 */
public class Month {
    int id;
    String name;
    long input;
    long output;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getInput() {
        return input;
    }

    public void setInput(long input) {
        this.input = input;
    }

    public long getOutput() {
        return output;
    }

    public void setOutput(long output) {
        this.output = output;
    }
}
