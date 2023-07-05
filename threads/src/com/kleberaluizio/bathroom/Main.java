package com.kleberaluizio.bathroom;

public class Main {
    public static void main(String[] args) {
        Bathroom bathroom = new Bathroom();

        Thread person1 = new Thread(new Task1(bathroom),"Joe");
        Thread person2 = new Thread(new Task2(bathroom),"Ross");
        Thread cleaner =  new Thread(new CleanTask(bathroom),"Cleaner");
        cleaner.setDaemon(true);
//        Thread person3 = new Thread(new Task1(bathroom),"Chandler");
//        Thread person4 = new Thread(new Task2(bathroom),"Rachel");

        person1.start();
        cleaner.start();
        person2.start();
//        person3.start();
//        person4.start();
    }
}
