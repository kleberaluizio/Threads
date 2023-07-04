package com.kleberaluizio.calculator;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("This is the main thread");

        String sentenceToBePrintByThread = "This is a new thread created in other to print a sentence in console";
        Runnable printString = new PrintString(sentenceToBePrintByThread);
        Thread newThread = new Thread(printString, "Printing Thread");
        newThread.start();

        // Different way to achieve the same goal. Using Anonymous Class

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Second Thread: " + sentenceToBePrintByThread);
            }
        }).start();
    }
}