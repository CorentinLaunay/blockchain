package com.miage.fr.init;


import com.miage.fr.contrat.Contrat;
import com.miage.fr.serveursocket.GenClients;
import com.miage.fr.serveursocket.Repartiteur;
import com.miage.fr.user.ListMiner;
import com.miage.fr.user.Miner;
import io.scalecube.socketio.Session;
import io.scalecube.socketio.SocketIOListener;
import io.scalecube.socketio.SocketIOServer;


import org.apache.commons.lang3.RandomStringUtils;


import java.io.IOException;
import java.io.InputStream;


import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;

public class Main  {

    public static void main(String[] args) throws UnknownHostException {

        new Thread(new Repartiteur(13000), "repartiteur").start();
        ArrayList<GenClients> listclient = new ArrayList<GenClients>();
        listclient.add( new GenClients(InetAddress.getByName("127.0.0.1"), 13000, "test"));
        listclient.add( new GenClients(InetAddress.getByName("127.0.0.1"), 13000, "1523"));



        ArrayList<Contrat> listeContrat = new ArrayList<Contrat>();

        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789~`!@#$%^&*()-_=+[{]}\\|;:\'\",<.>/?";
//        for (int i = 1; i < 15 ; i++)
//        {
//            String pwd = RandomStringUtils.random( 15, characters );
//            listeContrat.add(new Contrat(pwd));
//
//            System.out.println("------------ INDEX = " + i + "------------");
//            System.out.println("------------ GENERATION ------------");
//            System.out.println("------------ CONTRAT = " + pwd + "------------");
//
//        }
//

        listeContrat.add(new Contrat("{\"id\":{\"value\":\"5a54a3025fcad600c0f9406c\"},\"bid\":{\"id\":{\"value\":\"5a50c5de5fcad61e2c5eaeb5\"},\"product\":{\"id\":{\"value\":\"5a4ff81e3ceab4329041e4db\"},\"name\":\"MSI gamer\",\"description\":\"très bonne état... la creme !\",\"owner\":{\"name\":\"valentin\",\"email\":\"testtest@test.com\"},\"cat\":{\"id\":{\"value\":\"5a4ff2ebcc9089327434ed11\"},\"name\":\"Informatique\"}},\"startPrice\":20.36,\"startDate\":{\"dayOfMonth\":6,\"dayOfWeek\":\"SATURDAY\",\"month\":\"JANUARY\",\"year\":2018,\"dayOfYear\":6,\"monthValue\":1,\"hour\":13,\"minute\":49,\"nano\":898000000,\"second\":34,\"chronology\":{\"id\":\"ISO\",\"calendarType\":\"iso8601\"}},\"endDate\":{\"dayOfMonth\":9,\"dayOfWeek\":\"TUESDAY\",\"month\":\"JANUARY\",\"year\":2018,\"dayOfYear\":9,\"monthValue\":1,\"hour\":10,\"minute\":20,\"nano\":0,\"second\":0,\"chronology\":{\"id\":\"ISO\",\"calendarType\":\"iso8601\"}},\"valide\":false},\"user\":{\"name\":\"valentin\",\"email\":\"testtest@test.com\"},\"price\":26.0,\"date\":{\"dayOfMonth\":9,\"dayOfWeek\":\"TUESDAY\",\"month\":\"JANUARY\",\"year\":2018,\"dayOfYear\":9,\"monthValue\":1,\"hour\":12,\"minute\":9,\"nano\":129000000,\"second\":54,\"chronology\":{\"id\":\"ISO\",\"calendarType\":\"iso8601\"}}}"));
        listeContrat.add(new Contrat("{\"id\":{\"value\":\"5a54a3025fcad600c0f9406c\"},\"bid\":{\"id\":{\"value\":\"5a50c5de5fcad61e2c5eaeb5\"},\"product\":{\"id\":{\"value\":\"5a4ff81e3ceab4329041e4db\"},\"name\":\"MSI gamer\",\"description\":\"très bonne état... la creme !\",\"owner\":{\"name\":\"valentin\",\"email\":\"testtest@test.com\"},\"cat\":{\"id\":{\"value\":\"5a4ff2ebcc9089327434ed11\"},\"name\":\"Informatique\"}},\"startPrice\":20.36,\"startDate\":{\"dayOfMonth\":6,\"dayOfWeek\":\"SATURDAY\",\"month\":\"JANUARY\",\"year\":2018,\"dayOfYear\":6,\"monthValue\":1,\"hour\":13,\"minute\":49,\"nano\":898000000,\"second\":34,\"chronology\":{\"id\":\"ISO\",\"calendarType\":\"iso8601\"}},\"endDate\":{\"dayOfMonth\":9,\"dayOfWeek\":\"TUESDAY\",\"month\":\"JANUARY\",\"year\":2018,\"dayOfYear\":9,\"monthValue\":1,\"hour\":10,\"minute\":20,\"nano\":0,\"second\":0,\"chronology\":{\"id\":\"ISO\",\"calendarType\":\"iso8601\"}},\"valide\":false},\"user\":{\"name\":\"valentin\",\"email\":\"testtest@test.com\"},\"price\":26.0,\"date\":{\"dayOfMonth\":9,\"dayOfWeek\":\"TUESDAY\",\"month\":\"JANUARY\",\"year\":2018,\"dayOfYear\":9,\"monthValue\":1,\"hour\":12,\"minute\":9,\"nano\":129000000,\"second\":54,\"chronology\":{\"id\":\"ISO\",\"calendarType\":\"iso8601\"}}}"));
        listeContrat.add(new Contrat("{\"id\":{\"value\":\"5a54a3025fcad600c0f9406c\"},\"bid\":{\"id\":{\"value\":\"5a50c5de5fcad61e2c5eaeb5\"},\"product\":{\"id\":{\"value\":\"5a4ff81e3ceab4329041e4db\"},\"name\":\"MSI gamer\",\"description\":\"très bonne état... la creme !\",\"owner\":{\"name\":\"valentin\",\"email\":\"testtest@test.com\"},\"cat\":{\"id\":{\"value\":\"5a4ff2ebcc9089327434ed11\"},\"name\":\"Informatique\"}},\"startPrice\":20.36,\"startDate\":{\"dayOfMonth\":6,\"dayOfWeek\":\"SATURDAY\",\"month\":\"JANUARY\",\"year\":2018,\"dayOfYear\":6,\"monthValue\":1,\"hour\":13,\"minute\":49,\"nano\":898000000,\"second\":34,\"chronology\":{\"id\":\"ISO\",\"calendarType\":\"iso8601\"}},\"endDate\":{\"dayOfMonth\":9,\"dayOfWeek\":\"TUESDAY\",\"month\":\"JANUARY\",\"year\":2018,\"dayOfYear\":9,\"monthValue\":1,\"hour\":10,\"minute\":20,\"nano\":0,\"second\":0,\"chronology\":{\"id\":\"ISO\",\"calendarType\":\"iso8601\"}},\"valide\":false},\"user\":{\"name\":\"valentin\",\"email\":\"testtest@test.com\"},\"price\":26.0,\"date\":{\"dayOfMonth\":9,\"dayOfWeek\":\"TUESDAY\",\"month\":\"JANUARY\",\"year\":2018,\"dayOfYear\":9,\"monthValue\":1,\"hour\":12,\"minute\":9,\"nano\":129000000,\"second\":54,\"chronology\":{\"id\":\"ISO\",\"calendarType\":\"iso8601\"}}}"));
        listeContrat.add(new Contrat("{\"id\":{\"value\":\"5a54a3025fcad600c0f9406c\"},\"bid\":{\"id\":{\"value\":\"5a50c5de5fcad61e2c5eaeb5\"},\"product\":{\"id\":{\"value\":\"5a4ff81e3ceab4329041e4db\"},\"name\":\"MSI gamer\",\"description\":\"très bonne état... la creme !\",\"owner\":{\"name\":\"valentin\",\"email\":\"testtest@test.com\"},\"cat\":{\"id\":{\"value\":\"5a4ff2ebcc9089327434ed11\"},\"name\":\"Informatique\"}},\"startPrice\":20.36,\"startDate\":{\"dayOfMonth\":6,\"dayOfWeek\":\"SATURDAY\",\"month\":\"JANUARY\",\"year\":2018,\"dayOfYear\":6,\"monthValue\":1,\"hour\":13,\"minute\":49,\"nano\":898000000,\"second\":34,\"chronology\":{\"id\":\"ISO\",\"calendarType\":\"iso8601\"}},\"endDate\":{\"dayOfMonth\":9,\"dayOfWeek\":\"TUESDAY\",\"month\":\"JANUARY\",\"year\":2018,\"dayOfYear\":9,\"monthValue\":1,\"hour\":10,\"minute\":20,\"nano\":0,\"second\":0,\"chronology\":{\"id\":\"ISO\",\"calendarType\":\"iso8601\"}},\"valide\":false},\"user\":{\"name\":\"valentin\",\"email\":\"testtest@test.com\"},\"price\":26.0,\"date\":{\"dayOfMonth\":9,\"dayOfWeek\":\"TUESDAY\",\"month\":\"JANUARY\",\"year\":2018,\"dayOfYear\":9,\"monthValue\":1,\"hour\":12,\"minute\":9,\"nano\":129000000,\"second\":54,\"chronology\":{\"id\":\"ISO\",\"calendarType\":\"iso8601\"}}}"));
        System.out.println("------------ Nombre de bitcoin ------------");
        for (Miner aminer : ListMiner.listOfMiners) {
            System.out.println(aminer.getName() +"||" + aminer.getBitcoins());
        }

    }


}
