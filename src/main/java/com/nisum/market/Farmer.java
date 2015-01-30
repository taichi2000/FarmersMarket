package com.nisum.market;

public class Farmer {

    public Fruit sellMeA(String fruitName) {

        Fruit apple = FruitFactory.giveMeAFruit(fruitName);
        //FruitFactory.giveALemon();


        return apple;
    }



}
