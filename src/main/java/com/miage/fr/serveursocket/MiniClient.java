package com.miage.fr.serveursocket;

import com.miage.fr.user.ListMiner;
import com.miage.fr.user.Miner;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class MiniClient implements Runnable{
    InetAddress ip;
    int port;
    String name;
    int nbMsg;

    public MiniClient(InetAddress ipaddr, int portnum, String cliname) {
        this.ip = ipaddr;
        this.port = portnum;
        this.name = cliname;
        ListMiner.listOfMiners.add(new Miner(name, ip.toString()));
    }

    public MiniClient(InetAddress ipaddr, int portnum, String cliname, int nbMsg) {
        this.ip = ipaddr;
        this.port = portnum;
        this.name = cliname;
        this.nbMsg = nbMsg;

    }

    public void connect() {
        try {
            Socket socket = new Socket(ip, port);
            OutputStream os = socket.getOutputStream();
            PrintWriter pw = new PrintWriter(os, true);
            InputStreamReader isr = new InputStreamReader(socket.getInputStream(), "UTF-8");
            BufferedReader br = new BufferedReader(isr);
            String currline;
            pw.println(name);
            System.out.println(br.readLine());
            while (true){
                BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                pw.println(in.readLine());
                currline = br.readLine();
                System.out.println(currline);
                if(currline.equals("Succesfully disconnected from server.")) {
                    socket.close();
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        try {
            Socket socket = new Socket(ip, port);
            OutputStream os = socket.getOutputStream();
            PrintWriter pw = new PrintWriter(os, true);
            pw.println(name);
            pw.println(ip +" :: " + name);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
