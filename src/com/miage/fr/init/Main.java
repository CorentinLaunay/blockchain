package com.miage.fr.init;


import com.miage.fr.block.Block;
import com.miage.fr.encrypt.Encrypt;

public class Main {

    public static void main(String[] args) {
        String[] contrats = {"Coco vend 1", "Jeje achete 2", "Jeje perd tout"};


        for (int i = 0; i < 150; i++){
            Block premier = new Block(contrats, i);
            String encrypted = Encrypt.getSha256(premier.toString());
            System.out.println(encrypted);
        }

    }
}
