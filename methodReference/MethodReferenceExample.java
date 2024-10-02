package com.prachi.methodReference;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceExample {
    public static void main(String[] args) {
        List<String> arr = Arrays.asList("00", "ii", "pp");

        //calling static method
//        arr.forEach(MethodReferenceExample :: print);

        //instance method of obj
//        MethodReferenceExample obj = new MethodReferenceExample();
//        arr.forEach(obj :: print);

        //Arbitrary obj
        arr.forEach(String::toUpperCase);
        arr.forEach(System.out::println);


    }

//    public static void print(Integer n){
//        System.out.println(n);
//    }
    public MethodReferenceExample(){
        System.out.println("this is constructor");
    }
    public void print(String s){
        System.out.println(s);
    }
}
