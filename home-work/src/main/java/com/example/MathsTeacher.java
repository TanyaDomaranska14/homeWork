package com.example;

public class MathsTeacher implements Teacher {

    private String name = "Ivan Ivanovich";

    @Override
    public String name() {
        return name;
    }

    @Override
    public String toString() {
        return " Is " + name;
    }
}
