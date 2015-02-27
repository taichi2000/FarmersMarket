package com.nisum.market;


public class Farmer {

    private IFruitFactory fruitFactory;


    public Fruit sellMeA(String fruitName) {
        Fruit fruit = fruitFactory.giveMeAFruit(fruitName);

        return fruit;
    }


    public IFruitFactory getFruitFactory() {
        return fruitFactory;
    }


    public void setFruitFactory(IFruitFactory fruitFactory) {
        this.fruitFactory = fruitFactory;
    }
}
