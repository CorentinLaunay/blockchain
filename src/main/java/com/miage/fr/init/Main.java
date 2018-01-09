package com.miage.fr.init;


import com.miage.fr.contrat.Contrat;
import com.miage.fr.user.ListMiner;
import com.miage.fr.user.Miner;
import org.apache.commons.lang3.RandomStringUtils;

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

        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789~`!@#$%^&*()-_=+[{]}\\|;:\'\",<.>/?";
        for (int i = 1; i < 15 ; i++)
        {
            String pwd = RandomStringUtils.random( 15, characters );
            listeContrat.add(new Contrat(pwd));

            System.out.println("------------ INDEX = " + i + "------------");
            System.out.println("------------ GENERATION ------------");
            System.out.println("------------ CONTRAT = " + pwd + "------------");

        }

        System.out.println("------------ Nombre de bitcoin ------------");

        for (Miner aminer : ListMiner.listOfMiners) {
            System.out.println(aminer.getName() +"||" + aminer.getBitcoins());
        }
    }

}
