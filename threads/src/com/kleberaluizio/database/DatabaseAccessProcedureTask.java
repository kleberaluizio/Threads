package com.kleberaluizio.database;

public class DatabaseAccessProcedureTask implements Runnable {

    private final ConnectionPool pool;
    private final TransactionManager tm;

    public DatabaseAccessProcedureTask(ConnectionPool pool, TransactionManager tm) {
        this.pool = pool;
        this.tm = tm;
    }

    @Override
    public void run() {

        synchronized (pool){
            System.out.println("Starting the tm");
            tm.begin();
            synchronized (tm){
                System.out.println("I took the pool's lock!");
                pool.getConnection();
            }

        }
    }
}
