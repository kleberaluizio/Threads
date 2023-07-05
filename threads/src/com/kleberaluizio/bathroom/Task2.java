package com.kleberaluizio.bathroom;

public class Task2 implements Runnable{

    private Bathroom bathroom;

    public Task2(Bathroom bathroom) {
        this.bathroom = bathroom;
    }

    @Override
    public void run() {
        bathroom.number2();
    }
}
