package com.example.java.model;

public class Olive {
    private String name = "Kalamata";
    private long colour = 0x2E0854;       // Indigo or dark purple colour
    private int oil = 3;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getColour() {
        return colour;
    }

    public void setColour(long colour) {
        this.colour = colour;
    }

    public int crush() {
        System.out.println("ouch!");
        return oil;
    }

    public void setOil(int oil) {
        this.oil = oil;
    }
}
