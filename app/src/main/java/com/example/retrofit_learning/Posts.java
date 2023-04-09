package com.example.retrofit_learning;

import com.google.gson.annotations.SerializedName;

public class Posts {
    private int userId;

    private int id;

    private String title;

    @SerializedName("body") //gson annotation tells that the body part of json is text
    private String text;

    public int getUserId() {
        return userId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }
}
