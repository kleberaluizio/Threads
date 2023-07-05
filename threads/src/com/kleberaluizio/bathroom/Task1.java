package com.kleberaluizio.bathroom;

public class Task1 implements Runnable{

    private Bathroom bathroom;

    public Task1(Bathroom bathroom) {
        this.bathroom = bathroom;
    }

    @Override
    public void run() {
        bathroom.number1();
    }
}
