package com.kleberaluizio.database;

public class ConnectionPool{

    public String getConnection(){
        System.out.println("Lending connection");
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return "connection";
    }
}
