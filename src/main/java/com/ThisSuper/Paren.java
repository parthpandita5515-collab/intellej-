package com.ThisSuper;

public class Paren {
    public String name;
    public String date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Paren(String name, String date) {
        this.name = name;
        this.date = date;
    }
}
