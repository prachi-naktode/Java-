package com.prachi.dateTimeAPI;

import java.time.*;

public class Main {
    public static void main(String[] args) {
//        LocalDate d = LocalDate.now(); //2024-09-28
//        LocalDate d = LocalDate.of(2000, Month.NOVEMBER,39); // invalid for date
//        System.out.println(d);

//        LocalTime t = LocalTime.now();
//        for(String s : ZoneId.getAvailableZoneIds()){
//            System.out.println(s);
//        }
//        LocalTime t = LocalTime.now(ZoneId.of("GMT"));
//        System.out.println(t);

        Instant i = Instant.now(); // give GMT time
        System.out.println(i);
    }
}
