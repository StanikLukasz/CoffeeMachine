package com.company;

import jdk.internal.org.objectweb.asm.util.CheckAnnotationAdapter;

public class CoffeeMachine {
    private final int CAPACITY=4;

    private Coffee preparedCoffee;
    private boolean coffeeReceived = true;
    private CoinAcceptor acceptor;
    private CoffeeDispatcher dispatcher;


    public CoffeeMachine(){
        acceptor=new CoinAcceptor();
        dispatcher=new CoffeeDispatcher(CAPACITY);
    }

    public void insertCoin(){
        acceptor.insertCoin();
    }

    public void getBackCoin(){
        acceptor.getBackCoin();
    }

    public void supplyCoffee() {
        dispatcher.supplyCoffee();
    }

    public void pushButton(){
        if(!acceptor.isCoinInserted()){
            System.out.println("ERROR - No coin");
        }
        else if(!coffeeReceived){
            System.out.println("ERROR - Previous coffee not received! You have to receive previous one before making another!");
        }
        else if(!dispatcher.isCoffeeRunOut()){
            System.out.println("ERROR - No coffee");
        }
        else{
            acceptor.storeCoin();
            try {
                preparedCoffee=dispatcher.getCoffee();
            }
            catch (NoCoffeeException e) {
                System.out.println("ERROR - No coffee!");
            }
            preparedCoffee.infuse();
            coffeeReceived=false;
            System.out.println("Your coffee is ready! Take it!");
        }
    }

    public Coffee receiveCoffee(){
        coffeeReceived=true;
        System.out.println("Here you are!");
        return preparedCoffee;
    }
}
