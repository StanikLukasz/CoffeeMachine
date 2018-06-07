package com.company;

public class Main {

    public static void main(String[] args) {
        CoffeeMachine machine = new CoffeeMachine();
        //No coins inserted
        System.out.print("1)  ");
        machine.pushButton();

        //Inserting first coin
        System.out.print("2)  ");
        machine.insertCoin();
        //Trying again - coffee not supplied
        System.out.print("3)  ");
        machine.pushButton();

        //Supplying coffee
        System.out.print("4)  ");
        machine.supplyCoffee();
        //Trying again - should work
        System.out.print("5)  ");
        machine.pushButton();
        //Not receiving the coffee


        //Inserting a coin
        System.out.print("6)  ");
        machine.insertCoin();
        //Pushing the button - previous coffee isn't received
        System.out.print("7)  ");
        machine.pushButton();
        //Receiving the coffee
        System.out.print("8)  ");
        machine.receiveCoffee();
        //Pushing the button - previous coffee already received
        System.out.print("9)  ");
        machine.pushButton();

        //Inserting one coin
        System.out.print("10) ");
        machine.insertCoin();
        //Trying to insert another one
        System.out.print("11) ");
        machine.insertCoin();
        //Getting back the coin
        System.out.print("12) ");
        machine.getBackCoin();
        //Inserting now
        System.out.print("13) ");
        machine.insertCoin();

        //Making another 2 coffees (the limit is 4)
        System.out.println("\nBEGIN OF MAKING 2 COFFEES");
        machine.receiveCoffee();
        machine.pushButton();
        machine.receiveCoffee();
        machine.insertCoin();
        machine.pushButton();
        machine.receiveCoffee();
        System.out.println("END OF MAKING 2 COFFEES\n");

        //Trying to get back a non-existing coin
        System.out.print("14) ");
        machine.getBackCoin();

        //Inserting a coin
        System.out.print("15) ");
        machine.insertCoin();
        //Pushing button - the limit of coffees has been already reached
        System.out.print("16) ");
        machine.pushButton();

    }
}
