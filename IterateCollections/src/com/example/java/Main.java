package com.example.java;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Ordered data :");
        List<String> list = new ArrayList<>();
        list.add("Hyderabad");
        list.add("Bangalore");
        list.add("Chennai");

        System.out.println("toString() output");
        System.out.println(list);
        System.out.println(" ");

        System.out.println("ArrayList iterator");
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String value = iterator.next();
            System.out.println(value);
        }
        System.out.println(" ");

        System.out.println("ArrayList ForEach");
        for (String value: list){
            System.out.println(value);
        }
        System.out.println(" ");

        System.out.println("java 8 method reference");
        list.forEach(System.out::println);
        System.out.println(" ");

        System.out.println("unordered data");
        Map<String,String> map = new HashMap<>();
        map.put("telangana", "hyderabad");
        map.put("karnataka", "Bangalore");
        map.put("tamil nadu", "chennai");
        System.out.println("to string method");
        System.out.println(map);
        System.out.println(" ");

        System.out.println("Map iterator");
        Set<String> keys = map.keySet();
        Iterator<String> iterator1 = keys.iterator();
        while(iterator1.hasNext()){
            String key = iterator1.next();
            System.out.println("the capital of " + key + " is " + map.get(key));
        }
        System.out.println(" ");

        System.out.println("Map forEach");
        for (String key : keys){
            System.out.println("the capital of " + key + " is " + map.get(key));
        }
        System.out.println(" ");
    }
}
