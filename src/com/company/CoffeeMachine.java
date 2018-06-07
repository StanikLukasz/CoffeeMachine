package com.company;

import jdk.internal.org.objectweb.asm.util.CheckAnnotationAdapter;

public class CoffeeMachine {
    private final int CAPACITY=10;

    private Coffee preparedCoffee;
    private boolean coffeeReceived;
    private CoinAcceptor acceptor;
    private CoffeeDispatcher dispatcher;


    public CoffeeMachine(){
        acceptor=new CoinAcceptor();
        dispatcher=new CoffeeDispatcher(CAPACITY);
    }

    public void pushButton(){
        if(!acceptor.isCoinInserted()){
            System.out.println("No coin");
        }
        else if(!coffeeReceived){
            System.out.println("Coffee not received");
        }
        else if(!dispatcher.isCoffeeRunOut()){
            System.out.println("No coffee");
        }
        else{
            acceptor.storeCoin();
            preparedCoffee=dispatcher.getCoffee();
            preparedCoffee.infuse();
            coffeeReceived=false;
        }
    }

    public Coffee receiveCoffee(){
        coffeeReceived=true;
        return preparedCoffee;
    }
}
