package com.miage.fr.block;

public class Block {
    private String[] contrat;
    private int index;

    public Block(String[] pcontrat, int pindex) {
        this.contrat = pcontrat;
        this.index = pindex;
    }

    public String[] getContrat() {
        return contrat;
    }

    public void setContrat(String[] contrat) {
        this.contrat = contrat;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void toHash() {
        System.out.println(this.contrat.hashCode());
    }
}
