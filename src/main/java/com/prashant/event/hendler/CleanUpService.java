package com.prashant.event.hendler;

import com.prashant.event.event.DischargeEventPublisher;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class CleanUpService {

    @Async
    @EventListener
    public void cleaning(DischargeEventPublisher eventPublisher){
        System.out.println(eventPublisher.getName() + " is discharged please clean the room...");
    }
}
