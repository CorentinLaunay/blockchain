package com.miage.fr.serveursocket;

import com.miage.fr.user.ListMiner;
import com.miage.fr.user.Miner;

import java.io.*;
import java.net.Socket;

public class ServeurMulti implements Runnable{
    Socket socket;

    public ServeurMulti(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            InputStreamReader isr = new InputStreamReader(socket.getInputStream(), "UTF-8");
            BufferedReader br = new BufferedReader(isr);
            OutputStream os = socket.getOutputStream();
            PrintWriter pw = new PrintWriter(os, true);
            Boolean connectionMsg = true;
            String name = null;
            //pw.println("Please enter your name :");
            while (true) {
                String currLine = br.readLine();
                if (connectionMsg) {
                    name = currLine;
                    System.out.println(name + " just connected to the server !");
                    pw.println("Hello, " + name + " !");
                    connectionMsg = false;
                }
                else if (currLine != null){
                    if (currLine.equals("FINISH")) {
                        System.out.println(name + " : " + currLine + ", connection closed.");
                        pw.println("Succesfully disconnected from server.");
                        socket.close();
                        run();
                    } else {
                        System.out.println(name + " : " + currLine);
                        pw.println("Succesfully sent message.");
                    }
                }
            }
        } catch (IOException e) {

        }
    }
}
