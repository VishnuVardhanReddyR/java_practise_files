package com.example.java;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hyderabad");
        list.add("Bangalore");
        list.add("chennai");
        System.out.println(list);

        list.add("delhi");
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        String city = list.get(1);
        System.out.println("the second item is : " + city);

        int pos = list.indexOf("chennai");
        System.out.println("chennai is at position : " + pos);

    }
}
