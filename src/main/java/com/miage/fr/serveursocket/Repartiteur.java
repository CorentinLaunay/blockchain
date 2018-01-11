package com.miage.fr.serveursocket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Repartiteur implements Runnable {
    ServerSocket serverSocket;
    Socket clientSocket = null;
    int port;

    public Repartiteur(int port) {
        this.port = port;
        if (port >= 0 && port <= 65535) {
            try {
                serverSocket = new ServerSocket(port);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    public void run() {
        while(true) {
            try {
                clientSocket = serverSocket.accept();
            } catch (IOException e) {
                e.printStackTrace();
            }
            new Thread(new ServeurMulti(clientSocket), "server").start();
        }
    }
}
