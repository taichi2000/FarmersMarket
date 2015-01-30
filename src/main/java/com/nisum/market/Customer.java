package com.nisum.market;

/**
 * Created by german on 30-01-15.
 */
public class Customer {

    private Farmer farmer = new Farmer();
    private Fruit fruit;


    public static void main(String[] args) {
        Customer rafael = new Customer();
        rafael.buyAnApple();
        rafael.eat();
    }

    private void buyAnApple() {
        fruit = farmer.sellMeA("Apple");
    }

    private void eat() {
        fruit.eat();
    }

}
