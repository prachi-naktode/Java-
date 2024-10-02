package com.prachi.cloning;

public class Human implements Cloneable{
    int age;
    String name;
    int[] arr;

    public Human(int age, String name, int[] arr){
        this.age = age;
        this.name = name;
        this.arr = arr;
    }

    public Human(Human obj){
        this.age = obj.age;
        this.name = obj.name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        //shallow copy
//        return super.clone();

        //deep copy
        Human temp = (Human)super.clone(); // this is shallow copy

        //making deep copy
//        temp.arr = new int[temp.arr.length];
//        for(int i=0; i<temp.arr.length; i++){
//            temp.arr[i] = this.arr[i];
//        }
        temp.arr = this.arr.clone();

        return temp;
    }
}
