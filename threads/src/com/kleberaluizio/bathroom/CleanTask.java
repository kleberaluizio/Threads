package com.kleberaluizio.bathroom;

public class CleanTask implements Runnable{

    private Bathroom bathroom;

    public CleanTask(Bathroom bathroom) {
        this.bathroom = bathroom;
    }

    @Override
    public void run() {
        while(true) {
            bathroom.cleanBathroom();
            try {
                Thread.sleep(15000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
