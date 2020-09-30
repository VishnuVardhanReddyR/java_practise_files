package com.example.java;

public class Main {

    public static void main(String[] args) {
	        String str1 = "Hello";
	        String str2 = "Hello";
	        if (str1 == str2){
                System.out.println("they match");
            }
	        else {
                System.out.println("they don't match");
            }
	        String str3 = "hello";
            if (str3 == str2){
                System.out.println("they match");
            }
            else {
                System.out.println("they don't match");
            }
            String part1 = "Hello ";
            String part2 = "WoRld!";
            String str4 = part1 + part2;
            String str5 = "Hello world!";
        if (str4.equalsIgnoreCase(str5)){
            System.out.println("they match");
        }
        else {
            System.out.println("they don't match");
        }
    }
}
