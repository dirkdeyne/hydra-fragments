package com.example.common.controller;

import io.getmedusa.medusa.core.annotation.UIEventPage;
import io.getmedusa.medusa.core.attributes.Attribute;
import io.getmedusa.medusa.core.session.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static io.getmedusa.medusa.core.attributes.Attribute.$$;

@UIEventPage(path = "/counter", file = "/pages/fragments/counter")
public class CounterController {

    private static final Logger logger = LoggerFactory.getLogger(CounterController.class);
    public List<Attribute> setupAttributes() {
        return $$("counter", 0);
    }

    public List<Attribute> updateCounter(int amount, Session session) {
        int counter = session.getAttribute("counter");
        counter += amount;
        logger.info("counter is now = " + counter);
        return $$("counter", counter);
    }

}
