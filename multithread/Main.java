package com.prachi.multithread;

//class A implements Runnable{
//    private int threadNumber;
//
//    public A(int threadNumber) {
//        this.threadNumber = threadNumber;
//    }
//
//    public void run(){
//        for(int i=1; i<=10 ; i++) {
//            System.out.println(i + " from " + this.threadNumber);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}
public class Main {
    public static void main(String[] args) {
//        Multithreading thread1 = new Multithreading();
//        Multithreading thread2 = new Multithreading();

        // these will run one by one
//        thread1.run();
//        thread2.run();

        //to run multiple thread simultaneously use .start
//        thread1.start();
//        thread2.start();

//        for(int i=1; i<=3; i++){
//            Multithreading thread3 = new Multithreading(i);
//            thread3.start();

        // To use start() or any Threads method in Runnable obj we have to create Thread
//        Runnable obj1 = new A(1);
//        Runnable obj2 = new A(2);
//
//        Thread t1 = new Thread(obj1);
//        Thread t2 = new Thread(obj2);
//
//        t1.start();
//        t2.start();

        //using lambda expression
        Runnable obj1 = () -> {
            for(int i=1; i<=10 ; i++) {
                System.out.println("hii");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Runnable obj2 = () -> {
            for(int i=1; i<=10 ; i++) {
                System.out.println("hello");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
