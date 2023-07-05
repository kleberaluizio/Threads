package com.kleberaluizio.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) throws InterruptedException {

//        List<String> myList = Collections.synchronizedList(new ArrayList<>());
        MyList myList = new MyList();

        for(int i = 0; i<10; i++){
            new Thread(new AddElementTask(myList, i)).start();
        }

        new Thread( new PrintListTask(myList)).start();

    }
}
