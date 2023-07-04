package com.kleberaluizio.bathroom;

public class Bathroom {


    public void number1(){
        System.out.println("Entering the bathroom");
        System.out.println("It's fast");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Flushing the toilet");
        System.out.println("Washing hands");
        System.out.println("Exiting the bathroom");
    }

    public void number2(){
        System.out.println("Entering the bathroom");
        System.out.println("It's time-consuming");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Flushing the toilet");
        System.out.println("Washing hands");
        System.out.println("Exiting the bathroom");
    }
}
