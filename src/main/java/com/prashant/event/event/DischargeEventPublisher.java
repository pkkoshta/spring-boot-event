package com.prashant.event.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

public class DischargeEventPublisher extends ApplicationEvent {

    private String id;
    private String name;


    public DischargeEventPublisher(Object source, String id, String name) {
        super(source);
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
