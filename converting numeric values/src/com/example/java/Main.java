package com.example.java;

public class Main {

    public static void main(String[] args) {
        int intValue1 = 56;
        int intValue2 = 42;
        int result1 = intValue1 + intValue2;
        System.out.println("the addition is : " + result1);

        int result2 = intValue1 - intValue2;
        System.out.println("the subtraction is : " + result2);

        int result3 = intValue1 * intValue2;
        System.out.println("the multiplication is : " + result3);

        double result4 = (double) intValue1 / intValue2;
        System.out.println("the division is : " + result4);

        int result5 = intValue1 % intValue2;
        System.out.println("the modulus is : " + result5);

        double doubleValue1 = -3.999999;
        long rounded = Math.round(doubleValue1);
        System.out.println("rounded value is : " + rounded);

        double absValue1 = Math.abs(doubleValue1);
        System.out.println("absValue is : " + absValue1);
    }
}
