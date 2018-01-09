package com.miage.fr.block;

import com.miage.fr.contrat.Contrat;

import java.util.ArrayList;

public class Block {
    private ArrayList<Contrat> contrats = new ArrayList<>();
    private long index;
    private int nbBlock;

    public Block() {
        ArrayList<String> contratSigne = new ArrayList<>();
    }

    public ArrayList getContrats() {
        return contrats;
    }

    public int getNbContrat() { return contrats.size(); }

    public long getIndex() {
        return index;
    }

    public void setIndex(long index) {
        this.index = index;
    }

    public void addContrat(Contrat pcontrat) {
        contrats.add(pcontrat);
    }


    @Override
    public String toString()
    {
        return getContrats() +""+getIndex();
    }

}
