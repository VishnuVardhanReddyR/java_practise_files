package com.example.java;

import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Locale locale = new Locale("","DK");
	    double doubleValue = 1_234_567.89;
        NumberFormat numF = NumberFormat.getNumberInstance(locale);
        System.out.println("number : " + numF.format(doubleValue));

        NumberFormat curF = NumberFormat.getCurrencyInstance();
        System.out.println("currency : " + curF.format(doubleValue));

        NumberFormat intF = NumberFormat.getIntegerInstance();
        System.out.println("integer : " + intF.format(doubleValue));
    }
}
