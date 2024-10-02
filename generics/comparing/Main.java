package com.prachi.generics.comparing;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student preet = new Student(6, 77.9f);
        Student shelly = new Student(4, 99.9f);
        Student keli = new Student(7, 67.9f);
        Student seema = new Student(3, 56.9f);

        Student[] arr = {preet, shelly, keli, seema};
//        System.out.println(preet.compareTo(shelly));
//        if(preet.compareTo(shelly) < 0){
//            System.out.println("Shelly");
//        }

        System.out.println(Arrays.toString(arr));
        //sort will sort based on marks because we have override the compareTo method using marks only
//        Arrays.sort(arr);

        Arrays.sort(arr, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int)(o1.rollNo - o2.rollNo);
            }
        });
        System.out.println(Arrays.toString(arr));

    }
}
