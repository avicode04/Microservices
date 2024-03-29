package com.stackroute.Movie.seed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class ApplicationStartupListener implements ApplicationListener<ContextRefreshedEvent> {

    private EventHolderBean eventHolderBean;
    @Autowired
    public void setEventHolderBean(EventHolderBean eventHolderBean){
        this.eventHolderBean=eventHolderBean;
    }


    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        System.out.println("Context Event Received");
        eventHolderBean.setEventFired(true);
    }
}