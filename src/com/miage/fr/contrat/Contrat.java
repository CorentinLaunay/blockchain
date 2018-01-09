package com.miage.fr.contrat;

import com.miage.fr.block.ListBlock;

public class Contrat {
    private String name;

    public Contrat(String pname) {
        this.name = pname;
        ListBlock.addToBlock(this);
    }

    public String getName(){
        return this.name;
    }
}
