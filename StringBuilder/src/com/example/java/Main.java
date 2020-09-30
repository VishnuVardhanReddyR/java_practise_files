package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + ", " + str2 + "!";
        System.out.println(str3);

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(", ");
        sb.append("world");
        sb.append("!");
        System.out.println(sb);

        StringBuilder sb1 = new StringBuilder("Hello")
                            .append(", ")
                            .append("world")
                            .append("!");
        System.out.println(sb1);

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value : ");
        String input = sc.nextLine();
        System.out.println(input);

        sb.delete(0, sb.length());
        for (int i=0; i < 3; i++){
            input = sc.nextLine();
            sb.append(input + "\n" );
        }
        System.out.println(sb);
    }
}
