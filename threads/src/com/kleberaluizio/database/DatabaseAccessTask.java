package com.kleberaluizio.database;

public class DatabaseAccessTask implements Runnable {

    private ConnectionPool pool;
    private TransactionManager tm;

    public DatabaseAccessTask(ConnectionPool pool, TransactionManager tm) {
        this.pool = pool;
        this.tm = tm;
    }

    @Override
    public void run() {

        synchronized (pool){
            System.out.println("I took the pool's lock!");
            pool.getConnection();

            synchronized (tm){
                System.out.println("Starting to manage the tm");
                tm.begin();
            }
        }

    }
}
