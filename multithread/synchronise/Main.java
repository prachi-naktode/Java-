package com.prachi.multithread.synchronise;

class Counter{
    int count = 0;

    public synchronized void increment() {
        count++;
//        System.out.println(count);
    }
}
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Runnable obj1 = () -> {
            for(int i=1; i<=10000 ; i++) {
                c.increment();
            }
        };
        Runnable obj2 = () -> {
            for(int i=1; i<=10000 ; i++) {
                c.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        // it make sure this thread completes its execution before next instruction
        // it not a good way
        // good way is synchronized
        t1.join();
        t2.join();

        System.out.println(c.count); // here main is not waiting for the threads
    }
}
