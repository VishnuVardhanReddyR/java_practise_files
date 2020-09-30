package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a numeric value : ");
        String strNum1 = scanner.nextLine();
        double Num1 = Double.parseDouble(strNum1);

        System.out.println("enter a numeric value : ");
        String strNum2 = scanner.nextLine();
        double Num2 = Double.parseDouble(strNum2);

        double result = Num1 + Num2;
        System.out.println("answer : " + result);

    }
}
