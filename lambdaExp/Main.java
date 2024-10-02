package com.prachi.lambdaExp;

interface A{
    void show();
}

//we are defining a class just to call the show method
class Demo implements A{
    @Override
    public void show() {
        System.out.println("Show method ");
    }
}
public class Main {
    public static void main(String[] args) {
//        A obj = new Demo();
//        obj.show();

//        A obj ;
//        obj = new A(){
//            @Override
//            public void show() {
//                System.out.println("show method from A");
//            }
//        };

//      using labmda exp we don't have to make any inner class
        A obj ;
        obj = () -> System.out.println("show method from A");
        obj.show();
    }
}
