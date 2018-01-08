package com.miage.fr.init;


import com.miage.fr.encrypt.Encrypt;

public class Main {

    public static void main(String[] args) {

        String encrypted = Encrypt.getSha256("test");
        System.out.println(encrypted);
    }
}
