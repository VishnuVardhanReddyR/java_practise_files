package com.example.java;

import com.example.java.model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Olive> olives = new ArrayList<>();
//        olives.add(new Olive(OliveName.KALAMATA, OliveColor.PURPLE,3));
//        olives.add(new Olive(OliveName.KALAMATA, OliveColor.PURPLE,3));
//        olives.add(new Olive(OliveName.LIGURIAN,OliveColor.BLACK,2));
//        olives.add(new Olive(OliveName.LIGURIAN,OliveColor.BLACK,2));
//        olives.add(new Olive(OliveName.LIGURIAN,OliveColor.BLACK,2));
//        olives.add(new Olive(OliveName.LIGURIAN,OliveColor.BLACK,2));

        olives.add(new Kalamata());
        olives.add(new Kalamata());
        olives.add(new Ligurian());
        olives.add(new Ligurian());
        olives.add(new Ligurian());
        olives.add(new Ligurian());

        OlivePress press = new OlivePress();
        int totalOil = press.getOil(olives);
        System.out.println("the total oil is : " + totalOil);
    }
}
