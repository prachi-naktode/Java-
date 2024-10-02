package com.prachi.multithread;

public class Multithreading extends Thread {

    private int threadNumber;

    public Multithreading(int threadNumber){
        this.threadNumber = threadNumber;
    }

    @Override
    public void run(){
       for(int i=1; i<=10 ; i++){
           System.out.println(i + " from " + this.threadNumber);
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       }
    }
}
