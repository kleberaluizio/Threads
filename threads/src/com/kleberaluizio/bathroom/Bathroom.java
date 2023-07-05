package com.kleberaluizio.bathroom;

public class Bathroom {


    public void number1(){
        String name = Thread.currentThread().getName();
        System.out.println(name + " knocking at the door");

        synchronized (this) { // This is the object Bathroom

            System.out.println(name + " entering the bathroom");
            System.out.println(name + " is fast");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(name + " flushing the toilet");
            System.out.println(name + " washing hands");
            System.out.println(name + " exiting the bathroom");
        }
    }

    public void number2(){
        String name = Thread.currentThread().getName();
        System.out.println(name + " knocking at the door");

        synchronized (this) {

            System.out.println(name + " entering the bathroom");
            System.out.println(name + " is time-consuming");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(name + " flushing the toilet");
            System.out.println(name + " washing hands");
            System.out.println(name + " exiting the bathroom");
        }
    }
}
