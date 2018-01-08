package com.miage.fr.block;

import java.util.ArrayList;

public class Block {
    private String[] contrat;
    private ArrayList<String> contrats = new ArrayList<>();
    private long index;

    public Block() {
        ArrayList<String> contratSigne = new ArrayList<>();
    }

    public ArrayList getContrat() {
        return contrats;
    }

    public void setContrat(String[] contrat) {
        this.contrat = contrat;
    }

    public long getIndex() {
        return index;
    }

    public void setIndex(long index) {
        this.index = index;
    }

    public int toHash() {
        return this.contrat.hashCode();
    }

    public int getContratSize() { return this.contrat.length;}

    public void addContrat(String pcontrat) {
        contrats.add(pcontrat);
    }

    @Override
    public String toString()
    {
        return getContrat() +""+getIndex();
    }

}
