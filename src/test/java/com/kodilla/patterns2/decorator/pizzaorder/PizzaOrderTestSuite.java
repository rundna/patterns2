package com.kodilla.patterns2.decorator.pizzaorder;

import com.kodilla.patterns2.decorator.pizza.BasicPizzaOrder;
import com.kodilla.patterns2.decorator.pizza.ExtraCheeseDecorator;
import com.kodilla.patterns2.decorator.pizza.PizzaOrder;
import com.kodilla.patterns2.decorator.pizza.TunaPizzaOrderDecorator;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testTunaPizzaWithExtraCheeseGetCost() {
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new TunaPizzaOrderDecorator(pizzaOrder);
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        BigDecimal calculatedCost = pizzaOrder.getCost();

        assertEquals(new BigDecimal(37),calculatedCost);

    }
    @Test
    public void testTunaPizzaWithExtraCheeseGetDescription(){
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new TunaPizzaOrderDecorator(pizzaOrder);
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        String description = pizzaOrder.getDescription();
        assertEquals("Pizza base with tomato sauce + cheese with Tuna + extra cheese", description);
    }
}
