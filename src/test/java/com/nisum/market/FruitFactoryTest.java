package com.nisum.market;


import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertNull;
import static junit.framework.TestCase.assertTrue;


public class FruitFactoryTest {

    @Test
    public void shouldReturnAnOrange() throws Exception {
        FruitFactory factory = new FruitFactory();

        Fruit orange = factory.giveMeAFruit("orange");

        assertNotNull(orange);
        assertTrue(orange instanceof Orange);
    }

    @Test
    public void shouldReturnWhenFruitDoesNotExist() throws Exception {
        FruitFactory factory = new FruitFactory();

        Fruit failedFruit = factory.giveMeAFruit("Some not found Fruit");

        assertNull(failedFruit);
    }
}