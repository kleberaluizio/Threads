package com.kleberaluizio.calculator;

public class PrintString implements Runnable{

    private String sentence;

    public PrintString(String sentence){
        this.sentence = sentence;
    }
    @Override
    public void run() {
        System.out.println(sentence);
    }
}
