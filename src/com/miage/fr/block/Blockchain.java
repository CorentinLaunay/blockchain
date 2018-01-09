package com.miage.fr.block;

import com.miage.fr.encrypt.Encrypt;

/**
 * Created by jagut on 08/01/2018.
 */
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
        long duree =  (System.currentTimeMillis() - debut);
        System.out.println("TROUVE en i = " + i-- + " Hash = " + encrypted + " En " + duree + " Milliecondes");
    }
}
