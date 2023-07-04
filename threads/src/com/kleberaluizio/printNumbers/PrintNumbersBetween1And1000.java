package com.kleberaluizio.printNumbers;

public class PrintNumbersBetween1And1000 implements Runnable{

    @Override
    public void run() {
        for(int i = 1; i<=100 ; i++){
            Thread actualThread = Thread.currentThread();
            System.out.println(actualThread.getId()+ " - " + i);
        }
    }
}
