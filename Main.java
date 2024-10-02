package com.prachi;
class Parent{
    public Parent(){
        System.out.println("Default constructor of parent");
    }

    public Parent(int n){
        System.out.println("Para constructor of parent");
    }
}

class Child extends Parent{
    public Child(){
        System.out.println("Default constructor of child");
    }

    public Child(int n){
        super(n);
//        this(); // error
        System.out.println("Para constructor of parent");
    }
}
public class Main {
    public static void main(String[] args) {

        Child c = new Child(9);
//        new Child(); // anonymous obj
    }
}
