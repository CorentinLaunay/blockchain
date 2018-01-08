package com.miage.fr.init;


import com.miage.fr.block.Block;
import com.miage.fr.block.Blockchain;
import com.miage.fr.encrypt.Encrypt;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Block block = new Block();
        block.addContrat("Contrat 1");
        block.addContrat("Contrat 1");

        Blockchain blockchain = new Blockchain(block, 2);
        blockchain.mine();

    }
}
