package com.company;

public class CoinAcceptor {
    private boolean coinInserted=false;
    private int coinsAmount=0;

    public CoinAcceptor(){

    }

    public boolean isCoinInserted(){
        return coinInserted;
    }

    public void insertCoin(){
        coinInserted=true;
        System.out.println("Coin inserted");
    }

    public void getBackCoin(){
        coinInserted=false;
        System.out.println("Coin returned");
    }

    public void storeCoin(){
        coinInserted=false;
        coinsAmount=coinsAmount+1;
    }
}
