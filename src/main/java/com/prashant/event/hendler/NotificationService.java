package com.prashant.event.hendler;

import com.prashant.event.event.DischargeEventPublisher;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class NotificationService {

    @Async
    @EventListener
    public void notification(DischargeEventPublisher dischargeEventPublisher){
        System.out.println(dischargeEventPublisher.getName() + " is discharged...");
    }
}
