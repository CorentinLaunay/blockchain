package com.miage.fr.block;

import com.miage.fr.encrypt.Encrypt;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Blockchain {

    private Block block;
    private int prefixLenght;
    private String encrypted = "";

    public Blockchain(Block block, int prefixLenght){
        this.block = block;
        this.prefixLenght = prefixLenght;
    }

    public void mine(){
        long debut = System.currentTimeMillis();
        System.out.println("Début du minage du block car rempli de contrat");
        String prefix = "";
        long i = 0;
        for(int y=0; y<prefixLenght; y++){
            prefix += "0";
        }
        while (!encrypted.startsWith(prefix)) {
            //Block premier = new Block(contrats, i);
            encrypted = Encrypt.getSha256(block.toString());
            //System.out.println(encrypted);
            block.setIndex(i++);
        }
        ListBlock.addToFinishedBlock(block);
        final GsonBuilder builder = new GsonBuilder();
        final Gson gson = builder.create();

        System.out.println(gson.toJson(block));

        long duree =  (System.currentTimeMillis() - debut);

        System.out.println("TROUVE en i = " + i-- + " Hash = " + encrypted + " En " + duree + " Milliecondes par 192.168.1.1:5069");
        System.out.println("Block " + block.toString() + " --> Sauvegarde dans ListBlock.finishedBlock");
    }
}
