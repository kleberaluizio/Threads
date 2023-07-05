package com.kleberaluizio.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) throws InterruptedException {

//        List<String> myList = Collections.synchronizedList(new ArrayList<>());
        List<String> myList = new Vector<>();

        for(int i = 0; i<10; i++){
            new Thread(new AddElementTask(myList, i)).start();
        }

        Thread.sleep(2000);

        for(int i = 0; i< myList.size(); i++){
            System.out.println(i + " - " + myList.get (i));
        }
    }
}
