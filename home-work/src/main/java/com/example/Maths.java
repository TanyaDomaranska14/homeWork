package com.example;

public class Maths implements Subject {

    private String name = "Maths";

    @Override
    public String toString() {
        return "Subject is " + name;
    }
}
