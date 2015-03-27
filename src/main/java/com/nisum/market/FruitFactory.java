package com.nisum.market;


import org.apache.commons.beanutils.PropertyUtils;

import java.net.URL;
import java.util.Properties;
import java.util.ResourceBundle;


public class FruitFactory {

    Properties fruits;

    public FruitFactory() throws Exception{
       init();
    }

    private void init() throws Exception {
        fruits = new Properties();

        URL url = FruitFactory.class.getResource("/fruits.properties");

        fruits.load(url.openStream());

        System.out.println(fruits.entrySet());
    }

    public Fruit giveMeAFruit(String fruitName) throws Exception {
        if (fruits.containsKey(fruitName)){
            String className = fruits.getProperty(fruitName);
            return (Fruit) Class.forName(className).newInstance();
        }

        return null;
    }


    public static void main(String[] args) throws Exception {
        new FruitFactory();
    }
}
