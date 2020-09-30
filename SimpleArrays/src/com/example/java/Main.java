package com.example.java;

public class Main {

    public static void main(String[] args) {
        System.out.println("Array of primitives");
        int[] ints = {10,20,30};
        for (int i=0;i < ints.length;i++){
            System.out.println(ints[i]);
        }

        System.out.println("Array of Strings");
        String[] s = {"red","green","blue"};
        for(String value : s){
            System.out.println(value);
        }
        System.out.println("Setting an initial size");
        int[] sized = new int[10];
        for(int i=0; i < sized.length; i++){
            sized[i] = i * 100;
        }
        for (int value: sized){
            System.out.println(value);
        }

        System.out.println("copying an Array");
        int[] copy = new int[5];
        System.arraycopy(sized,5,copy,0,5);
        for(int value : copy){
            System.out.println(value);
        }
    }
}
