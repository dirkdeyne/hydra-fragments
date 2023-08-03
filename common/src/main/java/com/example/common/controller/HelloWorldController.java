package com.example.common.controller;

import io.getmedusa.medusa.core.annotation.UIEventPage;
import io.getmedusa.medusa.core.attributes.Attribute;
import io.getmedusa.medusa.core.session.Session;

import java.util.List;

import static io.getmedusa.medusa.core.attributes.Attribute.$$;

@UIEventPage(path = "/hello", file = "/pages/hello-world")
public class HelloWorldController {

    public List<Attribute> setupAttributes() {
        return $$("counter", 0);
    }

    public List<Attribute> updateCounter(int amount, Session session) {
        final int counter = session.getAttribute("counter");
        System.out.println("counter = " + counter);
        return $$("counter", counter + amount);
    }

}