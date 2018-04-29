package com.kodilla.patterns2.facade.api;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Facade_watcher {

    private static final Logger LOGGER = LoggerFactory.getLogger(Facade_watcher.class);

    @Before(value = "execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..)) && args(order, userId)")
    public void logEvent(OrderDto order, Long userId){
        LOGGER.info("Order: + " + order.getItems().toArray(), "User: " + userId);

    }

}


