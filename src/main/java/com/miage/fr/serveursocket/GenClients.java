package com.miage.fr.serveursocket;

import com.miage.fr.user.ListMiner;

import java.net.InetAddress;


public class GenClients {
    int nbCli;
    int nbMsg;
    InetAddress ip;
    int port;
    String name;

    public GenClients(InetAddress ip, int port, String name) {

        this.ip = ip;
        this.port = port;
        this.name = name;
        new Thread(new MiniClient(ip, port, name)).start();
    }
}
