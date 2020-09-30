package com.example.java.model;

public class Olive {
    private String name = "Kalamata";
    private long color = 0x2E0854;       // Indigo or dark purple colour
    private int oil = 3;

    public Olive(){}
    public Olive(String name, long color, int oil){
        this.name = name;
        this.color = color;
        this.oil = oil;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getColour() {
        return color;
    }

    public void setColour(long color) {
        this.color = color;
    }

    public int crush() {
        System.out.println("ouch!");
        return oil;
    }

    public void setOil(int oil) {
        this.oil = oil;
    }
}
