package com.miage.fr.block;

import com.miage.fr.contrat.Contrat;

import java.util.ArrayList;

public final class ListBlock {
    private static ArrayList<Block> myList = new ArrayList<Block>();
    private static ArrayList<Block> finishedBlock = new ArrayList<Block>();

    public ArrayList<Block> getMyList() {
        return myList;
    }

    public void setMyList(ArrayList<Block> myList) {
        myList = myList;
    }

    public static void addToFinishedBlock(Block block){
        finishedBlock.add(block);
    }

    public static void addToBlock(Contrat pcontrat){

        if (myList.size() == 0) {
            myList.add(new Block());
        }
        if (myList.size() > 0 && myList.get(myList.size() - 1).getNbContrat() < 3)
        {
            Block myblock = myList.get(myList.size()-1);
            myblock.addContrat(pcontrat);
        }
        else
        {
            Blockchain blockchain = new Blockchain(myList.get(myList.size()-1), 4);
            blockchain.mine();
            myList.add(new Block());
            Block myblock = myList.get(myList.size()-1);
            myblock.addContrat(pcontrat);
        }


    }



}
