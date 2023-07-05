package com.kleberaluizio.list;

public class MyList {
    private String[] listOfElements = new String[1000];
    private int index = 0;

    public synchronized void addElement(String element) {
        this.listOfElements[index] = element;
        this.index++;
    }

    public int size(){
        return this.listOfElements.length;
    }

    public String getElement(int position){
        return this.listOfElements[position];
    }
}
