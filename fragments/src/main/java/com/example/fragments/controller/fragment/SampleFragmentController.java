package com.example.fragments.controller.fragment;

import io.getmedusa.medusa.core.annotation.UIEventPage;
import io.getmedusa.medusa.core.attributes.Attribute;
import io.getmedusa.medusa.core.bidirectional.ServerToClient;
import io.getmedusa.medusa.core.session.StandardSessionTagKeys;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import static io.getmedusa.medusa.core.attributes.Attribute.$$;

@UIEventPage(path = "/sample", file = "/pages/fragments/sample")
@EnableScheduling
public class SampleFragmentController {

    final ServerToClient serverToClient;

    final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");

    public SampleFragmentController(ServerToClient serverToClient) {
        this.serverToClient = serverToClient;
    }

    public List<Attribute> setupAttributes() {
        return $$("date", getCurrentDate());
    }


    private String getCurrentDate() {
        return dtf.format(LocalTime.now());
    }

}