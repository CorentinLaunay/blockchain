package com.miage.fr.init;


import com.miage.fr.block.Block;
import com.miage.fr.block.Blockchain;
import com.miage.fr.encrypt.Encrypt;

public class Main {

    public static void main(String[] args) {
        String[] contrats = {"Coco vend 1", "Jeje achete 2", "Jeje perd tout"};

        Block block = new Block(contrats, 0);
        Blockchain blockchain = new Blockchain(block, 5);
        blockchain.mine();

    }
}
