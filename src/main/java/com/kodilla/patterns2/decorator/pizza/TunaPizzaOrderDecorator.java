package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class TunaPizzaOrderDecorator extends AbstractPizzaOrderDecorator {

    public TunaPizzaOrderDecorator(PizzaOrder pizzaOrder){
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost(){
        return super.getCost().add(new BigDecimal(17));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with Tuna";
    }
}