package com.example.lanmai.money.model;

/**
 * Created by Lan Mai on 8/10/2016.
 */
public class Expense {
    int id;
    long count;
    String name;
    String date;
    int idGroup;
    int idMonth;

    public Expense(long count, String name, String date, int idGroup, int idMonth) {
        this.count = count;
        this.name = name;
        this.date = date;
        this.idGroup = idGroup;
        this.idMonth = idMonth;
    }
}
