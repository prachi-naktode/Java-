package com.prachi.enumExample;

//import java.lang.classfile.attribute.SyntheticAttribute;

public class Main {
    enum Week{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // public , static and final
        // type is week
        // can not create child enum

        Week(){
            System.out.println("Constructor called for " + this);
        }
        // this is not public or protected  only private or default
        // so that new object is not created

    }
    public static void main(String[] args) {
        Week week;
        week = Week.Friday;

//        for(Week day : Week.values()){
//            System.out.println(day);
//        }
        System.out.println(Week.valueOf("Monday"));
        System.out.println(week.ordinal());
    }
}
