package com.example.java;

import com.example.java.model.Olive;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Olive> olives = new ArrayList<>();
//        Olive olive1 = new Olive("Kalamata",0x2E0854,3);
//        olives.add(olive1);
//        Olive olive2 = new Olive("Kalamata",0x2E0854,3);
//        olives.add(olive2);
//        Olive olive3 = new Olive("Olive.LIGURIAN",0x000000,2);
//        olives.add(olive3);

        olives.add(new Olive(Olive.KALAMATA,0x2E0854,3));
        olives.add(new Olive(Olive.KALAMATA,0x2E0854,3));
        olives.add(new Olive(Olive.LIGURIAN,0x000000,2));
        olives.add(new Olive(Olive.LIGURIAN,0x000000,2));
        olives.add(new Olive(Olive.LIGURIAN,0x000000,2));
        olives.add(new Olive(Olive.LIGURIAN,0x000000,2));

        OlivePress press = new OlivePress();
        int totalOil = press.getOil(olives);
        System.out.println("the total oil is : " + totalOil);
    }
}
