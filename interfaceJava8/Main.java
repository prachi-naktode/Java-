package com.prachi.interfaceJava8;

interface A{
    void call();
    default void show(){
        System.out.println("show method from interface A");
    }

    static void ThisIsStatic(){
        System.out.println("Static method in A");
    }

    default void defaultMethod(){
        System.out.println("This is default method only in A which we don not have to override");
    }
}

interface B{
    void call();
    default void show(){
        System.out.println("show method from interface B");
    }
    static void ThisIsStatic(){
        System.out.println("Static method in B");
    }
}

class Demo implements A, B{

    @Override
    public void call() {
        System.out.println("call function from demo class");
    }

    //if we do not override it , it will give error because method is defined in both interfaces
    @Override
    public void show() {
        A.super.show();
        B.super.show();
        System.out.println("show method from class Demo");
    }
}
public class Main {
    public static void main(String[] args) {
        Demo d = new Demo();
//        d.call();
//        d.show();

        A.ThisIsStatic();
        B.ThisIsStatic();
    }
}
