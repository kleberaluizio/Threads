package com.kleberaluizio;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTask {
    public static void main(String[] args) throws Exception {

        System.out.println("--- Starting Server ---");
        ServerSocket server = new ServerSocket(12345);

        while (true) {
            Socket socket = server.accept();
            System.out.println("New client accepted " + socket.getPort());

            Thread.sleep(20000);
        }
    }
}