package com.kleberaluizio;

import java.net.Socket;
import java.util.Scanner;

public class DistributeTask implements Runnable{
    private Socket socket;

    public DistributeTask(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {

        try {

        System.out.println("Distributing tasks to " + socket);

        Scanner inputClient = new Scanner(socket.getInputStream());

        while(inputClient.hasNextLine()){
            String command = inputClient.nextLine();
            System.out.println(command);
        }
        inputClient.close();
        
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
