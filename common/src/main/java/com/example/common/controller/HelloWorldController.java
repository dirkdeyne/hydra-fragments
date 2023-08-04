package com.example.common.controller;

import io.getmedusa.medusa.core.annotation.UIEventPage;
import io.getmedusa.medusa.core.attributes.Attribute;
import io.getmedusa.medusa.core.session.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.format.annotation.DateTimeFormat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import static io.getmedusa.medusa.core.attributes.Attribute.$$;

@UIEventPage(path = "/hello", file = "/pages/hello-world")
public class HelloWorldController {
    private static final Logger logger = LoggerFactory.getLogger(HelloWorldController.class);
    private final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm.SS");

    public List<Attribute> setupAttributes() {
        return $$("date", date());
    }

    public List<Attribute> refreshDate() {
        String date = date();
        logger.info("date is now: " + date);
        return $$("date", date);
    }

    private String date() {
        return simpleDateFormat.format(new Date());
    }

}