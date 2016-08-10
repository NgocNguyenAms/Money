package com.example.lanmai.money.model;

import android.media.Image;

/**
 * Created by Lan Mai on 8/10/2016.
 */
public class Group {
    int id;
    String name;
    Image image;

    public Group(String name, Image image) {
        this.name = name;
        this.image = image;
    }

}
