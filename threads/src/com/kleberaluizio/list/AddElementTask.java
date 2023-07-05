package com.kleberaluizio.list;

import java.util.List;

public class AddElementTask implements Runnable {

    private MyList myList;
    private int threadNumber;

    public AddElementTask(MyList myList, int threadNumber) {
        this.myList = myList;
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for(int i = 0; i<100; i++){
            myList.addElement("Thread " + threadNumber + " - " + i);
        }
    }
}
