package com.example.java;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        Date d = new Date();
        System.out.println("d = "+d);

        GregorianCalendar gc = new GregorianCalendar(2009,1,28);
        gc.add(GregorianCalendar.DATE, 1);
        Date d2 = gc.getTime();
        System.out.println("d2 = " + d2);

        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(df.format(d2) + "," + df.format(d));

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("ldt = " + ldt);

        LocalDate ld = LocalDate.of(2009,1,28);
        System.out.println("ld = " + ld);

        DateTimeFormatter dtf = DateTimeFormatter.ISO_DATE;
        System.out.println("dtf Iso_date format = " + dtf.format(ld));

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("M/d/yyyy");
        System.out.println("ofPattern method = " + dtf1.format(ld));
    }
}
