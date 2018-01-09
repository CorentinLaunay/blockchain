package com.miage.fr.init;


import com.miage.fr.contrat.Contrat;
import com.miage.fr.user.ListMiner;
import com.miage.fr.user.Miner;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ListMiner.listOfMiners.add(new Miner("Coco", "192.168.1.1:5069"));
        ListMiner.listOfMiners.add(new Miner("Jagut", "192.168.1.2:5069"));
        ListMiner.listOfMiners.add(new Miner("Luke", "192.168.1.3:5069"));
        ListMiner.listOfMiners.add(new Miner("Dje", "192.168.1.4:5069"));
        ListMiner.listOfMiners.add(new Miner("God", "192.168.1.5:5069"));
        ListMiner.listOfMiners.add(new Miner("Father", "192.168.1.6:5069"));


        ArrayList<Contrat> listeContrat = new ArrayList<Contrat>();
        listeContrat.add(new Contrat("Jeremy vend 3 vasques"));
        listeContrat.add(new Contrat("Corentin les recois"));
        listeContrat.add(new Contrat("Luke est pauvre"));
        listeContrat.add(new Contrat("Jeremy vend 3 vasques"));
        listeContrat.add(new Contrat("Corentin les recois"));
        listeContrat.add(new Contrat("Luke est pauvre"));
        listeContrat.add(new Contrat("Jeremy vend 3 vasques"));
        listeContrat.add(new Contrat("Corentin les recois"));
        listeContrat.add(new Contrat("Luke est pauvre"));
        listeContrat.add(new Contrat("Jeremy vend 3 vasques"));
        listeContrat.add(new Contrat("Corentin les recois"));
        listeContrat.add(new Contrat("Luke est pauvre"));
        listeContrat.add(new Contrat("Jeremy vend 3 vasques"));
        listeContrat.add(new Contrat("Corentin les recois"));
        listeContrat.add(new Contrat("Luke est pauvre"));
    }
}
