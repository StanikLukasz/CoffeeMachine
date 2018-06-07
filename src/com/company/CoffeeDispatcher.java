package com.company;

public class CoffeeDispatcher {
    private int capacity;
    private int coffeeAmount;

    public CoffeeDispatcher(int capacity){
        this.capacity=capacity;
    }

    public boolean isCoffeeRunOut(){
        return coffeeAmount>0;
    }

    public Coffee getCoffee() throws NoCoffeeException {
        if(coffeeAmount!=0){
            coffeeAmount--;
            return new Coffee();
        }
        else{
            throw new NoCoffeeException();
        }
    }

    public void supplyCoffee(){
        coffeeAmount=capacity;
        System.out.println("Coffee supplied");
    }
}
