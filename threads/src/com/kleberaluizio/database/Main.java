package com.kleberaluizio.database;

public class Main {
    public static void main(String[] args) {
        TransactionManager tm = new TransactionManager();
        ConnectionPool pool = new ConnectionPool();

        new Thread(new DatabaseAccessTask(pool, tm)).start();
        new Thread(new DatabaseAccessProcedureTask(pool, tm)).start();
    }
}
