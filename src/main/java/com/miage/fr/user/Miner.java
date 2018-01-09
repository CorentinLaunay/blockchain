package com.miage.fr.user;

/**
 * Created by jagut on 09/01/2018.
 */
public class Miner {

    private String name;
    private String ip;
    private float bitcoins;
    private long mineIndex;

    public String getName() {
        return name;
    }

    public String getIp() {
        return ip;
    }

    public long getMineIndex() {
        return mineIndex;
    }

    public void setMineIndex(long mineIndex) {
        this.mineIndex = mineIndex;
    }

    public Miner(String name, String ip){
        this.name = name;
        this.ip = ip;
        this.mineIndex = 0;
    }

}
