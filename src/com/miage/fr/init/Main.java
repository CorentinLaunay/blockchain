package com.miage.fr.init;


import com.miage.fr.block.Block;
import com.miage.fr.encrypt.Encrypt;

public class Main {

    public static void main(String[] args) {
        String[] contrats = {"Coco vend 1", "Jeje achete 2", "Jeje perd tout"};


        Block premier = new Block(contrats, 1);

        premier.toHash();



        String encrypted = Encrypt.getSha256("test");
        System.out.println(encrypted);
    }
}
