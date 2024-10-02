package com.prachi.reflection;

class Parent{

}
public class Person extends Parent{
    int age;
    String name;

    public Person(){

    }

    public Person(int age, String name){
        this.age = age;
        this.name = name;
    }

    public void show(){
        System.out.println("name is " + this.name + " age is " + this.age);
    }

    public static void thisIsStaticMethod(){
        System.out.println("This is a public static method");
    }
}
