package com.example.java.utilities;

public class MathHelper {
    public static double addValues(String s1, String s2){
        Double d1 = Double.parseDouble(s1);
        Double d2 = Double.parseDouble(s2);

        return d1 + d2;
    }

    public static double subtractValues(String s1, String s2){
        Double d1 = Double.parseDouble(s1);
        Double d2 = Double.parseDouble(s2);

        return d1 - d2;
    }

    public static double multiplyValues(String s1, String s2){
        Double d1 = Double.parseDouble(s1);
        Double d2 = Double.parseDouble(s2);

        return d1 * d2;
    }

    public static double divideValues(String s1, String s2){
        Double d1 = Double.parseDouble(s1);
        Double d2 = Double.parseDouble(s2);

        return d1 / d2;
    }
}
