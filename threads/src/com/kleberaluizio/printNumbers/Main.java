package com.kleberaluizio.printNumbers;

public class Main {

    public static void main(String[] args) {

        new Thread(new PrintNumbersBetween1And1000()).start();
        new Thread(new PrintNumbersBetween1And1000()).start();


    }
}
