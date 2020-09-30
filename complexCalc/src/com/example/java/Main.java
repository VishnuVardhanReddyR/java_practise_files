package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String s1 = getInput("Enter a numeric value : ");
        String s2 = getInput("Enter a numeric value : ");
        String op = getInput("Choose an operation (+ - * /) : ");
        double result = 0;

        try {
            switch (op) {
                case "+":
                    result = addValues(s1, s2);
                    break;
                case "-":
                    result = subtractValues(s1, s2);
                    break;
                case "*":
                    result = multiplyValues(s1, s2);
                    break;
                case "/":
                    result = divideValues(s1, s2);
                    break;
                default:
                    System.out.println("Unrecognised operation!");
                    return;
            }
            System.out.println("the answer is : " + result);
        }catch(Exception e){
            System.out.println("Number formatting exception " + e.getMessage());
        }
    }

    static String getInput(String prompt){
        System.out.print(prompt);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    static double addValues(String s1, String s2){
        Double d1 = Double.parseDouble(s1);
        Double d2 = Double.parseDouble(s2);

        return d1 + d2;
    }

    static double subtractValues(String s1, String s2){
        Double d1 = Double.parseDouble(s1);
        Double d2 = Double.parseDouble(s2);

        return d1 - d2;
    }

    static double multiplyValues(String s1, String s2){
        Double d1 = Double.parseDouble(s1);
        Double d2 = Double.parseDouble(s2);

        return d1 * d2;
    }

    static double divideValues(String s1, String s2){
        Double d1 = Double.parseDouble(s1);
        Double d2 = Double.parseDouble(s2);

        return d1 / d2;
    }
}
