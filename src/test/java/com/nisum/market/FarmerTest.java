package com.nisum.market;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;


@RunWith(MockitoJUnitRunner.class)
public class FarmerTest {

    private static final String LEMON = "lemon";

    @Mock
    private IFruitFactory fruitFactory;

    @InjectMocks
    private Farmer farmer;


    @Test
    public void shouldSellALemon() throws Exception {
        when(fruitFactory.giveMeAFruit(LEMON)).thenReturn(new Lemon());

        Fruit lemon = farmer.sellMeA(LEMON);

        verify(fruitFactory).giveMeAFruit(LEMON);

        assertTrue(lemon instanceof Lemon);
    }
}