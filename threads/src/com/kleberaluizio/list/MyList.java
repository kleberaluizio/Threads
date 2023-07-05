package com.kleberaluizio.list;

public class MyList {
    private String[] listOfElements = new String[1000];
    private int index = 0;

    public synchronized void addElement(String element) {
        this.listOfElements[index] = element;
        this.index++;

//        try{
//            Thread.sleep(10);
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }

        if(this.index == this.listOfElements.length){
            System.out.println("MyList is full, notifying!");
            this.notify();
        }
    }

    public int size(){
        return this.listOfElements.length;
    }

    public String getElement(int position){
        return this.listOfElements[position];
    }

    public boolean isFull() {

        return this.index == this.size();
    }
}
