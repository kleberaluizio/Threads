package com.kleberaluizio;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ClientTask {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost",12345);
        System.out.println("Connection established");

        Scanner keyboard = new Scanner(System.in);
        keyboard.nextLine();
        socket.close();
    }
}
