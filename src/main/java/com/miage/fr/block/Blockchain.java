package com.miage.fr.block;

import com.miage.fr.encrypt.Encrypt;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.miage.fr.user.ListMiner;
import com.miage.fr.user.Miner;

import java.util.Random;

public class Blockchain {

    private Block block;
    private int prefixLenght;
    private String encrypted = "";
    private boolean finish = false;
    private String prefix = "";
    private Miner winner = null;

    public Blockchain(Block block, int prefixLenght){
        this.block = block;
        this.prefixLenght = prefixLenght;
    }

    public void mineWith(Miner miner){
        miner.setMineIndex(miner.getMineIndex()+1);
        block.setIndex(miner.getMineIndex());
        encrypted = Encrypt.getSha256(block.toString());
        if(encrypted.startsWith(prefix)){
            finish = true;
            winner = miner;
            miner.setBitcoins(miner.getBitcoins()+1);
        }
    }

    public void mine(){
        long debut = System.currentTimeMillis();
        System.out.println("Début du minage du block car rempli de contrat");
        long i = 0;
        for(int y=0; y<prefixLenght; y++){
            prefix += "0";
        }
        Random rnd = new Random();
        for (Miner miner : ListMiner.listOfMiners) {
            miner.setMineIndex(rnd.nextLong());
        }
        while (!encrypted.startsWith(prefix)) {
            for (Miner miner : ListMiner.listOfMiners) {

                if(!finish) {
                    mineWith(miner);
                }
            }
        }
        ListBlock.addToFinishedBlock(block);
        final GsonBuilder builder = new GsonBuilder();
        final Gson gson = builder.create();

        System.out.println(gson.toJson(block));

        long duree =  (System.currentTimeMillis() - debut);

        System.out.println("TROUVE en i = " + winner.getMineIndex() + " Hash = " + encrypted + " En " + duree + " Milliecondes par " + winner.getName() + " (" + winner.getIp() + ")");
        System.out.println("Block " + block.toString() + " --> Sauvegarde dans ListBlock.finishedBlock");
    }
}
