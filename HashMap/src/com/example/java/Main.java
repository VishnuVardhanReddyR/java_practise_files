package com.example.java;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Telangana","Hyderabad");
        map.put("Tamil nadu", "Chennai");
        map.put("Karnataka", "Bangalore");
        System.out.println(map);

        map.put("Maharashtra", "Mumbai");
        System.out.println(map);

        String cap = map.get("Telangana");
        System.out.println("capital of Telangana is " + cap);

        map.remove("Telangana");
        System.out.println(map);
    }
}
