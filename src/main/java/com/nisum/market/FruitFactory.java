package com.nisum.market;


public class FruitFactory {

    public FruitFactory(String config){
       init(config);
    }

    private void init(String config) {

    }

    public static Fruit giveMeAFruit(String fruitName) {
        if ("apple".equals(fruitName)){
            return new Apple();
        }

        return null;
    }
}
