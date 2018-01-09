package com.miage.fr.init;


import com.miage.fr.block.Block;
import com.miage.fr.block.Blockchain;
import com.miage.fr.block.ListBlock;
import com.miage.fr.contrat.Contrat;
import com.miage.fr.encrypt.Encrypt;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ListBlock myBlockList = new ListBlock();
        ArrayList<Contrat> listeContrat = new ArrayList<>();
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
