package com.kleberaluizio.bathroom;

public class Bathroom {

    public boolean isDirty = true;


    private void waitOutsideUntilBathroomIsClear(String name) {
        System.out.println(name + ", this bathroom is disgusting!");
        try {
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void cleanBathroom(){
        String name = Thread.currentThread().getName();
        System.out.println(name + " knocking at the door");
        synchronized (this) { // This is the object Bathroom
            System.out.println(name + " entering the bathroom");

            if (!isDirty){
                System.out.println(name + ", bathroom is clear, I'm leaving!");
                return;
            }

            System.out.println(name + " cleaning the bathroom");

            this.isDirty = false;
            try{
                Thread.sleep(13000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            this.notifyAll();

            System.out.println(name + " exiting the bathroom");

        }
    }
    public void number1(){
        String name = Thread.currentThread().getName();
        System.out.println(name + " knocking at the door");

        synchronized (this) { // This is the object Bathroom

            System.out.println(name + " entering the bathroom");
            while(isDirty){
                waitOutsideUntilBathroomIsClear(name);
            }

            System.out.println(name + " is fast");
            sleepALittle(5000);

            this.isDirty = true;

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
            while(isDirty){
                waitOutsideUntilBathroomIsClear(name);
            }
            System.out.println(name + " is time-consuming");
            sleepALittle(10000);

            this.isDirty = true;

            System.out.println(name + " flushing the toilet");
            System.out.println(name + " washing hands");
            System.out.println(name + " exiting the bathroom");
        }
    }

    private static void sleepALittle(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
