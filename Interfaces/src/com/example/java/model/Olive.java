package com.example.java.model;

public class Olive {
    private OliveName name = OliveName.KALAMATA;
    private OliveColor color = OliveColor.PURPLE;       // Indigo or dark purple colour
    private int oil = 3;

    public Olive(OliveName name, OliveColor color, int oil){
        this.name = name;
        this.color = color;
        this.oil = oil;
    }
    public OliveName getName() {
        return name;
    }

    public void setName(OliveName name) {
        this.name = name;
    }

    public OliveColor getColour() {
        return color;
    }

    public void setColour(OliveColor color) {
        this.color = color;
    }

    public int crush() {
        return oil;
    }

    public void setOil(int oil) {
        this.oil = oil;
    }
}
