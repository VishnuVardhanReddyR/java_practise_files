package com.example.java;

import com.example.java.model.*;

import java.util.ArrayList;
import java.util.List;

/**
 * This is an <b>Olive</b> application, and its job is to <i>press olives</i>!!
 */

public class Main {

    /**
     *
     * @param args - an array of strings
     */
    public static void main(String[] args) {
        List<Olive> olives = new ArrayList<>();

        olives.add(new Kalamata());
        olives.add(new Kalamata());
        olives.add(new Ligurian());
        olives.add(new Ligurian());
        olives.add(new Ligurian());
        olives.add(new Ligurian());

        Press press = new OlivePress();
        press.setOil(5);
        int totalOil = press.getOil(olives);
        System.out.println("You got " + totalOil + " units of oil");

    }
}
