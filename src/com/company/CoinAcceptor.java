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
       if(coinInserted){
           System.out.println("There ie already a coin in the machine!");
       }
       else {
           coinInserted = true;
           System.out.println("Coin inserted");
       }
    }

    public void getBackCoin(){
        if (coinInserted) {
            coinInserted = false;
            System.out.println("Coin returned");
        }
        else {
            System.out.println("ERROR - There is no coin to be returned");
        }
    }

    public void storeCoin(){
        coinInserted=false;
        coinsAmount=coinsAmount+1;
    }
}
